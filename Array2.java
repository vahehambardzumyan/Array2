import java.sql.SQLOutput;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        int[] data=new int[2];
        data = new int[] {2,9};
        System.out.println(no23(data));
    }


    public static boolean no23(int[] nums){

        int a=nums[1];
        int b =nums[0];
        if (a==3 || a==2 || b==3 || b==2){
            return false;
        } else {
            return true;
        }
    }


}
