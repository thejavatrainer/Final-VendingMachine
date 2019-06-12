import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StackOfPoducts extends  Object {
    Collection<SlotOfProduct> stackOfPoducts;

    public StackOfPoducts() {
        this.stackOfPoducts = new ArrayList<SlotOfProduct>();
    }

    private void initialfillProduct(Product produs, Integer intems) {
        this.stackOfPoducts.add(new SlotOfProduct(produs, intems));

    }

    @Override
    public String toString() {
        String rez= "StackOfPoducts";
        for(SlotOfProduct list:stackOfPoducts ) {
           rez=list.toString();
        }
        return  rez;
    }

}


