package Products;
public class WaterDelivery implements Transport{
    private String nameCompany = "WaterCompany";
    private double maxCapasiry = 1890;
    private double size = 120;
    private String deliveryType;

    @Override
    public void deliver(String destination) {
        System.out.println("Доставка по водным путям в пункт назначения: " + destination + ", используя: " + getDeliveryType());
    }
    
    public WaterDelivery(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryType() {
        return this.deliveryType;
    }

    @Override
    public String getNameCompany() {
        return this.nameCompany;
    }

    @Override
    public double getMaxCapasiry() {
        return this.maxCapasiry;
    }

    @Override
    public double getSize() {
        return this.size;
    }
}
