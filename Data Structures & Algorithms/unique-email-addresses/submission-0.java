class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> hst = new HashSet<>();
        for(int i=0;i<emails.length;i++){
            String[]spl = emails[i].split("@");
            String[]consider = spl[0].split("\\+");
            String cons = consider[0];
            for(int j=0;j<cons.length();j++){
                if(cons.charAt(j)=='.'){
                    cons = cons.substring(0,j)+cons.substring(j+1);
                    j--;
                }
            } 
            cons= cons+"@"+spl[1];
            hst.add(cons);
        }
        return hst.size();
    }
}