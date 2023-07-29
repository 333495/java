import java.util.Random;

/**
 * 统计int数组中出现次数最多的元素（选做）//统计int数组中平均值
 */
public class Test1 {
    public static void main(String[] args) {
//        int[] nums = Add(5);
        int[] nums = new int[]{0, 1, 1, 1, 2, 2, 8, 7, 3, 34, 4, 4};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        double avg = sum;
        System.out.println(avg / nums.length);//平均值


        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    temp++;
                }
            }
            array[i] = temp;
        }
//        for (int a:array
//             ) {
//            System.out.println(a);
//        }
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("出现次数最多的元素是：" + nums[maxIndex]);


        int[] nums2 = new int[]{0, 1, 1, 1, 2, 2,3,4,3,3, 8, 7, 3, 34, 4, 4};
        System.out.println(getMaxValue(nums2));
    }

    public static int getMaxValue(int[] nums){
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]){
                    temp++;
                }
            }
            newArray[i] = temp;
//            System.out.println(temp);
        }

        int maxIndex = 0;
        int max = newArray[0];
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] > max){
                max = newArray[i];
                maxIndex = i;
            }
        }


        return nums[maxIndex];
    }





















    public static int[] Add(int num){
        int number[] = new int[num];
        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(100);
        }
        System.out.println(number);
        return number;
    }
}
