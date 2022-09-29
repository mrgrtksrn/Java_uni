public class Pyramid {
    int s;
    int h;

    public  int getvolume(){
        return s*h/3;

    }

    public Pyramid(int a, int b) {
        s = a;
        h = b;

    }
}
