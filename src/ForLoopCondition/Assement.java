package ForLoopCondition;

public class Assement {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7,8,9,10};
        float sum = 0;
        for (int i = 0; i <=nums.length-1; i++) {
            sum = sum + nums[i];
        }
        double average=  sum/nums.length;
        System.out.println("Average"+ average);

    }
}