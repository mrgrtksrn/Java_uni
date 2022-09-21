public class Main {
    public static void main(String[] args){
        Matrix obj1 = new Matrix(3, 5);
        Matrix obj2 = new Matrix(3, 5);
        System.out.println("Матрица А:");
        obj1.getvalue();
        System.out.println("\nМатрица B:");
        obj2.getvalue();

        double multiNumber = 2.2;
        System.out.println("\nУмножение матрицы А на число " + multiNumber);
        Matrix result = obj1.NumberMulti(multiNumber);
        if (result != null)
            result.getvalue();

        System.out.println("\nТранспонированная матрица А:");
        result = obj1.Transpose();
        if (result != null)
            result.getvalue();

        TwoMatrics executerObj = new TwoMatrics(obj1, obj2);
        System.out.println("\nСумма:");
        result = executerObj.summ();
        if (result != null)
            result.getvalue();

        System.out.println("\nРазность:");
        result = executerObj.subtraction();
        if (result != null)
            result.getvalue();

        int exp = 3;
        System.out.println("\nВозведение матрицы А в степень " + exp);
        result = obj1.exponent(exp);
        if (result != null)
            result.getvalue();


    }
}
