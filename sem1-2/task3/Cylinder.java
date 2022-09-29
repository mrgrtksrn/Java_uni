public class Cylinder {
    int s;
    int h;

    public  int getvolume(){
        return s*h/3;

    }

    public Cylinder(int a, int b) {
        s = a;
        h = b;

    }
}
