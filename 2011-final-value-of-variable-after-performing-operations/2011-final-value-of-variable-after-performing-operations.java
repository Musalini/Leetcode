class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            switch (operation) {
                case "--X", "X--" -> result -= 1;
                case "X++", "++X" -> result += 1;
            }
        }
        return result;
    }
}