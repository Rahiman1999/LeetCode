class Solution {
    public boolean isAnagram(String s, String t) {

        char charArray[]= s.toCharArray();
        Arrays.sort(charArray);
        s=Arrays.toString(charArray).replace("[","").replace(", ","").replace("]","");
        charArray=t.toCharArray();
        Arrays.sort(charArray);
        t=Arrays.toString(charArray).replace("[","").replace(", ","").replace("]","");
        if(s.equals(t)){
            return true;
        }

        return false; 
        
    }
}