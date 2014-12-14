
public class SingleTon extends Person{
	private static SingleTon kingOfSweden = null;

	private Person successor;
	
	private SingleTon(Person s, String n, int a) {
		super(n, a);
		successor = s;
	}
	
	public static synchronized SingleTon getInstance() {
		if (kingOfSweden == null){
			kingOfSweden = new SingleTon(new Person("Karl", 50), "Karl", 86);
		}
		
		return kingOfSweden;
	}
	
	public void changeKing() {
		kingOfSweden = (SingleTon)successor;
		kingOfSweden.successor = new Person("Karl", 
				kingOfSweden.getAge() - 36);
	}
}
