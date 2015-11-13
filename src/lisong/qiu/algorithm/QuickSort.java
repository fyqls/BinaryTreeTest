package lisong.qiu.algorithm;

/**
 * Created by qls on 10/19/15.
 */
public class QuickSort {

    public static void main(String[] args){
        int nums[] ={4,2,1,5,3};
        quickSort(nums,0,nums.length-1);
        for(int i :nums){
            System.out.println(i);
        }
    }

    private static void quickSort(int[] nums,int start,int end) {
        if(end > start) {
            int mid = getMiddle(nums, start, end);
            quickSort(nums, start, mid - 1);
            quickSort(nums, mid + 1, end);
        }
    }

    private static int getMiddle(int[] nums, int start, int end) {
         int tmp=nums[start];
         while(end > start){
             while(nums[end] > tmp && end > start){
                 end--;
             }
             nums[start]=nums[end];
             while(nums[start] < tmp && end > start){
                  start++;
             }
             nums[end]=nums[start];
         }
        nums[start]=tmp;
        return start;
    }


}
