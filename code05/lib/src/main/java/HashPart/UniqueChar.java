package HashPart;

import java.util.HashSet;

public class UniqueChar {
  public static boolean uniqueCharacters(String str)
        {
            HashSet<Character> char_set = new HashSet<>();

            for(int i  = 0; i< str.length();i++){
                char_set.add(str.charAt(i));
            }


            if (char_set.size() == str.length()){
                return true;
            }else{
                return false;
            }
        }
}
