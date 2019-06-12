public enum Coins {
    TEN_CENT(10),
    TWENTY_CENT(20),
    FIFTY_CENT(50),
    ONE_DOLLAR(100),
    TWO_DOLLAR(200);


    private final int coin;
    Coins(int value)
    {
        coin = value;
    }

    public int getCoin() {
        return coin;
    }
}