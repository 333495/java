/**
 * 2 定义一个整型数组，求出数组元素的和、数组元素的最大值和最小值，并输出所求的结果
 */
public class ArrTest2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,4,5};
        int max = nums[0];
        int min = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }

            if (nums[i] < min) {
                min = nums[i];
            }
            sum += nums[i];
        }
        System.out.println(min);//最小
        System.out.println(max);//最大
        System.out.println(sum);//和
    }
}
