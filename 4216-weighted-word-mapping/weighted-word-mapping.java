class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        
        StringBuilder sb = new StringBuilder();

        for( String word : words) {
            int sum = 0;

            for (char ch : word.toCharArray()){
                sum += weights[ch - 'a'];
            }
            
            sum %= 26;
            char mappedChar = (char) ('z' - sum);
            sb.append(mappedChar);
        }

        return sb.toString();
    }
}