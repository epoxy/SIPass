
public class Person {
	private String name;
	private int age;
	
	public Person(String n, int a){
		name = n;
		age = a;
	}
	
	public void birthday(){
		age++;
	}
	
	public int getAge(){
		return age;
	}
}
