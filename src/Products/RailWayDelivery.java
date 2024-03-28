package Products;
public class RailWayDelivery implements Transport{
    private String nameCompany = "RailWayCompany";
    private double maxCapasiry = 1990;
    private double size = 300;
    @Override
    public void deliver(String destination) {
        System.out.println("Доставка по ж/д путям в " + destination);
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
