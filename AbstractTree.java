import java.util.*;

public abstract class AbstractTree<E> implements Tree<E> {

    @Override
    public boolean isInternal(Position<E> p) { return numChildren(p) > 0; }

    @Override
    public boolean isExternal(Position<E> p) { return numChildren(p) == 0; }

    @Override
    public boolean isRoot(Position<E> p) { return p == root(); }

    @Override
    public boolean isEmpty() { return size() == 0; }

    /**
     * returns the number of levels separating Position p from the root
     */
    public int depth(Position<E> p) {
        return
            isRoot(p) ? 0 : depth(parent(p));
    }

    /**
     * returns the height of the tree
     */
    private int heightBad() { //works, but bad
        int h = 0;
        for (Position<E> p : positions()) {
            if (isExternal(p)) { //only consider leaf positions
                h = Math.max(h, depth(p));
            }
        }
        return h;
    }

    /**
     * returns the height of the subtree rooted at Position p
     */
    public int height(Position<E> p) {
        int h = 0;
        for (Position<E> c : children(p)) {
            h = Math.max(h, 1 + height(c));
        }
        return h;
    }
}
