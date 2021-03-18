/**
 * On of the relationship classes implementing visitable for
 * practicing the visitor pattern.
 * based on the Override style Visitor tutorial on refactoring.guru
 *
 * @author  Traae
 * @version 1.0
 * @since 3/17/2021
 */

package homework4.graphs.relationships;

public class Sibling extends Relationship implements VisitableRelationship {
    public Sibling(){
        this.type = RelationType.sibling;
    }

    @Override
    public String accept(RelationshipVisitor v) {
        return v.visit(this);
    }
}
