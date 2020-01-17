package largest.smallestnum;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallestNum
{

    public static void main(String[] args)
    {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        int a = kbd.nextInt();
        int b = kbd.nextInt();
        int c = kbd.nextInt();
        int d = kbd.nextInt();
        int e = kbd.nextInt();

        int[] nums =
        {
            a, b, c, d, e
        };
        Arrays.sort(nums);
        System.out.println("Minimum = " + nums[0]);
        System.out.println("Maximum = " + nums[nums.length - 1]);

    }

}
