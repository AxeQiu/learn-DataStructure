import java.util.*;

public abstract class AbstractBinaryTree<E> implements BinaryTree<E> {

    /**
     * returns the position of p's sibling(or null if no sibling exists)
     */
    public Position<E> sibling(Position<E> p) {
        Position<E> parent = parent(p);
        if (parent == null) return null;
        if (p == left(parent)) {
            return right(parent);
        } else {
            return left(parent);
        }
    }

    /**
     * returns the number of children of position p
     */
    public int numChildren(Position<E> p) {
        int count = 0;
        if (left(p) != null) count++;
        if (right(p) != null) count++;
        return count;
    }

    /**
     * returns the iterable collection of the position representing p's children
     */
    public Iterable<Position<E>> children(Position<E> p) {
        List<Position<E>> snapshot = new ArrayList<>(2);
        if (left(p) != null) snapshot.add(left(p));
        if (right(p) != null) snapshot.add(right(p));
        return snapshot;
    }

}
