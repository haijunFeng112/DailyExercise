package com.fxs.leetcode;

/**
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 *
 * 返回 true.
 *
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 * @author hjfeng
 * @date 2020--07--27  22:37
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {


        int len = s.length();
        int start = 0;
        for (int i = 0; i < len; i++){
            char c = s.charAt(i);
            int index = t.indexOf(c,start);
            if (index == -1){
                return false;
            }
            start = index+1;
        }

        return true;
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = isSubsequence.isSubsequence(s, t);
        System.out.println(result);
    }
}
