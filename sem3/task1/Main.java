import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList> tableOrders = new ArrayList<ArrayList>();
        Menu menu = new Menu();

        Orders orders = null;

        boolean working = true;

        while (working) {
            int sum = 0;
            System.out.println("Выберите действие");
            System.out.println("100 - Выход");
            System.out.println("1 - Посмотреть актуальное меню");
            System.out.println("2 - Посмотреть полностью меню");
            System.out.println("3 - Посмотреть информацию о заказе по столику");
            System.out.println("4 - Закрыть заказ");
            System.out.println("5 - Добавить блюдо в меню");
            System.out.println("6 - Удалить блюдо из меню");
            System.out.println("7 - Сделать заказ");
            System.out.println("8 - Добавить блюдо в стоп-лист");
            System.out.println("9 - Удалить блюдо из стоп-листа");

            System.out.println("Введите номер действия");
            String operation = reader.readLine();

            int op = Integer.parseInt(operation);

            switch (op) {

                case 9:
                    menu.printStopList();
                    System.out.println("Введите название блюда, которое нужно убрать из стоп-листа");
                    String s_dish = reader.readLine();
                    Dish stop_d_dish = menu.getDish(s_dish);
                    menu.delStopDish(stop_d_dish);
                case 8:
                    menu.printAllMenu();
                    System.out.println("Введите название блюда, которое нужно внести в стоп-лист");
                    s_dish = reader.readLine();
                    Dish stop_dish = menu.getDish(s_dish);
                    menu.addStopDish(stop_dish);
                    menu.printAllMenu();
                    break;
                case 7:
                    String order_dish;
                    menu.printActualMenu();
                    ArrayList dishesOrders = new ArrayList();

                    boolean order = true;
                    while (order) {
                        System.out.println("Введите название блюда, которое хотите заказать");
                        System.out.println("Чтобы закрыть заказ введите 100");
                        order_dish = reader.readLine();
                        if (order_dish.equals("100")){
                            orders = new Orders(dishesOrders);
                            tableOrders.add(dishesOrders);

                            System.out.println(orders.getAllOrderInfo());
                            System.out.println("Сумма вашего заказа "+ sum);
                            break;
                        }
                        else {

                            Dish order_Dish_dish = menu.getDish(order_dish);

                            if (order_Dish_dish.getPrice() == 0) {
                                System.out.println("Такое блюдо отсутсвует в меню");
                            }
                            else {
                                System.out.println(order_Dish_dish.getPrice());
                                sum += order_Dish_dish.getPrice();
                                System.out.println(sum);
                                dishesOrders.add(order_dish);
                            }
                            continue;
                        }
                    }


                    break;

                case 6:
                    menu.printAllMenu();
                    System.out.println("Введите название блюда, которое нужно удалить");
                    String r_dish = reader.readLine();
                    Dish del_dish = menu.getDish(r_dish);
                    menu.delDish(del_dish);
                    break;

                case 5:
                    System.out.println("Введите название блюда");
                    String name = reader.readLine();
                    System.out.println("Введите цену блюда");
                    String coststr = reader.readLine();
                    int cost = Integer.parseInt(coststr);
                    System.out.println("Введите вес блюда и единицу измерения");
                    String weight = reader.readLine();
                    System.out.println("Введите состав блюда");
                    String comp = reader.readLine();
                    Dish dish = new Dish(name, cost, weight, comp);
                    menu.addDish(dish);
                    menu.printAllMenu();
                    break;

                case 4:
                    System.out.println("Введите номер столика, где нужно закрыть заказ");
                    String table_close= reader.readLine();
                    int tableIntDel = Integer.parseInt(table_close);
                    System.out.println(tableOrders.remove(tableIntDel-1));

                    break;


                case 3:
                    System.out.println("Введите номер столика, по которому вы хотите посмотреть заказ");
                    String table = reader.readLine();
                    int tableInt = Integer.parseInt(table);

                    System.out.println(tableOrders.get(tableInt-1));

                    break;
                case 2:
                    menu.printAllMenu();
                    break;
                case 1:
                    menu.printActualMenu();
                    break;


                case 100: {// exit
                    working = false;
                    break;
                }


            }
        }
    }
}
