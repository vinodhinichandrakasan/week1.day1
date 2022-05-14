package week1.day1;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Car CarValue=new Car();
			CarValue.applyAcclerate();
			CarValue.applyBreak();
			CarValue.switchonAc();
			CarValue.applyGear();
	}
	
	public void applyBreak() {
		System.out.println("apply the brake");
		}
	
	public void applyGear()
	{
		System.out.println("apply gear");
	}
	public void switchonAc() {
		System.out.println("switch on the AC");
	}
	public void applyAcclerate()
	{
		System.out.println("apply accelerate");
	}

}
