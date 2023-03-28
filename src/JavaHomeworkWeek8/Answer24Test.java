package JavaHomeworkWeek8;

public class Answer24Test {
    public static void main(String[] args) {
        Answer24SBI s= new Answer24SBI();
        Answer24ICICI i= new Answer24ICICI();
        Answer24Axis a= new Answer24Axis();
        System.out.println("SBI Rate of Interest:  "+ s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest:  "+ i.getRateOfInterest());
        System.out.println("Axis Rate of Interest:  "+ a.getRateOfInterest());

    }
}
