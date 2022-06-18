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

class Solution{
    public int maxConsOne(int[] arr ){
        int len =arr.length;
        int count =0; int max=0;int result=0;
        for(int i=0; i< len; i++){
            if(arr[i]==0){
                count=0;
            }
            else{
                count++;   
                if(i!=len-1){
                    if(arr[i+1]==0 ){
                        max=count; 
                    }
                } 
                else{
                    max = count;
                    }
                if(i==0){
                    result =max; 
                }
                if(result>max){
                    
                }
                else{
                    result =max;
                }
            }    
        }        
        return result;        
    }        
        
}        
        
class Main{
    
    public static void main(String[] args){
        
      int[] arr = new int[]{0,1,1,1,0,1,1,0,0,1,0,1,1,1,0,0,0,0};
      Solution c= new Solution();
      System.out.println(c.maxConsOne(arr));
    }
}        
    
    


