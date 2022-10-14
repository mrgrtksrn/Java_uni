import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        int[][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        ArrayIterator i = new ArrayIterator(twoDimArray);
        for (;i.hasNext();) {
            System.out.println(i.next());
        }



    }
}
