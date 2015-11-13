package lisong.qiu.algorithm;

/**
 * Created by qls on 10/19/15.
 */
public class SelectSort {

    public static void main(String[] args){
        int nums[] ={4,2,1,5,3};
        selectSort(nums);
        for(int i :nums){
            System.out.println(i);
        }
    }

    private static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min=i;
            for (int j = i; j < nums.length; j++) {
                if(nums[j] < nums[min]){
                    min=j;
                }
            }
            int t=nums[i];
            nums[i]=nums[min];
            nums[min]=t;
        }
    }

}
