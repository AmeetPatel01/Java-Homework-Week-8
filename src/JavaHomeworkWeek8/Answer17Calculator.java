package JavaHomeworkWeek8;

public class Answer17Calculator {
    private Answer17Floor floor;
    private Answer17Carpet carpet;

    public Answer17Calculator(Answer17Floor floor, Answer17Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
