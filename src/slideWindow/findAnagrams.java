package slideWindow;

import java.util.*;

public class findAnagrams {
  /*public static List<Integer> findInteger(String s,String p){
      List<Integer>result=new ArrayList<>();
      Set<Character>ps = new HashSet<>();
      Vector<Character>ss = new Vector<>();
      for (int i=0;i<p.length();i++){ps.add(p.charAt(i));}
      for (int t=0;t<p.length()-1;t++){
          ss.add(s.charAt(t));
      }
      Set st;
      if (p.length()<s.length()) {
          for (int j = p.length()-1; j < s.length(); j++) {
              char t= s.charAt(j);
              ss.add(t);
              st =new HashSet(ss);
              if (ps.equals(st)) {
                  result.add(j - p.length()+1);
              }
              ss.remove(0);

          }
      }
    return result;
}*/
    public static void main(String[] args) {
        String s = "ababababab";
        String p = "aab";
        System.out.println(findInteger(s,p));
    }
}
//采用hashmap方法不可取，此时得到的只是元素是相同的，但是到具体的元素的个数却是不太一样的