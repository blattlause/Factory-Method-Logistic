package Makers;

public class SelectDelivery {
    public TransportMaker selectTransport(String destination) {
        TransportMaker maker = null;
        switch (destination) {
            case "Россия":
            maker = new RailWayDeliveryMaker();
                break;
            case "США":
            maker = new WaterDeliveryMaker();
                break;
            case "Беларусь":
            maker = new CarDeliveryMaker();
            break;
            case "Германия": 
            maker = new AirDeliveryMaker();
            break;
            default:
                break;
        }
        return maker;
    }
}
