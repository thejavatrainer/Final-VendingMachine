import java.util.*;

public class CoinStack {
      Map<Coins , Integer> coinsStack;

    public CoinStack() {
        this.coinsStack = new HashMap<>();
        this.coinsStack.putAll(Coins.values(), 0);
    }

    public boolean fillMoney(List<Coins> money){
        for(Coins coin : money){
                this.coinsStack.put(coin, this.coinsStack.get(coin) + 1);

            }
        }
    }
}
