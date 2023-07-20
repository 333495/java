public class ArrTest1 {
    public static void main(String[] args) {
        int[] nums = new int[]{11,22,33,44,22,55,22};
        //需求1： 找出数组中元素 22 第二次出现的索引位置
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 22){
                count++;
                if (count == 2){
                    System.out.println(i);
                    break;
                }
            }

        }
    }
}
