/**
 * 冒泡
 */
public class MethodTest07 {
    public static void main(String[] args) {


        int[] a = {1,2,3,4,1,2};
        showAll(sort(a));

    }



    public static int[] sort(int... a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static void showAll(int... a){
        int c = a[0];
        for (int i = 0; i < a.length; i++) {
            c = a[i];
        }
    }
}
