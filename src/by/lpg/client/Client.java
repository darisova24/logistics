package by.lpg.client;

import java.util.Arrays;

public class Client {

    public String name;
    public String phone;
    public Cargo[] cargos;

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
//                ", cargos=" + Arrays.toString(cargos) +
                '}';
    }
}
