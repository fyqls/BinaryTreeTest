package lisong.qiu.algorithm;

/**
 * Created by qls on 10/19/15.
 */
public class MergeSort {

    public static void main(String[] args){
        int nums1[] ={1,4,7};
        int nums2[] ={2,5,8,10,12};
        int nums3[] ={3,9,11};
        int[] nums = mergeSort(nums1,nums2,nums3);
        for(int i : nums){
            System.out.println(i);
        }
    }

    private static int[] mergeSort(int[] nums1, int[] nums2, int[] nums3) {
        int[] nums=new int[nums1.length+nums2.length+nums3.length];
        boolean flag=true;
        int i=0;int j=0;int k=0;
        int idx=0;
        while(flag){
            if(idx>nums.length){
                flag = false;
                break;
            }
            nums[idx]=getMin(nums1, nums2, nums3,i,j,k);
            idx++;
            if(nums1[i] == nums[idx]){
               i++;
            }
            if(nums2[j] == nums[idx]){
                j++;
            }
            if(nums3[k] == nums[idx]){
                k++;
            }
        }
        return nums;
    }

    private static int getMin(int[] nums1, int[] nums2, int[] nums3, int a, int b, int c) {
        if(a>nums1.length-1){
            nums1[a]=Integer.MAX_VALUE;
        }
        if(b>nums2.length-1){
            nums1[a]=Integer.MAX_VALUE;
        }
        if(b>nums3.length-1){
            nums1[a]=Integer.MAX_VALUE;
        }
        return Math.min(Math.min(nums1[a], nums2[b]), nums3[c]);
    }


}
