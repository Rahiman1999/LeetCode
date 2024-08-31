class Solution {
    public int generateKey(int num1, int num2, int num3) {
        String num1s = String.valueOf(num1);
        String num2s = String.valueOf(num2);
        String num3s = String.valueOf(num3);

        while(num1s.length()<4||num2s.length()<4||num3s.length()<4){
            String temp="";
            if(num1s.length()<4){
                temp="0"+num1s;
                num1s=temp;
            }
            if(num2s.length()<4){
                temp="0"+num2s;
                num2s=temp;
            }
            if(num3s.length()<4){
                temp="0"+num3s;
                num3s=temp;
            }
        }

        String ans="";
        for(int i=0;i<num1s.length();i++){
            int temp = Math.min( Character.getNumericValue(num1s.charAt(i)), Character.getNumericValue(num2s.charAt(i)));
            int temp2 = Math.min( Character.getNumericValue(num3s.charAt(i)),temp);
            ans+=String.valueOf(temp2);

        }
        return Integer.parseInt(ans);
    }
}