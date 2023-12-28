package slideWindow;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s){

    Set<Character> subString = new HashSet<Character>();
    int length=0;
    int rightKey=-1;
    int slen=s.length();

    for (int i=0;i<slen;i++){
        if (i!=0){
            subString.remove(s.charAt(i-1));
        }
        while (rightKey+1<slen&&!subString.contains(s.charAt(rightKey+1))) {
            subString.add(s.charAt(rightKey+1));
            rightKey++;
        }
        length=Math.max(length,rightKey-i+1);
    }
    return length;
    }
public static void main(String [] args){
        String s ="a";
        System.out.println(lengthOfLongestSubstring(s));
}
}
