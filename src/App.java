import Makers.SelectDelivery;
import Products.Transport;

public class App {
    public static void main(String[] args) throws Exception {
        SelectDelivery selectDelivery = new SelectDelivery();
        
        String destination = "Россия";
        Transport transport = selectDelivery.selectTransport(destination);
        transport.deliver(destination);
    }
}
