package Makers;
import Products.CarDelivery;
import Products.Transport;

public class CarDeliveryMaker implements TransportMaker{
    @Override
    public Transport createTransport() {
        return new CarDelivery();
    }
}
