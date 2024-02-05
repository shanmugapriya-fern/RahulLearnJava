package udemychallenge;

public class Wall {
	
	public static void main(String[] args) {
		Wall wall=new Wall();
	System.out.println(wall.getarea());
		
	}
	private double wid;
	private double height;
	
	public Wall() {
		this(2.0,7.0);
	}
	public Wall(double widt,double height) {
		this.wid=widt;
		System.out.println("wid is"+wid);
		this.height=height;
	}
	public double getwid() {
		return wid;
	}
	public double getheight() {
		return this.height;
	}
	public void setwidth(double width) {
		if(width<0) {
			this.wid=0;
		}
		this.wid=width;
	}
	public void setheight(double height) {
		if(height<0) {
			this.height=0;
		}
		this.height=height;
	}

   public  double getarea() {
	double area=this. wid*this.height;
	return area;
  }
	
}