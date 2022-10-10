class Solution {
    public int minDistance(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
       
        int[][] arr=new int[len1+1][len2+1];
       
        for(int i=0;i<l1+1;i++) {
            for(int j=0;j<l2+1;j++) {
                if(i==0 || j==0) {
                    if(i==0) mat[i][j]=j;
                    else arr[i][j]=i;
                }
                else if(word1.charAt(i-1)==word2.charAt(j-1)) arr[i][j]=arr[i-1][j-1];
                else {
                    arr[i][j]=1+Math.min(Math.min(arr[i][j-1],arr[i-1][j]),arr[i-1][j-1]);
                }
            }
        }
        return arr[len1][len2];
    }
}
