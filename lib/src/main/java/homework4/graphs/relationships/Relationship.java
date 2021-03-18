/**
 * An abstract class for relationships to inherit from.
 * based on the Override style Visitor tutorial on refactoring.guru
 *
 * @author  Traae
 * @version 1.0
 * @since 3/17/2021
 */

package homework4.graphs.relationships;

public abstract class Relationship {
    protected RelationType type;

    public RelationType getType() {
        return type;
    }
}
