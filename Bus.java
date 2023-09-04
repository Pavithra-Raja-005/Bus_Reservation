package BusResv;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity; 
	
	//We should use get and set methods for accessing variables
	
	Bus(int no,boolean ac,int cap){ 	//Constructor
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public boolean isAc() {
		return ac;
	}	
	
	public int getCapacity(){ //accessor method
		return capacity;
	}
	
	public void setAc(boolean val) {
		ac= val;
	}
	
	public void setCapacity(int cap) { //mutator method
		capacity = cap;
	}
	
	public void displayBusInfo(){
		System.out.println("Bus No :" + busNo + "\t"+ "AC :"  + ac +"\t"+ "Total Capacity :" +capacity +"\t");
	}

}
