import java.util.Arrays;
import java.util.Scanner;

public class question_1 {

  public static int check(int nums[], int index, int prev) {

    if (index >= nums.length)
      return 0;
    int max = 0;

    if (prev == -1 || nums[index] > prev) {
      max = 1 + check(nums, index + 1, nums[index]);

    }
    return Math.max(check(nums, index + 1, prev), max);

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nums[] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    Integer dp[][] = new Integer[nums.length][nums.length + 1];
    System.out.println(check(nums, 0, -1));
  }
}