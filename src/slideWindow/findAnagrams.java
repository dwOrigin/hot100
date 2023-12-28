package slideWindow;

import java.util.*;

public class findAnagrams {
public static List<Integer>findAnagramss(String s, String p){
    List<Integer>result= new ArrayList<>();
    int[]pCount= new int[26];
    int[]sCount= new int[26];
   int plen=p.length();
    if (s.length()<p.length())
        return new ArrayList<Integer>();
    for (int i=0;i<p.length();i++){
        sCount[s.charAt(i)-'a']++;
        pCount[p.charAt(i)-'a']++;
    }
//    需要在初始的条件下就要去进行
    if (Arrays.equals(sCount,pCount))
        result.add(0);
    for (int i=0;i<s.length()-plen;i++){

            sCount[s.charAt(i)-'a']--;
            sCount[s.charAt(i+ plen)-'a']++;
        if (Arrays.equals(sCount,pCount))
            result.add(i+1);

    }
    return result;
}
    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        System.out.println(findAnagramss(s,p));
    }
}
//采用hashmap方法不可取，此时得到的只是元素是相同的，但是到具体的元素的个数却是不太一样的
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