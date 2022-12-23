import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println(recursion(10)); // первое задание

        System.out.println("Задание 2");
        int[] array = generateRandomArray(10000);
        Arrays.sort(array);
        int firstElement = array[0];
        int lastElement = array[array.length - 1];

        long start = System.nanoTime();
        System.out.println(simpleSearch(array, 200));
        long finish = System.nanoTime();
        System.out.println("Время выполнения функции с простым поиском: " + (finish - start));

        start = System.nanoTime();
        System.out.println(recursiveBinarySearch(array, firstElement, lastElement, 200));
        finish = System.nanoTime();
        System.out.println("Время выполнения функции с рекурсивным двоичным поиском: " + (finish - start));

        System.out.println("Задание 3");
        System.out.println(solve(0, 10));
        
    }

    //  1) Дано натуральное число n. Выведите все числа от 1 до n.
    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }

    //  2) Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
    //Используйте перебор и двоичный поиск для решения этой задачи. Сравните время
    //выполнения обоих решений для больших массивов (например, 100000000 элементов).

    public static int[] generateRandomArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] =  (int)(Math.random() * (length+1)) ;
        }

        return array;

    }

    // Перебор
    public static int simpleSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key)
                return key;
        }
        return -1;
    }

    // Рекурсивный двоичный поиск
    public static int recursiveBinarySearch(int array[], int firstElement, int lastElement, int elementToSearch) {

        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;

            if (array[mid] == elementToSearch)
                return elementToSearch;

            if (array[mid] > elementToSearch)
                return recursiveBinarySearch(array, firstElement, mid - 1, elementToSearch);

            return recursiveBinarySearch(array, mid + 1, lastElement, elementToSearch);
        }

        return -1;
    }

    // вспомогательный метод
    public static double func(double x){
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    // решить уравнение
    public static double  solve(double start, double end){
        if(end - start <= 0.001){
            return start;
        }

        double x = start + (end - start) / 2;

        if(func(start) * func(x) > 0){
            return solve(x, end);
        } else {
            return solve(start, x);
        }
    }


}

