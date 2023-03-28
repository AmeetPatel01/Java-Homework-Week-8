package JavaHomeworkWeek8;

public class Answer19Cylinder extends Answer19Circle {
    double height;
    public Answer19Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        if(height > 0){
            return height;
        }else{
            height = 0;
            return height;
        }
    }

    public double getVolume(){
        double area = getArea() * getHeight();
        return area;
    }
}
