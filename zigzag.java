class zigzag {
    public String convert(String s, int numRows) {
        int n = s.length();
        String [] arr = new String[numRows];
        for(int i=0;i<numRows;i++){
            arr[i]="";
        } 
        int i=0;
        while(i<n){
            for(int ind=0; ind<numRows && i<n; ind++){
                arr[ind]+=s.charAt(i++);
            }
           
            for(int ind=numRows-2; ind>0 && i<n; ind--){
                arr[ind]+=s.charAt(i++);
            }
        }
        StringBuffer ans = new StringBuffer();
        for(String str : arr){
            ans.append(str);
        }
        return ans.toString();
    }
}
/*
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI" 
*/
