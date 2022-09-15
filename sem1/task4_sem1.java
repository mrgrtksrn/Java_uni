//Даны две переменные. Поменяйте значения переменных друг с другом двумя способами
public class task4_sem1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("a = " + a + " b = " + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("a = " + a + " b = " + b);


        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);



    }
}

