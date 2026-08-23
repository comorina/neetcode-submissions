class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }
        String regx = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int start = 0;
        int end = regx.length()-1;

        while(start < end){
            if(regx.charAt(start) != regx.charAt(end)){
                return false;
            }
           ++start;
            --end;
        }
        return true;
    }

}
