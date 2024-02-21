class Solution {
    public boolean isPalindrome(String A) {
        String S="";
		for(char value:A.toCharArray()){
		    if(value>='A'&&value<='Z'){
		        int smallLetter = value+32;
		        S+=(char)smallLetter;
		    }else if(value>='a'&&value<='z'){
		        S+=value;
		    }else if(value>='0'&&value<='9'){
                S+=value;
            }
		}
        
        
		int i=0,j=S.length()-1;
		while(i<=j){
		    if(S.charAt(i)!=S.charAt(j)){
		        return false;
		    }
		    i++;j--;
		}
        return true;
    }
}