
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    
    public GroundTransportation(String licensePlate){
        super();
        super.setFees(0.03);
        this.licensePlate = licensePlate;
    }
    
    public void setLicensePlate(String licensePlate){
        if(licensePlate!=null){
        this.licensePlate = licensePlate;}
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    public double getPriceWithFees(){
        return super.getPrice() * (1.0 + (super.getFees()));
    }
    
    public String getTransportType(){
        return "Transporte Terrestre";
    }
    
    public String toString(){
       return super.toString();
    }
}
