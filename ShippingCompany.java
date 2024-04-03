import java.util.ArrayList;
import java.util.HashSet;

/**
 * Write a description of class ShippingCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShippingCompany extends HashSet<Transport>
{
    private String name;
    private ArrayList<Transport> inService;
    
    public ShippingCompany(String name){
        super();
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void makeTransportation(String id, String origin, 
    String destination,double price){
        Transport transport = getTransportation(id);    
        if(transport != null && transport.isAvailable()){
            transport.setOrigin(origin);
                transport.setDestination(destination);
                transport.setPrice(price);
                transport.setAvailable(false);
                inService.add(transport);
                this.remove(transport);
                return;
        }
    }
    
    private Transport getTransportation(String id){
        for(Transport transport : this){
            if(id.equals(transport.getId())){
                return transport;
            }
        }
        return null;
    }
    
    public void finalizeTransportation(String id){
         Transport transport = getTransportation(id);
         if(transport != null && inService.contains(transport)){
             inService.remove(transport);
         }
    }
    
    @Override
    public String toString(){
        String s ="";
        for(Transport transport : this){
            s += transport.toString();
        }
        
        return s;
    }
}
