
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation
{
    private String name;
    private int numberOfContainers;
    
    public AirTransportation(String name, int numberOfContainers){
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public void setName(String name){
        if(name!=null)
            this.name = name;    
    }
    
    public String getName(){
        return name;
    }
    
    public void setNumberOfContainers(int numberOfContainers){
        this.numberOfContainers = numberOfContainers;    
    }
    
    public int getNumberOfContainers(){
        return numberOfContainers;
    }
}
