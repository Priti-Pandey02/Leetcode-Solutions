class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int max = -1;
        int n = piles.length;

        for(int i = 0;i<n;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }

        int e = max;

        while(s<e){
            int mid = (s+e)/2;
            int time = 0;
            
            for(int i=0;i<n;i++){
               time += (piles[i]+mid-1)/mid;
            }

            if(time<=h){
                e=mid;

            }else{
                s=mid+1;

            }

        }
        return s;
    }
}