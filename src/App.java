import Makers.SelectDelivery;
import Makers.TransportMaker;
import Products.Transport;

public class App {
    public static void main(String[] args) throws Exception {
        SelectDelivery selectDelivery = new SelectDelivery();
        
        String destination = "США";
        TransportMaker transportMaker = selectDelivery.selectTransport(destination);
        Transport newTransport =  transportMaker.createTransport();
        newTransport.deliver(destination);
    }
}
