import java.util.ArrayList;
import java.util.List;

public class ShoppingTrolley {
    private List<String> shoppingTrolley;

    public ShoppingTrolley(){
        this.shoppingTrolley = new ArrayList<>();
    }

    public void addItem(String item){
        this.shoppingTrolley.add(item);
    }

    public int getTrolleySize(){
        return this.shoppingTrolley.size();
    }

    public boolean inTrolley(String item){
        for (String thing : this.shoppingTrolley) {
            if(thing == item){
                return true;
            }
        }
        return false;
    }
}
