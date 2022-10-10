class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] str = new String[arr.length];
        String t = "";
        for(int i=0;i<arr.length;i++){
            String k = arr[i];
            char a = k.charAt(k.length()-1);
            int h = a-'0'-1;
            str[h]=k.substring(0,k.length()-1);
        }
        for(int i=0;i<str.length;i++){
            t+=str[i];
            if(i!=str.length-1){
                t+=" ";
            }
        }
        return t;
    }
}
