class Solution {
    public void backtrack(String digits, int index, String current, String[] mapping, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        int digit = digits.charAt(index) - '2';
        String letters = mapping[digit];
        
        for (int i = 0; i < letters.length(); i++) {
            backtrack(digits, index + 1, current + letters.charAt(i), mapping, result);
        }
    }
    public List<String> letterCombinations(String digits) {
         List<String> result = new ArrayList<>();
        
        if (digits.isEmpty()) {
            return result;
        }

        String[] mapping = {
            "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, "", mapping, result);

        return result;
    }
}