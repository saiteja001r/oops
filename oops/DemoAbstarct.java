package oops;

 class DemoAbstarct extends Abstract{
                                       // this is child class
      void run1() {
         System.out.println("running");
     }

     public static void main(String[] args) {
         DemoAbstarct obj = new DemoAbstarct();
         obj.run1();
     }
}
