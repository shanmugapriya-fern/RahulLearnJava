package udemychallenge;

public class Car {
    private String make="xxxxx";
    private String model="yyy";
    private String color="grey";
    private int doors=2;
    private boolean convertible=true;
    public void describeCar() {

        System.out.println(doors + "-Door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
public String getMake() {
	return make;
}
public void setMake(String make) {
	if(make==null)
		this.make="unknown";
	String lowcase=make.toLowerCase();
	switch(lowcase) {
	case"ford","hundai","honda" 
	->this.make=make;
	default->{
		this.make="unsupported";
	}
	}
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getDoors() {
	return doors;
}
public void setDoors(int doors) {
	this.doors = doors;
}
public boolean isConvertible() {
	return convertible;
}
public void setConvertible(boolean convertible) {
	this.convertible = convertible;
}

	

}
