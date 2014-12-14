
public class Shop {
	public int cashRegister = 0;
	public void pay(PayStrategy p, int itemPrice){
		cashRegister = cashRegister + p.getPrice(itemPrice);
	}
	
	public static void main(String[] args){
		Shop ica = new Shop();
		int milkPrice = 10;
		int meatPrice = 25;
		System.out.println(ica.cashRegister);
		ica.pay(new StealStrategy(), milkPrice);
		System.out.println(ica.cashRegister);
		ica.pay(new CardStrategy(), meatPrice);
		System.out.println(ica.cashRegister);
	}
}
