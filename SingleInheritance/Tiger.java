package SingleInheritance;

public class Tiger extends Animal {
    void eat() {
        System.out.println("iam eating");
    }

    public static void main(String[] args) {
        Tiger t2 = new Tiger();

        t2.run();
        t2.eat();
    }
}
