import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishList = new ArrayList<>();
    private ArrayList<Dish> stopList = new ArrayList<>();

    public Menu(Dish ... dishs){
        for (Dish dish : dishs) {
            dishList.add(dish);
        }
    }

    public void printActualMenu(){
        for (int i = 0; i < dishList.size(); i++) {
            Dish dish = dishList.get(i);
            if (stopList.indexOf(dish)<0)
                System.out.println(dish.getName());
        }
    }
    public void printAllMenu(){
        for (int i = 0; i < dishList.size(); i++) {
            Dish dish = dishList.get(i);
            System.out.println(dish.getName());
        }
    }

    public void printStopList(){
        for (int i = 0; i < stopList.size(); i++) {
            Dish dish = stopList.get(i);
            System.out.println(dish.getName());
        }
    }


    public Dish getDish(String dishname) {
        for (int i = 0; i < dishList.size(); i++) {
            Dish dish = dishList.get(i);
            if (dish.getName().equals(dishname)) {
                 return dish;
            }
            else {
                continue;
            }

        }
        Dish end = new Dish("нет", 0, "0", "0");
        return end;
    }
    public void addDish(Dish dish){
        this.dishList.add(dish);
    }

    public void addStopDish(Dish dish){
        this.stopList.add(dish);
    }

    public void delStopDish(Dish dish){
        this.stopList.remove(dish);
    }

    public void delDish(Dish dish){
        this.dishList.remove(dish);
    }



}
