class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder,(a,b)->a.length()-b.length());
        Set<String> set = new HashSet<>();

        for(String dir:folder){
            String[] dirPath = dir.split("/");
            String parentDir="";
            boolean isSubFolder=false;
            for(int i=1;i<dirPath.length;i++){
                parentDir+="/"+dirPath[i];
                if(set.contains(parentDir)){
                    isSubFolder=true;
                    break;
                }
            }
            if(!isSubFolder){
                set.add(parentDir);
            }
        }
        return new ArrayList<>(set);
    }
}