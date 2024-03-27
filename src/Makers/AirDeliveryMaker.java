package Makers;
import Products.AirDelivery;
import Products.Transport;

public class AirDeliveryMaker implements TransportMaker{
    @Override
    public Transport createTransport() {
        return new AirDelivery();
    }
}
