// https://leetcode.com/problems/goal-parser-interpretation/
public class globalparser {
    public String interpret(String command) {
        // command = command .replaceAll("()", "o");
        // command = command .replace("(", "");
        // command = command .replace(")", "");
        // return command;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == '('){
                if(i<command.length()-1 && command.charAt(i+1) == ')'){
                    ans.append("o");
                }
            }
            else if(command.charAt(i) != ')'){
                ans.append(command.charAt(i));
            }
        }
        return ans.toString();
    }
}
