class Solution {
    public String longestPalindrome(String s) {
        
        int start = 0, end = 0;
        
        //Base Case
        if (s.length() < 1) return s;
        
        for (int i = 0 ; i < s.length(); i++){
            
            //Find length if the substring have Odd size
            int lenOdd = findLenght(s,i,i);
            //Find length if the substring have Even size
            int lenEven = findLenght(s,i,i+1);
            //Find the maximum length of substring
            int len = Math.max(lenOdd,lenEven);
            
            if (len > end - start) {
                
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        //Return the maximum Palindrome substring found
        return s.substring(start,end + 1);
    }
    
    //Auxiliar method to find the size of the palindrome substring
    private int findLenght(String s, int start, int end){
        
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
            
                start--;
                end++;
        }
        
        return end - start - 1;
    }
}