public class Father {
    static void fun1()
    {
        System.out.println("Father class fun1 called");
    }

    void fun2()
    {
        System.out.println("Father class fun2 called");
    }
}
class Child extends Father{
    //@Override : static method can not be overriden
    static void fun1()
    {
        System.out.println("Child class fun1 called");
    }

    @Override
    void fun2()
    {
        System.out.println("Child class fun2 called");
    }

    public static void main(String[] args) {
      Father f  = new Child();
      f.fun1();
    }
}
