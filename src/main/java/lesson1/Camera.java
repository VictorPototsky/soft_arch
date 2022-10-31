package lesson1;

public class Camera {
    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }
    // Переместить камеру (метод Move)
    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }
    // Повернуть камеру (метод Rotate)
    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

}

