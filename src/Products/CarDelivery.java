package Products;
public class CarDelivery implements Transport{
    private String nameCompany = "CarCompany";
    private double maxCapasiry = 1300;
    private double size = 160;
    @Override
    public void deliver(String destination) {
        System.out.println("Доставка автотранспортом в " + destination);
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
