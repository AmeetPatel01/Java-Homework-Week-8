package JavaHomeworkWeek8;

public class Answer17Floor {
    private double width;
    private double length;

    public Answer17Floor(double width, double length){
        this.width = width;
        this.length = length;
        if(length <0){
            this.length = 0;
        }else if (width<0){
            this.width = 0;

        }
    }
    public double getArea(){
        return this.width*length;
    }
}
