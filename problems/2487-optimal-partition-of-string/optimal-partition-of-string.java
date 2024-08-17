class Solution {
    public int partitionString(String s) {
        int j=0,count=1;
        HashSet<Character> hs = new HashSet<>();
        while(j<s.length()){
           if(!hs.contains(s.charAt(j))){
              hs.add(s.charAt(j++));
           }else{
              count++;
            hs.clear();
           }
            
        }
        return count;
        
    }
}