package week1.day1;

public class TwoWheeler {
	
	int noOfWheels=4;
	short noOfMirrors=2;
	long chassisNumber=4321l;
	boolean isPunctured=false;
	String bikeName="Yamaha";
	double runningKM=5098.12;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler obj=new TwoWheeler();
		System.out.println("noOfWheels = "+obj.noOfWheels +" "+'\n'+"noOfMirrors = "+obj.noOfMirrors+'\n'+"chassisNumber = "+obj.chassisNumber+'\n'+"isPunctured = "+obj.isPunctured
				+'\n'+"bikeName = "+obj.bikeName+'\n'+"runningKM = "+obj.runningKM);

	}

}
