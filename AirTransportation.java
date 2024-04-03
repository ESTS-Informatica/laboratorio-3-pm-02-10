
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    
    
    public AirTransportation(String name, int numberOfContainers){
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        super.setFees(0.04);
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
    
    public double getPriceWithFees(){
        return super.getPrice() * (1.0 + (super.getFees()));
    }
    
    public String getTransportType(){
        return "Transporte Aéreo";
    }
    
    public String toString(){
       return super.toString();
    }
}
