class Solution {
    HashMap<Character, ArrayList<String>> hm = new HashMap<>();
    List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return ans;
        }
        hm.put('1',new ArrayList<>(Arrays.asList("1")));
        hm.put('2',new ArrayList<>(Arrays.asList("a","b","c")));
        hm.put('3',new ArrayList<>(Arrays.asList("d","e","f")));
        hm.put('4',new ArrayList<>(Arrays.asList("g","h","i")));
        hm.put('5',new ArrayList<>(Arrays.asList("j","k","l")));
        hm.put('6',new ArrayList<>(Arrays.asList("m","n","o")));
        hm.put('7',new ArrayList<>(Arrays.asList("p","q","r","s")));
        hm.put('8',new ArrayList<>(Arrays.asList("t","u","v")));
        hm.put('9',new ArrayList<>(Arrays.asList("w","x","y","z")));
        hm.put('*',new ArrayList<>(Arrays.asList("+")));
        hm.put('0',new ArrayList<>(Arrays.asList("0")));
        hm.put('#',new ArrayList<>(Arrays.asList("#")));
        
        String digicomb="";
        findAlpha(digits,digicomb,0,digits.length());

        return ans;

    }
    public void findAlpha(String digits,String digicomb,int i,int n){
        if(i==n){
            ans.add(digicomb);
            return;
        }
        if(hm.get(digits.charAt(i))!=null){
        for(int j=0;j<hm.get(digits.charAt(i)).size();j++){
            digicomb+=hm.get(digits.charAt(i)).get(j)+"";
            if(i<n){
                findAlpha(digits,digicomb,i+1,n);
            }
            digicomb=digicomb.substring(0,digicomb.length()-1);
        }
      }else{
        return;
      }
    }
}