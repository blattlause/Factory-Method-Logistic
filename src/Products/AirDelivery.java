package Products;
public class AirDelivery implements Transport{
    @Override
    public void deliver(String destination) {
        System.out.println("Доставка по воздуху в " + destination);
    }    
}
