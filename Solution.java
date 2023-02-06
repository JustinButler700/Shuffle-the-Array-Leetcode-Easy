class Solution {
    public int[] shuffle(int[] nums, int n) {
        //Our result will be n*2 in size (as given by the question)
        int[] res = new int[n*2];
        // Our index var switches between even/odd values based on when we hit the mid point of our nums array
        int index = 0;
        for(int i = 0; i < n*2 ; i++){
          //When we hit the mid point, we reset our index to fill in the odd elements of our result array.
            if(i == n){
                index = 1;
            }
          //Increment
            if(index < nums.length){
                res[index] = nums[i];
                index +=2;
            }
        }
        return res;
        
    }
}
