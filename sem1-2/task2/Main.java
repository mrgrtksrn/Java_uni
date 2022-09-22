import java.beans.beancontext.BeanContext;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Vector v1 = new Vector(1,2,3);
        Vector v2 = new Vector(5,4,10);

        double result = v1.length();
        System.out.println("Длина вектора 1: " + result);

        result = v2.length();
        System.out.println("Длина вектора 2: " + result);

        result = v1.Multi(v2);
        System.out.println("Скалярное произведение вектора 1 и 2: " + result);

        Vector resvec = v1.VecMultu(v2);
        System.out.println("Векторное произведение 1 и 2: ");
        resvec.getvalue();

        resvec = v1.Sum(v2);
        System.out.println("Сумма 1 и 2: ");
        resvec.getvalue();

        resvec = v1.Sub(v2);
        System.out.println("Разница 1 и 2: ");
        resvec.getvalue();

        result = v1.VectorCos(v2);
        System.out.println("Косинус между векторами 1 и 2 " + result);


        Vector[] vectors = Vector.generator(5);
        System.out.println("Массив случайных векторов размера 5: ");
        for (int i = 0; i < vectors.length; i++) {
            vectors[i].getvalue();
        }






    }
}
