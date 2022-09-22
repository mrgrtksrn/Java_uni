import java.util.Random;

public class Vector {
    int x;
    int y;
    int z;

    public Vector(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    public void getvalue() {
        System.out.format("(%d, %d, %d)%n", x, y, z);
    }

    // Длина вектора
    public double length() {
        return Math.sqrt(x*x + y*y + z*z);
        }

    // Скалярное произведение 1 и 2
    public double Multi(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    // Векторное произвежение
    public Vector VecMultu(Vector vector) {
        Vector v3 = new Vector(y*vector.z - z*vector.y,z*vector.x-x*vector.z,x*vector.y-y*vector.x);
        return v3;
    }

    // Сумма
    public Vector Sum(Vector vector) {
        Vector result = new Vector(x+ vector.x,y+ vector.y,z + vector.z);
        return result;
    }

    // Разность
    public Vector Sub(Vector vector) {
        Vector result = new Vector(x - vector.x,y - vector.y,z - vector.z);
        return result;
    }

    // Угол между векторами
    public double VectorCos(Vector vector) {
        double numerator = Multi(vector);
        double denominator = Math.abs(length()) * Math.abs(vector.length());
        return numerator / denominator;

    }

    // Метод, который принимает целое число N, и возвращает массив случайных векторов размером N
    public static Vector[] generator(int N) {
        Vector vectorsArr[];
        vectorsArr = new Vector[N];
        for (int i = 0; i < N; i++) {
            Random rand = new Random();
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            int z = rand.nextInt(100);
            vectorsArr[i] = new Vector(x, y, z);
        }

        return vectorsArr;
    }




}
