class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int start = 0;
        int n = s.length();
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i==n-1 ||s.charAt(i) != s.charAt(i+1)){
                if(i-start+1>=3){
                
                    ArrayList<Integer> arr = new ArrayList<>();
                    
                    result.add(Arrays.asList(start,i));
                }
                start=i+1;
            }
        }
        return result;
    }
}