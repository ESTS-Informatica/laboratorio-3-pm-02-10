
/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation
{
    private String licensePlate;
    
    public GroundTransportation(String licensePlate){
        this.licensePlate = licensePlate;
    }
    
    public void setLicencePlate(String licencePlate){
        if(licencePlate!=null)
        this.licensePlate = licensePlate;
    }
    
    public String getLicencePlate(){
        return licensePlate;
    }
}
