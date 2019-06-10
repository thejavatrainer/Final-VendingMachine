import java.util.List;

public interface JunKomat {
    public void buyProduct(Integer position,Integer deposit);
    public void inputCasch(List<Coin> cash);
    public boolean getRest();

}
