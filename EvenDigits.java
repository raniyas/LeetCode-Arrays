class Solution {
    public int findNumbers(int[] nums) {
        int num=0;
        int count=0;
        int isEven=0;
        for(int i=0; i<nums.length; i++){
        	num = nums[i];
            count = 0;
            while(num!=0){
            	num = num/10;
                count++;         
            } 
            if(count%2==0){
                isEven++;
            }
        }
        return isEven;
    }
}
