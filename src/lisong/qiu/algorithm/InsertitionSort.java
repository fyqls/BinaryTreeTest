package lisong.qiu.algorithm;

/**
 * Created by qls on 10/19/15.
 */
public class InsertitionSort {

    public static void main(String[] args){
        int nums[] ={2,5,1,4,3};
        insertSort(nums);
        for(int i :nums) {
            System.out.println(i);
        }
    }

    private static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if(nums[j]<nums[j-1]) {
                    int t=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=t;
                }
            }
        }
    }


}
