package hashmap;

import java.awt.datatransfer.StringSelection;
import java.util.*;

public class groupAnagrams {
    public static List<List<String>>groupAnagrams(String[]strs)
    {
        Map<String,List<String>> map =new HashMap<String, List<String>>();
        for (int i=0;i<strs.length;i++)
        {
        char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            List<String>list = map.getOrDefault(key,new ArrayList<String>());
            list.add(strs[i]);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>>yes= groupAnagrams(strs);
        for (List<String> y:yes){
            System.out.println(y);
        }
    }
}
