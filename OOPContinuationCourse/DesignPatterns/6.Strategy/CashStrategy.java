
public class CashStrategy implements PayStrategy {

	@Override
	public int getPrice(int itemPrice) {
		return itemPrice;
	}

}
