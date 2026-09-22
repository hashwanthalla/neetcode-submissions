class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt =0;
        int len = flowerbed.length-1;
        int i=0;
        while(i<=len){
            if(flowerbed[i]==0){
                if((i-1<0||flowerbed[i-1]==0)&&(i+1>len||flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    cnt++;
                }
            }
            i++;
        }
        return cnt>=n;
    }
}