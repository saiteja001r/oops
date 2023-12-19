package SingleInheritance;

public class Lion extends Tiger {
    void king() {
        System.out.println("iam the king");

    }

    public static void main(String[] args) {
        Lion t2 = new Lion();
        t2.run();
        t2.eat();
        t2.king();
    }
}
