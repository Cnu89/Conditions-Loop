package ExceptionHandling;

public class ExampleofTryCatchs {

    String name= "Srinivas";
    public static void main(String[] args) {

        int[] a=new int[3];

        ExampleofTryCatchs obj=new ExampleofTryCatchs();
        obj=null;

        try { System.out.println(100/0);
            System.out.println(obj.name);
            a[0]=1;
            a[4]=10;

        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Remove exiting connections");
        }
        System.out.println(a[0]);

    }
}
