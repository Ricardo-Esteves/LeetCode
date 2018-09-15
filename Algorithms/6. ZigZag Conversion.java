class Solution {
    
    //Time Complexity: O(n)
    public String convert(String s, int numRows) {
        
        List<StringBuilder> rows = new ArrayList<>();
        StringBuilder ret = new StringBuilder();
        int currRow = 0;
        boolean goingDown = false;
        
        //Base Case
        if (numRows == 1) return s;
        
        //Construct n Rows 
        for (int i = 0; i < Math.min(numRows, s.length()) ; i++)
            rows.add(new StringBuilder());
        
        //Fill the rows
        for (char c : s.toCharArray()){
            
            rows.get(currRow).append(c);
            
            if (currRow == numRows - 1 || currRow == 0) goingDown = !goingDown;
            
            currRow += goingDown ? 1 : -1;
        }
        
        //Append all rows in a string
        for (StringBuilder row: rows) ret.append(row);
        return ret.toString();
    }
}