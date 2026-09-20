class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res ="";
        int minLen =Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<minLen){
                minLen = strs[i].length();
            }
        }
    
        for(int i=0;i<minLen;i++){
            int len =i;
            char first ='a'; 
            boolean b = true;
            if(len < strs[0].length()){
               first = strs[0].charAt(len); 
            }
           for(int j=1;j<strs.length;j++){
             if(strs[j].charAt(len)!=first){
                b =false; 
                break;
             }
           }
           if(b){
            res = res+first;
           }else {
            break;
           }
        }
        return res;
    }
}