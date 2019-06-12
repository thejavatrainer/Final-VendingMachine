import java.util.*;

public class CoinStack {

    Map<Coins , Integer> coinsStack;

    public CoinStack() {
        this.coinsStack = new EnumMap<Coins, Integer>(Coins.class);
        this.coinsStack.put(Coins.TEN_CENT,0);
        this.coinsStack.put(Coins.TWENTY_CENT,0);
        this.coinsStack.put(Coins.FIFTY_CENT,0);
        this.coinsStack.put(Coins.ONE_DOLLAR,0);
        this.coinsStack.put(Coins.TWO_DOLLAR,0);
    }

    public boolean fillMoney(List<Coins> money){
        for(Coins coin : money){
                this.coinsStack.put(coin, this.coinsStack.get(coin) + 1);

            }
            return true;
        }
    }

