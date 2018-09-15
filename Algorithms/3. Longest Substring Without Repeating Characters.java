class Solution {
    //Time Complexity: O(n) -> n represents the number of characters
    public int lengthOfLongestSubstring(String s) {
        
        Set <Character> set = new HashSet<>();
        
        int i = 0, j= 0, result = 0;
        
        while(i < s.length()){
            
            //Check if the letter is not in the set
            if (!set.contains(s.charAt(i))){
            
                //If not add the letter to the set
                set.add(s.charAt(i++));
                //Save in result if was the longest substring that appears
                result = Math.max(result, i - j);
                
            }else{
                //When the letter is in the set remove
                set.remove(s.charAt(j++));
            }
        }
        
        return result;
    }
}