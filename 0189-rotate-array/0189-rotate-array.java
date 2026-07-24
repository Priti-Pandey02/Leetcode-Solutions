class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int s,e,temp;
        k = k % n ;

        s=0;
        e=n-1;
        while(s<e){
            temp = nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }

        s=0;
        e=k-1;
        while(s<e){
            temp = nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }

        s=k;
        e=n-1;
        while(s<e){
            temp = nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }

        System.out.println(Arrays.toString(nums));
    }
}