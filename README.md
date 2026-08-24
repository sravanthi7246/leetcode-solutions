class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length())
            return false;
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;

        }
        for(int c:count){
           if(c!=0)
           return false;
        }
        return true;
    }
}

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0011-container-with-most-water) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0042-trapping-rain-water](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0042-trapping-rain-water) |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0167-two-sum-ii-input-array-is-sorted) |
## Two Pointers
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0011-container-with-most-water) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0042-trapping-rain-water](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0042-trapping-rain-water) |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0167-two-sum-ii-input-array-is-sorted) |
## Binary Search
|  |
| ------- |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0167-two-sum-ii-input-array-is-sorted) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0011-container-with-most-water) |
## Dynamic Programming
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0042-trapping-rain-water) |
## Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0042-trapping-rain-water) |
## Monotonic Stack
|  |
| ------- |
| [0042-trapping-rain-water](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0042-trapping-rain-water) |
<!---LeetCode Topics End-->