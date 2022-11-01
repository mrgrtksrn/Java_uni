import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterateIterator{


        private Iterator innerIterator1;
        private Iterator innerIterator2;

        public IterateIterator() {
            this.innerIterator1 = innerIterator1;
            this.innerIterator2 = innerIterator2;
        }


        public boolean hasNext() {
            while (innerIterator1.hasNext()) return true;
            while (innerIterator2.hasNext()) return true;
            return false;
        }


        public Object next() {
            if(!hasNext())
                throw new NoSuchElementException();

            while (innerIterator1.hasNext()) return innerIterator1.next();
            while (innerIterator2.hasNext()) return innerIterator2.next();
            return null;

    }
}
