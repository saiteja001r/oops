package Override;

public class Test extends Demo{
    void run() {

        System.out.println("working");
        super.run();
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.run();
    }
}
