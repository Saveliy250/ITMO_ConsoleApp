package server.utilities;

import server.companies.*;

import java.util.Date;
import java.util.Scanner;

public class OrgCreator {
    private static final Scanner scan = new Scanner(System.in);
    private OrgCreator(){}
    public static Organization createOrg(){
        Organization newOrg = new Organization();
        newOrg.setName(readString("organization name"));
        newOrg.setCoordinates(new Coordinates(readDoubleWithLimit("coordinate x", 406), readDouble("coordinate y")));
        newOrg.setCreationDate(new Date());
        newOrg.setAnnualTurnover(readFloat("annual turnover", 0));
        newOrg.setFullName(readString("full name"));
        newOrg.setEmployeesCount(readLongWithLimit("employees count", 0));
        newOrg.setType(readOrgType());
        newOrg.setOfficialAddress(new Address(readString("street"), new Location(readFloat("location x"), readDouble("location y"), readLong("location z"))));
        return newOrg;
    }
    public static String readString(String text){
        System.out.println("Enter " + text + ":\n~");
        String str = scan.nextLine();
        if (str.isEmpty() || str.isBlank() || str.equals("null")){
            readString(text);
        }
        return str;
    }
    public static String readStringWithNull(String text){
        System.out.println("Enter " + text + ":\n~");
        String str = scan.nextLine();
        if (str.equals("null")){
            return null;
        }
        if (str.isEmpty() || str.isBlank()){
            readString(text);
        }
        return str;
    }
    public static Long readLong(String text){
        System.out.println("Enter " + text + " long value:\n~" );
        String str = scan.nextLine();
        try {
            if (str.isEmpty() || str.isBlank()) {
                System.out.println("Incorrect long value");
                readLong(text);
            }
            return Long.parseLong(str);
        } catch(NumberFormatException e){
            System.out.println("Incorrect long value");
            return readLong(text);
        }
    }
    public static Long readLongWithLimit(String text, long limit){
        System.out.println("Enter " + text + " long value, must be more than " + limit + ":\n~" );
        String str = scan.nextLine();
        try {
            if (str.isEmpty() || str.isBlank() || Long.parseLong(str) < limit) {
                System.out.println("Incorrect long value");
                readLongWithLimit(text, limit);
            }
            return Long.parseLong(str);
        } catch(NumberFormatException e){
            System.out.println("Incorrect long value");
            return readLongWithLimit(text, limit);
        }
    }
    public static Double readDoubleWithLimit(String text, double limit){
        System.out.println("Enter " + text + " double value, must be less than " + limit + ":\n~" );
        String str = scan.nextLine();
        try {
            if (str.isEmpty() || str.isBlank() || Double.parseDouble(str) > limit) {
                System.out.println("Incorrect double value");
                readDoubleWithLimit(text, limit);
            }
            return Double.parseDouble(str);
        } catch(NumberFormatException e){
            System.out.println("Incorrect double value");
            return readDoubleWithLimit(text, limit);
        }
    }
    public static Double readDouble(String text){
        System.out.println("Enter " + text + " double value:\n~" );
        String str = scan.nextLine();
        try {
            if (str.isEmpty() || str.isBlank()) {
                System.out.println("Incorrect double value");
                readDouble(text);
            }
            return Double.parseDouble(str);
        } catch(NumberFormatException e){
            System.out.println("Incorrect double value");
            return readDouble(text);
        }
    }
    public static Float readFloat(String text){
        System.out.println("Enter " + text + " float value:\n~");
        String str = scan.nextLine();
        if (str.isEmpty() || str.isBlank()){
            System.out.println("incorrect float value");
            readFloat(text);
        }
        try {
            return Float.parseFloat(str);
        } catch(NumberFormatException e){
            return readFloat(text);
        }
    }
    public static Float readFloat(String text, float limit){
        System.out.println("Enter " + text + " float value, must be more than " + limit + ":\n~");
        String str = scan.nextLine();
        if (str.isEmpty() || str.isBlank() || Float.parseFloat(str) < limit){
            System.out.println("incorrect float value");
            readFloat(text);
        }
        try {
            return Float.parseFloat(str);
        } catch(NumberFormatException e){
            return readFloat(text);
        }
    }
    public static OrganizationType readOrgType(){
        System.out.println("Enter organization type");
        String str = scan.nextLine();
        if (str.isEmpty() || str.isBlank()){
            System.out.println("Incorrect organization type value");
            readOrgType();
        }
        try{
            return OrganizationType.valueOf(str);
        } catch(IllegalArgumentException e){
            System.out.println("Incorrect organization type value");
            return readOrgType();
        }
    }

}
