package Abstratct;

public class Son extends Parent {
    public Son(int age) {
        super(age);
        this.age = age;
    }

    @Override
    void carrer() {
        System.out.println("I am going to be a enginner");
    }

    @Override
    void partner() {
        System.out.println("I am cool");

    }
}
