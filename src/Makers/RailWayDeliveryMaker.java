package Makers;
import Products.RailWayDelivery;
import Products.Transport;

public class RailWayDeliveryMaker implements TransportMaker {
    @Override
    public Transport createTransport() {
        return new RailWayDelivery();
    }
}
