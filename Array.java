import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] data=new int[10];
        data = new int[] {13,6,1,2,6};
        System.out.println(firstLast6(data));
    }


    public static boolean firstLast6(int[] nums) {

        int a=nums[nums.length-1];
        int b =nums[0];
        if (a==6 || b==6 ){
            return true;
        } else {
            return false;
        }
    }


}
