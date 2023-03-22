/**
 * 统计int数组中奇数的个数
 * 统计int数组中出现次数最多的元素（选做）//统计int数组中平均值
 * 统计一个数组中3的倍数的元素有几个
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("===========1============");
        int[] num = new int[]{1,2,3,4,5,6,8};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

        //统计int数组中出现次数最多的元素（选做）//统计int数组中平均值
        System.out.println("===========2============");
        int[] number = new int[]{1,1,1,1,2,2,3,3,3,4};
        int count2 = 0;
        for (int i = 0; i < number.length; i++) {

            System.out.println(count2);
        }

        System.out.println("===========3============");
        int[] num2 = new int[]{1,2,3,4,5,6,7,8,9,10,12};
        int count3 = 0;
        for (int i = 0; i < num2.length; i++) {
            if (num2[i] % 3 == 0){
                count3++;
            }
        }
        System.out.println(count3);
    }


}
