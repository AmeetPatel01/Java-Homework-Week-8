package JavaHomeworkWeek8;

public class Answer20Cuboid extends Answer20Rectangle{
    private double height;
    public Answer20Cuboid(double width, double length, double height){
        super(width, length);
        this.height = height <0 ?0: height;

    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return getArea() * getHeight();
    }
}
