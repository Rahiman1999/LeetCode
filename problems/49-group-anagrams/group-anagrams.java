class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();

        for(String string:strs){
            char sortWord[]= string.toCharArray();
            Arrays.sort(sortWord);
            String sortedWord= new String(sortWord);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList());
            }

            map.get(sortedWord).add(string);
        }
        return new ArrayList<>(map.values());
    }
}