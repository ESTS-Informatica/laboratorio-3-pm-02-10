
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int trailers;
    
    public Lorry(String licensePlate, int numberOfPallets, int trailers){
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.trailers = trailers;
    }
    
    public int getNumberOfPallets(){
        return numberOfPallets;
    }
    
    public void setNumberOfPallets(int numberOfPallets){
        this.numberOfPallets = numberOfPallets;
    }
    
    public int getTrailers(){
        return trailers;
    }
    
    public void setTrailers(int trailers){
        this.trailers = trailers;
    }
    
    public String getLicensePlate(){
        return super.getLicensePlate();
    }
    
    public void setLicensePlate(String licensePlate){
        super.setLicensePlate(licensePlate);
    }
    
    @Override
    public String toString(){
        return super.toString();
    }
}
