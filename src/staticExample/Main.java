package staticExample;

public class Main {
    public static void main(String[] args) {
//        Human lavinsh = new Human(22,"lavinsh",10000,false);
//        Human rahul = new Human(22,"Rahul",15000,true);
//        Human rah = new Human(21,"arpit",17000,true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

     Main mm = new Main();
        mm.greeting();
        fun();
        mm.fun2();

    }
    // this not depend on object
    static void fun(){
        Main obj = new Main();
        obj.greeting();// you can use this because its needs instance
        // but the function is not depend on instance

    }
    //depend on object
    void greeting(){
     //   fun();
        System.out.println("hello world");
    }
    void fun2(){
        greeting();
    }
}
