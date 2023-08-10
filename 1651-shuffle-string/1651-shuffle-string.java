class Solution {
    public String restoreString(String s, int[] indices) {
        char[] charts = s.toCharArray();
        char[] chartsNew = new char[indices.length];
        for (int i = 0; i < charts.length; i++) {
            chartsNew[indices[i]] = charts[i];
        }
        return new String(chartsNew);
    }
}