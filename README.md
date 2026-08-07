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
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0167-two-sum-ii-input-array-is-sorted) |
## Two Pointers
|  |
| ------- |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0167-two-sum-ii-input-array-is-sorted) |
## Binary Search
|  |
| ------- |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/sravanthikottakota21-web/leetcode-solutions/tree/master/0167-two-sum-ii-input-array-is-sorted) |
<!---LeetCode Topics End-->