class Solution {
    public String restoreString(String s, int[] indices) {
        char[] chartsNew = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            chartsNew[indices[i]] = s.charAt(i);
        }
        return new String(chartsNew);
    }
}