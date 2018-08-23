class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        String[] arr = sentence.split(" ");
        for (int i = 0;i < arr.length; i++) {
            for(String str : dict) {
                if(arr[i].startsWith(str)) {
                    arr[i] = str;
                }
            }
        }
        
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i< arr.length; i++) {
            if(i == arr.length-1) {
                sb.append(arr[i]);
            }else{
                sb.append(arr[i] + " ");
            }
        }  
        return sb.toString();
    }
}