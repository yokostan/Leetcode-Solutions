class Solution {
    public int search(int[] nums, int target) {
        return searchHelper(nums,target,0,nums.length-1);
    }
    public static int searchHelper(int[] a, int target, int start, int end){
        if(start>end) return -1;
        int mid = start + (end-start)/2;
        if(a[mid]==target) return mid;
        if(a[start]<=a[mid]){
            if(target>=a[start] && target<=a[mid])
                return searchHelper(a,target,start,mid);
            return searchHelper(a,target,mid+1,end);
        }
        else{
            if(target>=a[mid] && target<=a[end])
                return searchHelper(a,target,mid,end);
            return searchHelper(a,target,start,mid-1);
        }
    }
}