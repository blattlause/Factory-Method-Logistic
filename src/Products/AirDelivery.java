package Products;
public class AirDelivery implements Transport{
    private String nameCompany = "AirCompany";
    private double maxCapasiry = 2000;
    private double size = 200;
    @Override
    public void deliver(String destination) {
        System.out.println("Доставка по воздуху в " + destination);
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
