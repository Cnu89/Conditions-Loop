package ExceptionHandling;

public class ExceptionMethod {

    String name= "Srinivas";
    public static void main(String[] args) {

        int[] a=new int[3];

        ExceptionMethod obj=new ExceptionMethod();
        obj=null;

        try { System.out.println(100/0);
        }
        catch(Exception e){
            System.out.println(e);
        }


       try { System.out.println(obj.name);

       }
       catch (Exception e){
           System.out.println(e);
       }

        try {
            a[0]=1;
            a[4]=10;
        }
       catch (Exception e){
            System.out.println(e);
       }
        System.out.println(a[0]);
    }
}
