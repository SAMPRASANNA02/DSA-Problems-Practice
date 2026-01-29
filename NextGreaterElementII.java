class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        
    int n = nums.length;
    int[] da = new int[n*2];
     for(int i =0; i< n; i++) {
        da[i] = da[i+n] = nums[i];
     }   

     int[] res = new int[n];
     for(int i =0; i<n; i++) {
        res[i] = -1;
        for(int j =i+1; j<da.length; j++) {
            if(da[j] > nums[i]) {
                res[i] = da[j];
                break;
            }
        }
     }
     return res;
    }
}