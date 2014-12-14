
public class StealStrategy implements PayStrategy{
	@Override
	public int getPrice(int itemPrice){
		int price = itemPrice;
		double gotCaught = Math.random();
		if (gotCaught>0.5){
			price = 2*price;
		}else{
			price=0;
		}
		return price;
	}
}
