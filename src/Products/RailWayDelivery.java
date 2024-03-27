package Products;
public class RailWayDelivery implements Transport{
    @Override
    public void deliver(String destination) {
        System.out.println("Доставка по ж/д путям в " + destination);
    }    
}
