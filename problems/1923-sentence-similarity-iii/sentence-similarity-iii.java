class Solution {
    public String[] split(String sentence){
        return sentence.split(" ");
    }
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] word1 = split(sentence1);
        String[] word2 = split(sentence2);
        if(word1.length<word2.length){
             String[] temp = word1;
             word1= word2;
             word2=temp;
        }
        int n1= word1.length,n2= word2.length;
        int start=0,end=0;
        while(start<n2&&word1[start].equals(word2[start])){
            start++;
        }
        while(end<n2&&word1[n1-end-1].equals(word2[n2-end-1])){
            end++;
        }

        return start+end>=n2;
    }
}