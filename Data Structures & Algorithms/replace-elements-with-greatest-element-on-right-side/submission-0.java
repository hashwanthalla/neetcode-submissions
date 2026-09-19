class Solution {
    public int[] replaceElements(int[] arr) {
        int len = arr.length;
        int max =-1;
        for(int i=len-1;i>=0;i--){
            int aa = arr[i];
            arr[i]=max;
            if(aa>max){
                max =aa;
            }
        }
        return arr;
    }
}