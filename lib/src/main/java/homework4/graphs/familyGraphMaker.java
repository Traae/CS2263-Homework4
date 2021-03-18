/**
 * This class uses the google's network graph builder to create
 * a graph using people as nodes and relationships as edges.
 *
 * This class is also implements a singleton pattern for the sake of practice.
 *
 * As a result this class is a mess, so I'm going to just hard code all of my graph data
 * while I'm at it and make it really really bad.
 *
 * If this was being made for real, I'd want to separate it out into 3 files.
 *
 * @author  Traae
 * @version 1.0
 * @since 3/17/2021
 */

package homework4.graphs;

import com.google.common.graph.ElementOrder;
import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;
import homework4.graphs.relationships.*;

import java.util.LinkedList;
import java.util.Random;

public class familyGraphMaker {
    //Variables
    // singleton instance
    private static familyGraphMaker instance = null;
    // Graph of Persons and Relationships
    private static MutableNetwork<Person, VisitableRelationship> graph;
    // copy on all the nodes for convenience
    private LinkedList<Person> people;


    private familyGraphMaker() {
        // make the graph
        graph = NetworkBuilder.directed()
                .allowsParallelEdges(true)
                .nodeOrder(ElementOrder.insertion())
                .expectedNodeCount(15)
                .expectedEdgeCount(200)
                .build();

        people = new LinkedList<Person>();
        // make the people and add them to a linked list
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Cynthia", 24));
        people.add(new Person("Diane", 40));
        people.add(new Person("Eugene", 18));
        people.add(new Person("Fathgore The Destroyer", 100000));
        people.add(new Person("Helen", 33));
        people.add(new Person("Isabel", 16));
        people.add(new Person("Jack", 42));
        people.add(new Person("Lucile", 44));
        people.add(new Person("Mathew", 67));
        people.add(new Person("Nancy", 73));
        people.add( new Person("Kenny", 50));
        // add list as nodes
        for (Person p : people){
           graph.addNode(p);
        }
        // add a hand full of random relationship types, to random people.
        // the results should be fun enough.

        Random r = new Random();
        // go through each person
        for (Person p: people) {
            // decide how many to add for them, up to 6
            int edgesToMake = r.nextInt(6);
            // make a list of the people they already added, including the self to avoid the recursive dge conflict
            LinkedList<Person> already = new LinkedList<>();
            already.add(p);
            // go through the number to make
            for (int i = edgesToMake; i > 0; i--){
                // grab a random person from people
                Person q = people.get(r.nextInt(people.size()));

                // if the have been done ( other wise we're just gonna skip.)
                if (!already.contains(q)){
                    // add them to the all ready list
                    already.add(q);
                    // grad a random number to choose a switch case to add edge.
                    int relationTypeToUse = r.nextInt(7);
                    switch (relationTypeToUse){
                        case 0:
                            graph.addEdge(p, q, new Child());
                            break;
                        case 1:
                            graph.addEdge(p, q, new Coworker());
                            break;
                        case 2:
                            graph.addEdge(p, q, new Dating());
                            break;
                        case 3:
                            graph.addEdge(p, q, new Friend());
                            break;
                        case 4:
                            graph.addEdge(p, q, new Married());
                            break;
                        case 5:
                            graph.addEdge(p, q, new Parent());
                            break;
                        case 6:
                            graph.addEdge(p, q, new Sibling());
                            break;
                    }
                }
            }
        }

        // Ta Da, we should have a complete disaster of a relationship chart.


    }

    // singleton get instance method
    public static familyGraphMaker getInstance(){
        if (instance == null) {
            instance = new familyGraphMaker();
        }
        return instance;
    }

    public MutableNetwork<Person, VisitableRelationship> getGraph() {
        return graph;
    }

    public LinkedList<Person> getPeople(){
        return people;
    }
}
