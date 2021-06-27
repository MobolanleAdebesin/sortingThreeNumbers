import java.io.*;

/*
Use the keyboard to enter three numbers, and display them in descending order.
The displayed numbers must be separated by spaces.
Requirements:
•	The program should read the numbers from the keyboard.
•	The program should display numbers on the screen.
•	The program should display three numbers separated by spaces.
•	The program should display the numbers in descending order.
 */
public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int[] nums = {a, b, c};

        int p1 = 0;
        int p2 = 1;

        while(p2 < nums.length){
            if(nums[p1] < nums[p2]){
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
            }
            p1 += 1;
            p2 += 1;
        }
        if(nums[1] > nums[0]){
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1] = temp;
        }
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
    }

}
