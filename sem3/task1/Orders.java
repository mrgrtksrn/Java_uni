import java.util.ArrayList;

public class Orders {

    private ArrayList dishes;


    public Orders( ArrayList dishes){
        this.dishes = dishes;

    }


    public ArrayList getAllOrderInfo(){
        return this.dishes;

    }


}
