package by.lpg;

import by.lpg.carrier.Carrier;
import by.lpg.carrier.Route;
import by.lpg.client.Cargo;
import by.lpg.client.CargoSize;
import by.lpg.client.Client;
import by.lpg.contract.Contract;

public class Main {

    public static void main(String[] args) {
//	      clients
        Client client = new Client();
        client.name = "Atlant";
        client.phone = "+375333041406";

//        cargo
        Cargo cargo = new Cargo();
        cargo.type = "LTL";
        cargo.auto = "TENT";
        cargo.weight = 10000;
        cargo.size = new CargoSize();
        cargo.size.height = 1200;
        cargo.size.width = 800;
        cargo.size.length = 1200;
        cargo.number_pal = 2;
        cargo.price = 1500;
        cargo.source = "Minsk";
        cargo.destination = "Brno";

        client.cargos = new Cargo[10];
        client.cargos[0] = cargo;

//        carriers
        Carrier carrier = new Carrier();
        carrier.name = "Capitan";
        carrier.phone = "+95939700000";

        Route route = new Route();
        route.price = 1500;
        route.auto = "TENT";
        route.source = "Minsk";
        route.destination = "Brno";

        carrier.routes = new Route[10];
        carrier.routes[0] = route;

//        contract
        Contract contract = new Contract();
        contract.loadingDate = "20-02-2021 9:00";
        contract.unloadingDate = "24-02-2021 15:00";

        contract.client = client;
        contract.carrier = carrier;
        contract.cargo = cargo;

        System.out.println(contract.toString());

    }
}
