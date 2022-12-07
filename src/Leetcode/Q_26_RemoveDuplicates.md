# Intuition

Iniution is simple since we cant allocate a new array we need to make changes to the one we have . This is possible using a ptr which tracks the previous duplicate element.
# Approach
Now we know that we have to keep record of prev ptr so we will use two poiters approach to make our intuition working . We start with initializing a pointer which we will keep at the starting and one just after that so that dont run our loop 1 more time , now everytime value at i!=j we will change the value at i+1 with jth value since at ith value the no duplicate value is placed , now we will increase the value with +1 for both. At the end we return i+1 since i was already stored at 0th place we didn't count it initially for the no duplicate value so we return i with an increment of 1;

# Code
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        return duplicates(nums);
    }
    public static int duplicates(int[] nums){
        int i = 0;
        int j = 1;
        while(j<nums.length){
           if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
                j++;
        }
        return i+1;
    }
}
```