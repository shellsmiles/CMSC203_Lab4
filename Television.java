/** 
*The purpose of this class is to model a television
*Programmer: Yana Li 9/26/2021
*/
public class Television {

	private final String MANUFACTURE; // television's brand
	private final int SCREEN_SIZE; // television's size
	private boolean powerOn; // television's power (on/off)
	private int volume; // television's volume
	private int channel; // television's channel
	
	public Television (String brand, int size) // directly set the 
	{
		MANUFACTURE= brand;
		SCREEN_SIZE= size;
		powerOn= false;
		channel= 2;
		volume= 20;
	}
	
	/** the getVolume method gets the volume of a television.
	@param return the volume
	*/	
	public int getVolume() 
	{
		return volume;
	}
	
	/** the getChannel method store the desired station.
	@param return the channel
	*/
	public int getChannel()
	{
		return channel;
	}
	
	/** the getManufacturer method gets the brand of a television.
    @param return the brand
	*/
	public String getManufacturer()
	{
		return MANUFACTURE;
	}
	
	/** the getScreenSize method gets a television's screen size.
	@param return the screen size
	*/
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	/** the setChannel method accepts a desired station and set it as channel .
	*/
	public void setChannel (int c)
	{
		channel= c;
	}
	
	/** the power method changes the state of a television from the power on and off.
	*/
	public void power()
	{
		powerOn= !powerOn;
	}
	
	/** the increaseVolume method will increase the volume by 1.
	*/
	public void increaseVolume()
	{
		volume +=1;
	}
	
	/** the decreaseVolume method will decrease the volume by 1.
	*/
	public void decreaseVolume()
	{
		volume-=1;
	}
	
	
}
