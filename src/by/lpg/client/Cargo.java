package by.lpg.client;

public class Cargo {
    public String type;
    public String auto;

    public String price;
//    public int price_delta;

    public String weight;
    public String number_pal;
    public CargoSize size = new CargoSize();

    public String source;
    public String destination;

    @Override
    public String toString() {
        return "Cargo{" +
                "type='" + type + '\'' +
                ", auto='" + auto + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", number_pal=" + number_pal +
                ", size=" + size.toString() +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
