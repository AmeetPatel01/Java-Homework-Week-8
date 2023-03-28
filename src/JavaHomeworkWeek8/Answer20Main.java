package JavaHomeworkWeek8;

public class Answer20Main {
    public static void Answer20main(String[] args) {
        Answer20Rectangle rectangle = new Answer20Rectangle(5,10);
        System.out.println("rectangle.width=" +rectangle.getWidth());
        System.out.println("rectangle.length=" +rectangle.getLength());
        System.out.println("rectangle.area=" +rectangle.getArea());
        Answer20Cuboid cuboid = new Answer20Cuboid(5,10,5);
        System.out.println("cuboid.width=" +cuboid.getWidth());
        System.out.println("cuboid.length=" +cuboid.getLength());
        System.out.println("cuboid.area=" +cuboid.getArea());
        System.out.println("cuboid.height=" +cuboid.getHeight());
        System.out.println("cuboid.height=" +cuboid.getVolume());


    }
}
