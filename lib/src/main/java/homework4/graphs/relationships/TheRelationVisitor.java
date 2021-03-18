/**
 * Concrete implimentation of my visitor interface.
 * based on the Override style Visitor tutorial on refactoring.guru
 *
 * It takes the various classes and then returns a customized message
 * that suits the attribute of the class, or rather the word they represent.
 *
 * @author  Traae
 * @version 1.0
 * @since 3/17/2021
 */

package homework4.graphs.relationships;

public class TheRelationVisitor implements RelationshipVisitor {
    private int childCount;
    private int coworkerCount;
    private int datingCount;
    private int friendCount;
    private int marriedCount;
    private int parentCount;
    private int siblingCount;




    public TheRelationVisitor(){
        childCount = 0;
        coworkerCount = 0;
        datingCount = 0;
        friendCount = 0;
        marriedCount = 0;
        parentCount = 0;
        siblingCount = 0;
    }

    @Override
    public String visit(Child c) {
        childCount++;
        return " --" + c.getType().toString() + " of --";
}
    @Override
    public String visit(Coworker w) {
        coworkerCount++;
        return " --" + w.getType().toString() + "s with -- ";
    }
    @Override
    public String visit(Dating d) {
        datingCount++;
        return " --" + d.getType().toString() + "-- ";
    }
    @Override
    public String visit(Friend f) {
        friendCount++;
        return " --" + f.getType().toString() + "s with-- ";
    }
    @Override
    public String visit(Married m) {
        marriedCount++;
        return " --" + m.getType().toString() + " to-- ";
    }
    @Override
    public String visit(Parent p) {
        parentCount++;
        return " --" + p.getType().toString() + " of-- ";
    }
    @Override
    public String visit(Sibling s) {
        siblingCount++;
        return " --" + s.getType().toString() + " to-- ";
    }

    public String getCountTable(){
        return "Relationship Type     Count\n" +
                "--------------------------\n" +
                "Children              " + childCount +"\n" +
                "Coworkers             " + coworkerCount +"\n" +
                "Dating                " + datingCount +"\n" +
                "Friends               " + friendCount +"\n" +
                "Married               " + marriedCount +"\n" +
                "Parents               " + parentCount +"\n" +
                "Siblings              " + siblingCount+"\n";

    }


}
