//Реализуйте метод, в который передается 4 числа с плавающей точкой. Первые два числа – координаты x, y первой точки.
//Вторые два числа – координаты x,y второй точки. Найти расстояние между двумя точками
public class task12_sem1 {
    public static void main(String[] args) {
        System.out.println(distance(5,10,-4,-20));
    }
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }

}
