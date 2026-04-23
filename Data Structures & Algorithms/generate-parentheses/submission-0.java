class Solution {
    public List<String> generateParenthesis(int n) {
        // only add open paranthesis if open < n
        // only add close paranthesis if close < open
        // valid if open == closed == n
        List<String> result = new ArrayList<>(); // have result
        StringBuilder stack = new StringBuilder(); // holds paranthesis
        backtrack(n, result, stack, 0, 0);
        return result;

    }

    public void backtrack(int n, List<String> result, StringBuilder stack, int openN, int closedN) {
        if (openN == closedN && openN == n) {
            result.add(stack.toString());
            return;
        }

        if (openN < n) {
            stack.append('(');
            backtrack(n, result, stack, openN+1, closedN);
            stack.deleteCharAt(stack.length() - 1);
        }

        if (closedN < openN) {
            stack.append(')');
            backtrack(n, result, stack, openN, closedN+1);
            stack.deleteCharAt(stack.length() - 1);
        }

    }

    
}
