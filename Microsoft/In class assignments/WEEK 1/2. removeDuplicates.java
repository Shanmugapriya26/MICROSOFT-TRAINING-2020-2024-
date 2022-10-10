class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums[nums.length-1];
        int ind=1,s=1;
        int k=nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==l){
                if(nums[0]==len) return 1;
                swap(nums,i,ind);
                return s+1;
            }
            if(nums[i]!=k){
                k=nums[i];
                swap(nums,i,ind);
                s++;
                index+=1;
            }
        }
        return s;
    }
    public void swap(int[] arr,int i,int ind) {
        int temp=arr[i];
        arr[i]=arr[ind];
        arr[ind]=temp;
    }
}
