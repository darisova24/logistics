package by.lpg;

import by.lpg.carrier.Carrier;
import by.lpg.carrier.Route;
import by.lpg.client.Cargo;
import by.lpg.client.CargoSize;
import by.lpg.client.Client;
import by.lpg.contract.Contract;
import org.w3c.dom.ls.LSOutput;


import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	      clients
//        Client client = new Client();
//        client.name = "Atlant";
//        client.phone = "+375333041406";

//        cargo
//        Cargo cargo = new Cargo();
//        cargo.type = "LTL";
//        cargo.auto = "TENT";
//        cargo.weight = 10000;
//        cargo.size = new CargoSize();
//        cargo.size.height = 1200;
//        cargo.size.width = 800;
//        cargo.size.length = 1200;
//        cargo.number_pal = 2;
//        cargo.price = 1500;
//        cargo.source = "Minsk";
//        cargo.destination = "Brno";

//        client.cargos = new Cargo[10];
//        client.cargos[0] = cargo;

//        carriers
//        Carrier carrier = new Carrier();
//        carrier.name = "Capitan";
//        carrier.phone = "+95939700000";
//
//        Route route = new Route();
//        route.price = 1500;
//        route.auto = "TENT";
//        route.source = "Minsk";
//        route.destination = "Brno";
//
//        carrier.routes = new Route[10];
//        carrier.routes[0] = route;
//
////        contract
//        Contract contract = new Contract();
//        contract.loadingDate = "20-02-2021 9:00";
//        contract.unloadingDate = "24-02-2021 15:00";
//
//        contract.client = client;
//        contract.carrier = carrier;
//        contract.cargo = cargo;
//
//        System.out.println(contract.toString());
//wywod
        Scanner scanner = new Scanner(System.in);
        Contract contract = new Contract();

        System.out.print("Введите дату загрузки: ");
        contract.loadingDate = scanner.nextLine();
        System.out.print("Введите дату выгрузки: ");
        contract.unloadingDate = scanner.nextLine();

        Route route = new Route();
        System.out.print("Город загрузки: ");
        route.source = scanner.nextLine();
        System.out.print("Город выгрузки: ");
        route.destination = scanner.nextLine();

        Client client = new Client();
        System.out.print("Имя клиента: ");
        client.name = scanner.nextLine();
        System.out.print("Тел.клиента: ");
        client.phone = scanner.nextLine();

        Carrier carrier = new Carrier();
        System.out.print("Имя перевозчика: ");
        carrier.name = scanner.nextLine();
        System.out.print("Телефон перевозчика: ");
        carrier.phone = scanner.nextLine();

        Cargo cargo = new Cargo();
        System.out.print("Сборка/соло: ");
        cargo.type = scanner.nextLine();
        System.out.print("Тип авто: ");
        cargo.auto = scanner.nextLine();
        System.out.print("Стоимость: ");
        cargo.price = scanner.nextLine();
        System.out.print("Вес груза: ");
        cargo.weight = scanner.nextLine();
        System.out.print("Кол-во паллет: ");
        cargo.number_pal = scanner.nextLine();
        System.out.print("Длина: ");

        cargo.size.length = scanner.nextLine();
        System.out.print(" Ширина: ");
        cargo.size.width = scanner.nextLine();
        System.out.print(" Высота: ");
        cargo.size.height = scanner.nextLine();


        System.out.println("Дата загрузки " + contract.loadingDate + " - Дата выгрузки " + contract.unloadingDate + ";");
        System.out.println("Город загрузки: " + route.source + " - " + "Город выгрузки: " + route.destination + ".");
        System.out.println("Имя клиента " + client.name + " - Тел.клиента " + client.phone + ";");
        System.out.println("Имя перевозчика " + carrier.name + " - Телефон перевозчика " + carrier.phone + ";");
        System.out.println("Сборка/соло " + cargo.type + " - Тип авто " + cargo.auto + ";");
        System.out.println("Стоимость " + cargo.price + ";");
        System.out.println("Вес груза " + cargo.weight);
        System.out.println("Кол-во паллет " + cargo.number_pal);
        System.out.println("Длина: " + cargo.size.length + " Ширина: " + cargo.size.width + " Высота: " + cargo.size.height + ";");


    }
}
