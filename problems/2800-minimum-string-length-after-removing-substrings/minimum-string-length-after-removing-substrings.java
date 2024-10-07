class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();

        for(char x:s.toCharArray()){
            if(x=='B'&&!st.isEmpty()&&st.peek()=='A'){
                st.pop();
            }else if(x=='D'&&!st.isEmpty()&&st.peek()=='C'){
                st.pop();
            }else{
                st.push(x);
            }
            
        }

        return st.size();
        
    }
}