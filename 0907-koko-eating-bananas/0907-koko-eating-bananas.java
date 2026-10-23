class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1; // the minimum possible eating speed
        int right = 0; // the intial value will be update while finding the largest pile

        for(int pile: piles){ // this loop is finds max number of bananas in any pile
            right = Math.max(right,pile);
        }
        while(left<right){ 
            int mid = left+(right-left)/2;
            long hours =0;
 
            for(int pile:piles){ // we must use long to make the calculation  safe for long inputs  
                hours += (pile+((long)mid-1))/mid; // celling concept
            }
            if(hours<=h){ // if current speed is sufficient we must look at the smaller speed
                right = mid;

            }else{ // if the speed is to low we must increased it
                left = mid+1;
            }
        }
        return left;
        
    }
}