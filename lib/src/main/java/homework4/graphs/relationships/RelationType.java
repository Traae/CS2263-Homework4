/**
 * An enumeration I made in a brainstorming session.
 * It's arbitrary, but I kept it because I have nothing else to
 * inside the various relationship classes.
 * based on the Override style Visitor tutorial on refactoring.guru
 *
 * @author  Traae
 * @version 1.0
 * @since 3/17/2021
 */

package homework4.graphs.relationships;

public enum RelationType {
    married,
    dating,
    parent,
    child,
    sibling,
    friend,
    coworker;
}
