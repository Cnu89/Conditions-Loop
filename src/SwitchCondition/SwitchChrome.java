package SwitchCondition;

public class SwitchChrome {
    public static void main(String[] args) {
        String browser="chrome";
        switch (browser){
            case "chrome": System.out.println("chrome is working");break;
            case "IE": System.out.println("IE is working");break;
            case "Edge": System.out.println("Edge is working");break;
            default:System.out.println("chrome browser");break;
        }
    }
}
