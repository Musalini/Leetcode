class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = Integer.MIN_VALUE;

        for (String s : sentences) {
            char[] sentence = s.toCharArray();
            int sum = 0;
            for (char c : sentence) {
                if (c == ' ') {
                    sum++;
                }
            }
            if (sum >= count)
                count = sum;
        }
        return count + 1;
    }
}
