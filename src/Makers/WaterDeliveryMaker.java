package Makers;
import Products.Transport;
import Products.WaterDelivery;

public class WaterDeliveryMaker implements TransportMaker{
    @Override
    public Transport createTransport() {
        return new WaterDelivery();
    }
}
