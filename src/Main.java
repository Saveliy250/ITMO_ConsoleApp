import server.companies.*;
import server.managers.DumpManager;

import java.util.Scanner;
import java.util.TreeMap;

import static server.utilities.OrgCreator.createOrg;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coordinates coord = new Coordinates(12, 13);
        Location chlb = new Location(45, 34, 74);
        Address adr = new Address("Engelsa", chlb);
        TreeMap<Integer, String[]> map1 = new TreeMap<>();
        Organization org1 = createOrg();
        System.out.println("Введите id:");
        Integer id = scanner.nextInt();
        org1.setId(id);
        System.out.println(map1);
        TreeMap<Integer, String[]> map4 = new TreeMap<>();
        map4.put(id,Organization.toArray(org1));
        Organization org2 = Organization.fromArray(Organization.toArray(org1));
        System.out.println(org2);
        String csv = DumpManager.treeMapToCsv(map4);
        System.out.println(csv);
        String command = scanner.nextLine();

    }
}