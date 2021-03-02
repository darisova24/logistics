package by.lpg.contract;

import by.lpg.carrier.Carrier;
import by.lpg.client.Cargo;
import by.lpg.client.Client;

public class Contract {

    public String loadingDate;
    public String unloadingDate;

    public Client client;
    public Carrier carrier;
    public Cargo cargo;

//    public String auto;

    @Override
    public String toString() {
        return "Contract{" +
                "loadingDate='" + loadingDate + '\'' +
                ", unloadingDate='" + unloadingDate + '\'' +
                ", client=" + client.toString() +
                ", carrier=" + carrier.toString() +
                ", cargo=" + cargo.toString() +
                '}';
    }
}
