package Makers;
import Products.Transport;
import Products.WaterDelivery;

public class WaterDeliveryMaker implements TransportMaker{
    @Override
    public Transport createTransport() {
        String deliveryType = "по реке";
        return new WaterDelivery(deliveryType);
    }
}
