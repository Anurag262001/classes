//anonymous class
//1st abstract 2nd interface
abstract class First
{
   abstract public void method1();
}
class Second extends First
{

    @Override
    public void method1() {
        System.out.println("welcome");
    }
}
public class Result {
    public static void main(String[] args) {
        Second obj = new Second();
        obj.method1();
    }
}



