import java.util.*;

/**
 * An interface for a binary tree, in which
 * each node has at most two children.
 */
public interface BinaryTree<E> extends Tree<E> {

    /**
     * returns the position of p's left child(or null if no child exists)
     */
    Position<E> left(Position<E> p);

    /**
     * returns the position of p's right child(or null if no child exists)
     */
    Position<E> right(Position<E> p);

    /**
     * returns the postion of p's sibling (or null if no sibling exists)
     */
    Position<E> sibling(Position<E> p);
}
