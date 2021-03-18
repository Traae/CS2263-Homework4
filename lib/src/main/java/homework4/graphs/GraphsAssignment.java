/**
 * Traae Bloxham
 * Issac Griffith
 * CS2263
 * 3/18/2021
 *
 * HOMEWORK 4
 *
 * This is my main for this program.
 * All it does is grab the instances of the pre-filled graph, and the vistor.
 * Then, prints everything.
 *
 * @author  Traae
 * @version 1.0
 * @since 3/17/2021
 */

package homework4.graphs;

import com.google.common.graph.EndpointPair;
import homework4.graphs.relationships.TheRelationVisitor;
import homework4.graphs.relationships.VisitableRelationship;

public class GraphsAssignment {



    public static void main(String[] args){

        // This is the Network graph, randomly filled out.
        familyGraphMaker family = familyGraphMaker.getInstance();

        TheRelationVisitor visitor = new TheRelationVisitor();

        System.out.println("Welcome to the relationship graph report.");
        System.out.println("First, printing the list of each person, and their respective relationships.");
        System.out.println("Everything was randomized, so don't be surprised if 2 people are each other's parents.\n \n ");

        // for each person
        for (Person p : family.getPeople()) {
            System.out.println("\n \n Now list all relationships from \n" + p.getName() + "'s perspective.");
            // for each relationship
            for (VisitableRelationship r : family.getGraph().incidentEdges(p)){
                // grab that relationships endpoints so that we can see the other person
                EndpointPair<Person> e = family.getGraph().incidentNodes(r);
                // then print person p, use the visitor to get the appropriate message and print the other person
                if (p == e.nodeU()) {
                    System.out.println(p.getName() + r.accept(visitor) + e.nodeV().getName());
                }
                else {
                    System.out.println(p.getName() + r.accept(visitor) + e.nodeU().getName());
                }

            }
        }
        // finally print the relationship type count table
        System.out.println(visitor.getCountTable());


    }


}
