class Solution {
    public String minWindow(String s, String t) {
        int m= s.length();
        int n=t.length();
        int flen = Integer.MAX_VALUE;
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(int i=0;i<n;i++){
            hm1.put(t.charAt(i),hm1.getOrDefault(t.charAt(i),0)+1);
        }
        int p1=0,p2=0,len=-1,start=-1;
        int match=0,flag=0;
        HashMap<Character,Integer> hm2 = new HashMap<>();
        while(p2<m){
            hm2.put(s.charAt(p2),hm2.getOrDefault(s.charAt(p2),0)+1);
            if(hm1.containsKey(s.charAt(p2))&&(hm2.get(s.charAt(p2))<=hm1.get(s.charAt(p2)))) match++;
            while(match==n){
                flag=1;
                len=p2-p1+1;
                if(len<flen){
                    flen=len;
                    start=p1;
                }
                hm2.put(s.charAt(p1),hm2.getOrDefault(s.charAt(p1),0)-1);
                if(hm1.containsKey(s.charAt(p1))&&(hm2.get(s.charAt(p1))<hm1.get(s.charAt(p1)))) match--;
                p1++;
            }
            p2++;
        }
        int end = start+flen-1;
        return flag==1? s.substring(start,end+1):"";
    }
}