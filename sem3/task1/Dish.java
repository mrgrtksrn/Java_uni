public class Dish {
    private String name;
    private int price;
    private String measurement;
    private String comp;
    private String [] composition;

    public Dish(String name, int price, String measurement, String comp){
        this.name = name;
        this.price = price;
        this.measurement = measurement;
        this.comp = comp;
    }

    public String getAllInfo(){
        String s = this.name + " " + this.price +" "+this.measurement+" "+this.comp;
        return s;
    }
    public String getInfo(){
        return this.name + " " + this.price;
    }
    public String getName(){return this.name;}
    public int getPrice(){return this.price;}
}
