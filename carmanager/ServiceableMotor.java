package ua.com.foxminded.carmanager;

public interface ServiceableMotor {

	public void upDistance(int upDistance);
	
	public void upDistance(double upDistance);
	
	public boolean isReadyToService();
}
