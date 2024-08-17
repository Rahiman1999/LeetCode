class Solution {
    public int partitionString(String s) {
        int i=0,j=0,count=1;
        HashSet<Character> hs = new HashSet<>();
        while(i<s.length()&&j<s.length()){
           if(!hs.contains(s.charAt(j))){
              hs.add(s.charAt(j++));
           }else{
              count++;
              while(hs.size()!=0){
                hs.remove(s.charAt(i++));
              }
           }
            
        }
        return count;
        
    }
}