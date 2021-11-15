package Company.BalancedBrackets;

/**
 * 1) Validate input: By checking length and then if remainder divide by 2 is 0
 *     then its balanced string
 * 2) If string contains some other characters then not balanced.
 */


public class UsingString {

    public static Boolean isBalanced(String str) {

        if (null == str || ((str.length())%2) !=0  ) {
            return  false;
        }

        char [] input = str.toCharArray();

        for(char c: input) {
            if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                return false;
            }

        }

        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replaceAll("\\(\\)", "")
                    .replaceAll("\\[\\]", "")
                    .replaceAll("\\{\\}", "");
        }

        return (str.length() == 0);

    }





}
