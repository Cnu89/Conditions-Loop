package ExceptionHandling;

public class UsingMethods {

    public void m1(){
        System.out.println("m1 method");
        m2();
    }
    public void m2(){
        System.out.println("m2 method");
        try{
            m3();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public void m3(){
        System.out.println("m3 method");
        int i=9/0;
    }
    public static void main(String[] args) {
        UsingMethods obj=new UsingMethods();
        obj.m1();
        System.out.println("close");

    }
}
