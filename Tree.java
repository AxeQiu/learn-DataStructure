import java.util.*;

public interface Tree<E> extends Iterable<E> {

    public static class Position<E> {

        E element;

        public void SetElement(E e) {
            element = e;
        }

        public E getElement() {
            return element;
        }
    }

    /**
     * return the position of the root of the tree(or null if empty)
     */
    Position<E> root();

    /**
     * return the position of the parent of the position p (or null if empty)
     */
    Position<E> parent(Position<E> p);

    /**
     * return an iterable collection containing the children of position p
     * (if any)
     */
    Iterable<Position<E>> children(Position<E> p);

    /**
     * returns the number children of the position p
     */
    int numChildren(Position<E> p);

    /**
     * return true if the position p has at least one child
     */
    boolean isInternal(Position<E> p);

    /**
     * return true if the position p does not have any children
     */
    boolean isExternal(Position<E> p);

    /**
     * return true if the position is the root of tree
     */
    boolean isRoot(Position<E> p);

    /**
     * return the number of positions(and hence elements) that
     * are contained in the tree
     */
    int size();

    /**
     * return true if the tree does not contain any position
     * (and thus no elements)
     */
    boolean isEmpty();


    /**
     * returns an iterator of all the elements in the tree
     */
    Iterator<E> iterator();

    /**
     * returns an iterable collection of all positions of the tree
     */
    Iterable<Position<E>> positions();
}
