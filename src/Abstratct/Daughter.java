package Abstratct;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
        this.age = age;
    }
    @Override
    void carrer() {
        System.out.println("I am a coder");
    }

    @Override
    void partner() {
        System.out.println("I love iron man");
    }
}

