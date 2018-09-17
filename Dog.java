
public class Dog extends Animal {
	int legs;
	String name;
	public Dog(String s, int l){
		name = s;
		legs = l;
	}
	public String toStrng(){
		return this.getName();
	}
}
