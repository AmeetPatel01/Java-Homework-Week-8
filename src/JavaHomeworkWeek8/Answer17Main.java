package JavaHomeworkWeek8;

public class Answer17Main {
    public static void Answer17main(String[] args) {


        Answer17Carpet carpet = new Answer17Carpet((3.5));
        Answer17Floor floor = new Answer17Floor(2.75, 4.0);
        Answer17Calculator calculator = new Answer17Calculator(floor, carpet);
        System.out.println("Total=" + calculator.getTotalCost());
        carpet = new Answer17Carpet(1.5);
        floor = new Answer17Floor(5.4, 4.5);
        calculator = new Answer17Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());

    }
}
