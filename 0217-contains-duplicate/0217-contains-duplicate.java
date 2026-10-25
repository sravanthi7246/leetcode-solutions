class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>(); // create an empty hashset
        // as we traverse in each number and store it in set

        for(int num:nums){ // iterate each value in the nums array at one time

            if(!set.add(num)){ // this is a key point to remenber and check for dupilcate
                return true;
            }
        }
        return false;
        
    }
}