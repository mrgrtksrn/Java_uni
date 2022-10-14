import java.util.Iterator;

public class ArrayIterator {
    private int[][] m;
    private int i, j;
        public ArrayIterator(int[][] m) {
        this.m = m;
    }

    public boolean hasNext() {
        return i < m.length && j < m[i].length;
    }

    public Integer next() {
        Integer r = m[i][j++];
        if (j >= m[i].length) {
            i++;
            j = 0;
        }
        return r;
    }

}
