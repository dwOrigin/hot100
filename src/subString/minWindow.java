package subString;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class minWindow {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        if (s.equals(t)) return s;
        int[] ss = new int[128], tt = new int[128];
        for (int i = 0; i < t.length(); i++)
            tt[t.charAt(i)]++;
        int left = 0, right = 0;
        int end = t.length();
        int minlft = 0, minright = Integer.MAX_VALUE;
        String minsrt="";
        while (right < s.length()) {
            ss[s.charAt(right)]++;
            if (ss[s.charAt(right)] <= tt[s.charAt(right)]) end--;
            while (left<=right&&ss[s.charAt(left)] > tt[s.charAt(left)]) {
                ss[s.charAt(left)]--;
                left++;
            }

            if (end == 0) {
                if (right-left<minright-minlft) {
                    minlft = left;
                    minright = right;
                    minsrt = s.substring(minlft, minright + 1);
                }
            }
            right++;
        }

        return minsrt;
    }

    public static void main(String[] args) {
        String s= "AB";
        String t="A";
        String res=minWindow(s,t);
        System.out.println(res);
    }
}
