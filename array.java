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
               //checking 0 from where next 1 tsart
               	 j =i;
               	if(numss[j+1]==1){
               		//creating new array to store each set of cosecutive 1s
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
        //iterating all 1s after 0
       for(int val:countOne){
           System.out.println(val);       
           }
           System.out.println("***********");
           System.out.println();
       // find largest consecutive 1s    
       int max = countOne[0];    
         for (int g = 1; g < countOne.length; g++){
            if(countOne[g] > max){
                max =countOne[g];}
         }
          return max;
       
        
    }
}


public class Main {
  public static void main(String[] args) {
   int[] nums = new int[]{1,1,0,1,1,1,0,1,1,1,1,0,0,1};
   Solution s = new Solution();
   
    int result = s.findMaxConsecutiveOnes(nums);
    System.out.println("Max consecutive 1s is :"+result);
    
  }
}
