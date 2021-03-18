/**
 * My visitable interface.
 * based on the Override style Visitor tutorial on refactoring.guru
 *
 * @author  Traae
 * @version 1.0
 * @since 3/17/2021
 */

package homework4.graphs.relationships;

public interface VisitableRelationship {
    public String accept(RelationshipVisitor v);
}
