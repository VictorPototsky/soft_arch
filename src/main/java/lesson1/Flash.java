package lesson1;

public class Flash {
    private Point3D location;
    private Angle3D angle;
    private String color;
    private int power;

    public Flash(Point3D location, Angle3D angle, String color, int power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Point3D getLocation() {
        return location;
    }

    // Переместить свет (метод Move на схеме)
    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }
    // "Повернуть" свет (метод Rotate на схеме)
    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
