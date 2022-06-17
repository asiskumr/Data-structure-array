/*

Given a binary array nums, return the maximum number of consecutive 1's in the array.

Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.

*/
 class Solution {
	public int numss[];
    public int findMaxConsecutiveOnes(int[] numss) {
        int[] countOne = new int[10];
        int len = numss.length;
        int count =0;
         int k=0;
         int j;
        for(int i=0; i<len; i++){
         
            if(numss[i]==1){
                 count++;

            }
            else 
               {
               	 j =i;
               	if(numss[j+1]==1){
               		
                	while(k < countOne.length){
                    	countOne[k]=count;
                       
                   		 break;
               	 	}
                	k++;
          			count = 0; //continue;
              }
              else{
              	continue;
              }
        countOne[k]=count;
        }
        }
       for(int val:countOne){
           System.out.println(val);       }
        return 1;
    }
}


public class Main {
  public static void main(String[] args) {
   int[] nums = new int[]{1,1,0,1,1,1,0,1,1,1,1,0,0,1};
   Solution s = new Solution();
   
    s.findMaxConsecutiveOnes(nums);
    
  }
}
