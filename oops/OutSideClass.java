package oops;

public class OutSideClass {
    int a;
    String name;
}
class TestStudent {
    public static void main(String[] args) {
        OutSideClass s1 = new OutSideClass();
        System.out.println(s1.a);
        System.out.println(s1.name);
    }
}

