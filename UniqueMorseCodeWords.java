class Solution {
    String[] arg = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set1 = new HashSet<>();
        for(int i=0;i<words.length;i++) {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<words[i].length();j++){
               sb.append(arg[words[i].charAt(j)-97]);
            }
            set1.add(sb.toString());
        }
        return set1.size();
    }
}