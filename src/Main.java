import server.companies.*;
import java.io.*;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Coordinates coord = new Coordinates(12, 13);
        Location chlb = new Location(45, 34, 74);
        Address adr = new Address("Engelsa", chlb);
        Organization org1 = new Organization(1, "Yand", coord, 100.1f, "MAO YANDEX", 1000, OrganizationType.COMMERCIAL, adr);
        TreeMap<Integer, Organization> map1 = new TreeMap<>();
        map1.put(org1.getId(), org1);
        System.out.println(map1);
    }
}