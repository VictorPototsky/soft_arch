package lesson1;

import java.util.List;

public class Poligon {
    private String color;
    private Point3D location;

    public Poligon(String color, Point3D location) {
        this.color = color;
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }
}
