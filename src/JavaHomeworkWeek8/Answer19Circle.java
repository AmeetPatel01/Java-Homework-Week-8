package JavaHomeworkWeek8;

public class Answer19Circle {

        private double radius;

        public Answer19Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            if(radius < 0){
                radius = 0;
                return radius;
            }else{
                return radius;
            }
        }

        public double getArea(){
            double area = (radius * radius * Math.PI);
            return area;
        }
}
