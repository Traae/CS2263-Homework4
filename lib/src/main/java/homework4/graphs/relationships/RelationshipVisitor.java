/**
 * My visitor interface.
 * based on the Override style Visitor tutorial on refactoring.guru
 * I had to use the switch style though.
 *
 * @author  Traae
 * @version 1.0
 * @since 3/17/2021
 */

package homework4.graphs.relationships;

public interface RelationshipVisitor {
    String visit(Child c);
    String visit(Coworker w);
    String visit(Dating d);
    String visit(Friend f);
    String visit(Married m);
    String visit(Parent p);
    String visit(Sibling s);

}
