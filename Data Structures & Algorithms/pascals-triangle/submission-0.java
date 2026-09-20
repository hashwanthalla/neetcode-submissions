class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> prev= new ArrayList<>();
        prev.add(1);
        ll.add(prev);
        for(int i=2;i<=numRows;i++){
            List<Integer> current = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0){
                    current.add(prev.get(j));
                } else if(j==i-1){
                     current.add(prev.get(j-1));
                }  else {
                    current.add(prev.get(j)+prev.get(j-1));
                }
                
            }
             ll.add(current);
                prev = current;
        }
        return ll;
    }
}