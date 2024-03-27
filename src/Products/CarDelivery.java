package Products;
public class CarDelivery implements Transport{
    @Override
    public void deliver(String destination) {
        System.out.println("Доставка автотранспортом в " + destination);
    }    
}
