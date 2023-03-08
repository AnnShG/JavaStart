package ua.com.foxminded.carmanager;

// it is also a class but abstract
public interface Serviceable { 
	
	public boolean isREadyToService();
	
	public int getDistanceOnService();
	
	public void addDistance(int additionalDistance);
	
	public void addDistance(double additionalDistance);
	

}
