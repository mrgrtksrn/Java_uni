import java.util.Random;

class Shape {
    private double volume;

    //Получение объёма
    public double getVolume() {
        return this.volume;
    }

    //Установка объёма
    public void setVolume(double volume) {
        this.volume = volume;
    }
}

class Box extends Shape {

}


public class Main {
    public static void main(String[] args) {

        // Коробка
        Box box = new Box();
        //Максимальный объём коробки
        box.setVolume(100);

        while (box.getVolume() > 0) {
            Random random = new Random();
            int check = 0;
            int a = random.nextInt(20);
            int b = random.nextInt(15);
            int r = random.nextInt(10);
            if (a == 0 | b == 0 | r == 0){
                continue;
            }
            Pyramid pyramid1 = new Pyramid(a, b);
            Ball ball1 = new Ball(r);
            Cylinder cylinder1 = new Cylinder(a, b);

            double ShapeVolume1 = pyramid1.getvolume();
            double ShapeVolume2 = cylinder1.getvolume();
            double ShapeVolume3 = ball1.getvolume();
            double Volumes [] = {ShapeVolume1, ShapeVolume2, ShapeVolume3};
            System.out.println("Объем пирамиды: " + ShapeVolume1 + " Объем цилиндра: " + ShapeVolume2 + " Объем шара: " + ShapeVolume3);

            for (int i = 0; i < 3; i ++){
                if (box.getVolume() < Volumes[i]) {
                    System.out.println("Больше ничего не войдет. В коробке осталось столько объема "+box.getVolume());
                    check = 1;
                    break;
                } else {
                    //Оставшееся свободное место
                    System.out.println("В коробке теперь фигура объема: " + Volumes[i]);
                    double freeVolume = box.getVolume() - Volumes[i];
                    box.setVolume(freeVolume);
                    continue;
                }

            }
            if (check == 1){
                break;
            }


        }

    }
}
