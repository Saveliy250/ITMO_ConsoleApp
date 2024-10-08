package server.companies;

import java.util.ArrayList;
import java.util.Date;

public class Organization {
    private Integer id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private float annualTurnover; //Значение поля должно быть больше 0
    private String fullName; //Длина строки не должна быть больше 1500, Поле не может быть null
    private long employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле не может быть null
    private Address officialAddress; //Поле не может быть null
    public Organization(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getOfficialAddress() {
        return officialAddress;
    }

    public void setOfficialAddress(Address officialAddress) {
        this.officialAddress = officialAddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(long employeesCount) {
        this.employeesCount = employeesCount;
    }

    public OrganizationType getType() {
        return type;
    }

    public void setType(OrganizationType type) {
        this.type = type;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public float getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(float annualTurnover) {
        this.annualTurnover = annualTurnover;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    @Override
    public String toString() {
        return "Organization{" +
                " name='" + name + '\'' +
                ", coordinates=" + coordinates +
                ", creationDate=" + creationDate +
                ", annualTurnover=" + annualTurnover +
                ", fullName='" + fullName + '\'' +
                ", employeesCount=" + employeesCount +
                ", type=" + type +
                ", officialAddress=" + officialAddress +
                '}';
    }

    public static Organization fromArray(String[] a) {
        Organization neworg = new Organization();
        Integer id;
        String name;
        Coordinates coordinates;
        java.util.Date creationDate;
        float annualTurnover;
        String fullName;
        long employeesCount;
        OrganizationType type;
        Address officialAddress;
        try {
            try {
                id = Integer.parseInt(a[0]);
            } catch (NumberFormatException e) { id = null; }
            name = a[1];
            coordinates = new Coordinates(Double.parseDouble(a[3]), Double.parseDouble(a[4]));
            annualTurnover = Float.parseFloat(a[5]);
            fullName = a[6];
            employeesCount = Long.parseLong(a[7]);
            officialAddress = new Address(a[9], new Location(Float.parseFloat(a[10]), Double.parseDouble(a[11]), Long.parseLong(a[12])));
            try {
                type = a[8].equals("null") ? null : OrganizationType.valueOf(a[8]);
            } catch (NullPointerException | IllegalArgumentException  e) { type = null; }
            neworg.setId(id);
            neworg.setName(name);
            neworg.setCoordinates(coordinates);
            neworg.setAnnualTurnover(annualTurnover);
            neworg.setFullName(fullName);
            neworg.setEmployeesCount(employeesCount);
            neworg.setType(type);
            neworg.setOfficialAddress(officialAddress);
            return neworg;
        } catch (ArrayIndexOutOfBoundsException e) {}
        return null;
    }

    public static String [] toArray(Organization org){
        var list = new ArrayList<String>();
        list.add(org.getId().toString());
        list.add(org.getName());
        list.add(org.getCoordinates().toString());
        list.add(String.valueOf(org.getAnnualTurnover()));
        list.add(org.getFullName());
        list.add(String.valueOf(org.getEmployeesCount()));
        list.add(org.getType().toString());
        list.add(org.getOfficialAddress().toString());
        return list.toArray(new String[0]);
    }
}
