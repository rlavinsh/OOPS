public class WrapperExample {
    public static void main(String[] args) {
        int a  = 10;
        int b = 20;

        Integer num = 45;
        swap(a,b);
        System.out.println(a+" "+b);

        final A lavinsh = new A("lavinsh rathor");
        lavinsh.name = "anotherName";
        // when a non primitive is final you can't reassign it.
       // lavinsh = new A("new Object");

        // Final Keyword
//        final int age=  20;
//        age = 15;

        A obj;
        for (int i = 0; i < 100000000; i++) {
            obj = new A("Random name");

        }


    }
    static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }

}
class A{
    // because final variables have to intialized while declaring
    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("object is created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}
