package server.companies;

public class Location {
    private float x;
    private Double y; //Поле не может быть null
    private long z;
    public Location(float x, double y, long z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
