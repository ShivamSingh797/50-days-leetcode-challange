import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            int res = 0;
            if (!s.isEmpty() && tokens[i].equals("+")) {
                int a = Integer.parseInt(s.pop());
                if (!s.isEmpty()) {
                    int b = Integer.parseInt(s.pop());
                    res = b + a;
                } else {
                    res = a;
                }
                s.push(String.valueOf(res));
                continue;
            }
            if (!s.isEmpty() && tokens[i].equals("*")) {
                int a = Integer.parseInt(s.pop());
                if (!s.isEmpty()) {
                    int b = Integer.parseInt(s.pop());
                    res = b * a;
                } else {
                    res = a;
                }
                s.push(String.valueOf(res));
                continue;
            }
            if (!s.isEmpty() && tokens[i].equals("-")) {
                int a = Integer.parseInt(s.pop());
                if (!s.isEmpty()) {
                    int b = Integer.parseInt(s.pop());
                    res = b - a;
                } else {
                    res = a;
                }
                s.push(String.valueOf(res));
                continue;
            }
            if (!s.isEmpty() && tokens[i].equals("/")) {
                int a = Integer.parseInt(s.pop());
                if (!s.isEmpty()) {
                    int b = Integer.parseInt(s.pop());
                    res = b / a;
                } else {
                    res = a;
                }
                s.push(String.valueOf(res));
                continue;
            }
            s.push(tokens[i]);
        }
        int result = Integer.parseInt(s.pop());
        return result;
    }
}