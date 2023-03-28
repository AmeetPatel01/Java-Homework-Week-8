package JavaHomeworkWeek8;

public class Answer26Encapsulate {
    private String name;
    private int rollNo;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        Answer26Encapsulate obj = new Answer26Encapsulate();
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo:  " + obj.getRollNo());
    }
}
