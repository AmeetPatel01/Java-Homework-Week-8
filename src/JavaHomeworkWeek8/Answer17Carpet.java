package JavaHomeworkWeek8;

public class Answer17Carpet {
    private double cost;

    public Answer17Carpet(double cost) {
        this.cost = cost;

    }

    public double getCost() {
        if (cost < 0) {
            cost = 0;

        }

        return this.cost;
    }
}
