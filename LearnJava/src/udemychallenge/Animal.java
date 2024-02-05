package udemychallenge;

public class Animal {
	private String type;
	private String size;
	private int weight;
	
	public Animal() {
		
	}
	public Animal(String type,String size,int weight) {
		this.type=type;
		this.size=size;
		this.weight=weight;
	}
	@Override
	public String toString(){
		 return "Animal{" +
	                "type='" + type + '\'' +
	                ", size='" + size + '\'' +
	                ", weight=" + weight +
	                '}';
	}
	
	

}
