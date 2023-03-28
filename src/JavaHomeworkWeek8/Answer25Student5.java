package JavaHomeworkWeek8;

public class Answer25Student5 {int id;
    String name;
    int age;

    Answer25Student5(int i, String n){
        id= i;
        name= n;
    }
    Answer25Student5( int i,String n, int a){
        id = i;
        name= n;
        age= a;
    }
    public void display(){
        System.out.println(id + name +" "+age);
    }

    public static void main(String[] args) {
        Answer25Student5 s1= new Answer25Student5(111, " Karan ");
        Answer25Student5 s2 = new Answer25Student5(222, " Aryan ", 25);
        s1.display();
        s2.display();
    }
}
