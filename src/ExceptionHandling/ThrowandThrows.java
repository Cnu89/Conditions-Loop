package ExceptionHandling;

public class ThrowandThrows {
    public void m1() throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int i=9/1;
        int[] a=new int[3];
        a[4]=5;
        System.out.println(i);
    }

    public static void getinfo(){
        String data=null;
        try {
            if(data==null){
                throw new Exception("Data not found");
            }
            else{
                System.out.println(data);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        getinfo();
        ThrowandThrows obj=new ThrowandThrows();
        obj.m1();

    }
}
