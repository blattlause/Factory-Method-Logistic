package Products;
public class WaterDelivery implements Transport{
    @Override
    public void deliver(String destination) {
        System.out.println("Доставка по водным путям в " + destination);
    }    
}
