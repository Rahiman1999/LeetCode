class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        int coordinate1Int = coordinate1.charAt(0)-'a';
        int coordinate2Int = coordinate2.charAt(0)-'a';
        String coord1 ="black",coord2="black";
        if(coordinate1Int%2==0){
            if(Character.getNumericValue(coordinate1.charAt(1))%2!=0){
                coord1="black";
            }else{
                coord1="white";
            }
        }else{
            if(Character.getNumericValue(coordinate1.charAt(1))%2==0){
                coord1="black";
            }else{
                coord1="white";
            }
        }
         if(coordinate2Int%2==0){
            if(Character.getNumericValue(coordinate2.charAt(1))%2!=0){
                coord2="black";
            }else{
                coord2="white";
            }
        }else{
            if(Character.getNumericValue(coordinate2.charAt(1))%2==0){
                coord2="black";
            }else{
                coord2="white";
            }
        }
        return coord1==coord2;
    }
}