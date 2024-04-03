
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        ShippingCompany shippingC= new ShippingCompany("RELIABLE-MOVING");
        shippingC.add(new GroundTransportation("RIC23"));
        shippingC.add(new AirTransportation("AVIAO 1", 20));
        shippingC.add(new AirTransportation("AVIAO 2", 40));
        shippingC.add(new Lorry("ABC123",50, 2));
        shippingC.add(new Van("DEF456",100));
        System.out.println(shippingC.toString());
    }
}
