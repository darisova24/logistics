package by.lpg.carrier;

import java.util.Arrays;

public class Carrier {

    public String name;
    public String phone;
    public Route[] routes;

    @Override
    public String toString() {
        return "Carrier{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
//                ", routes=" + Arrays.toString(routes) +
                '}';
    }
}
