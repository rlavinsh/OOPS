package world;

import java.util.Arrays;

public class interview {
    public static void main(String[] args) {
        Student[]  students = new Student[5];
        // just declaring
//        Student lavins;
//        lavins = new Student();

        Student lavinsh = new Student();
        // Now I am Accessing it
//        lavinsh.rollno = 21;
//        lavinsh.name = "rathor";
//        lavinsh.marks = 88.5f;


        System.out.println(lavinsh.rollno);
        System.out.println(lavinsh.name);
        System.out.println(lavinsh.marks);
        Student rat = new Student(13,"lavi",92.0f);
        rat.changeName("rahul");
        rat.greeting();
        System.out.println(rat.name);
        System.out.println(rat.marks);
        System.out.println(rat.rollno);

        Student lav = new Student(rat);
        System.out.println(lav.name);
        System.out.println(lav.marks);

//        System.out.println(Arrays.toString(students));

    }
}
class Student{
    int rollno;
    String name;
    float marks;

//    public Student(){
//    }
    void greeting(){
        System.out.println("hello how are you "+this.name);
    }
    void changeName(String newName){
        name = newName;
    }
    Student(){
     this(25,"harsh",50.f);
    }

    // Object to Object
    Student (Student other){
        this.name  = other.name;
        this.marks = other.marks;
        this.rollno = other.rollno;
    }

    // we need a way to add the values of the above
    //properties object by object

    Student(int rollno, String name, float marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

}
