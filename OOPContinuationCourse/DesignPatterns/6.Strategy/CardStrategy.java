
public class CardStrategy implements PayStrategy {

	@Override
	public int getPrice(int itemPrice) {
		return itemPrice+10;
	}

}
