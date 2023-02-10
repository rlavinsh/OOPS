package staticExample;
// the main class can't be static
public class  InnerClasses {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("lavinsh");
        Test b = new Test("rahul");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
