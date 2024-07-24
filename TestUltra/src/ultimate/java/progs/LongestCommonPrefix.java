package ultimate.java.progs;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] input = {"flower", "flow", "flight"};
		String res = longestCommonPrefix(input);
		System.out.println(res);
	}

	public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        String prefix = strs[0];// Take out the first string.
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
