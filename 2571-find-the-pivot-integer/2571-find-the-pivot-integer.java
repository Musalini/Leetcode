class Solution {
    public int pivotInteger(int n) {
        int sumOfSequence = n * (n + 1) / 2;
        int sumFirstPart = 0;
        for (int i = 0; i <= n; i++) {
            sumFirstPart += i;
            if ((sumOfSequence - sumFirstPart + i) == sumFirstPart) {
                return i;
            }
        }
        return -1;
    }
}