class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (char i : arr) {

            if (bracketopen(i)) {
                stack.push(i);
            } 
            else {
                if (stack.size() == 0) {
                    return false;
                }

                if (matchingclose(stack.peek(), i)) {
                    stack.pop();
                } 
                else {
                    return false;
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        }

        return false;
    }

    public boolean bracketopen(char s) {
        if (s == '{' || s == '[' || s == '(') {
            return true;
        } 
        else {
            return false;
        }
    }

    public boolean matchingclose(char i, char j) {
        if (i == '(' && j == ')') {
            return true;
        } 
        else if (i == '{' && j == '}') {
            return true;
        } 
        else if (i == '[' && j == ']') {
            return true;
        } 
        else {
            return false;
        }
    }
}