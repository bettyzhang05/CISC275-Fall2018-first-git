
public abstract class Animal implements Comparable<Animal>{
	int legs;
	String names;
	public int getLegs(){
		return legs;
	}
	public String getName(){
		return names;
	}
	public int compareTo(Animal a){
		return this.getName()-a.getName();
	}
}
