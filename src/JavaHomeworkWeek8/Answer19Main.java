package JavaHomeworkWeek8;

public class Answer19Main {
    public static void main(String[] args) {
        Answer19Circle circle = new Answer19Circle(3.75);
        System.out.println("circle.radius=" + circle.getRadius());
        System.out.println("circle.area=" + circle.getArea());
        Answer19Cylinder cylinder = new Answer19Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius=" + cylinder.getRadius());
        System.out.println("cylinder.height=" + cylinder.getHeight());
        System.out.println("cylinder.area=" + cylinder.getArea());
        System.out.println("cylinder.volume=" + cylinder.getVolume());
    }
}
