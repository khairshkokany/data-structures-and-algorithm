package HashPart;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hashmap {

    public static String RepeatedWord(String string) {
        HashTable<String, String> Words = new HashTable<>();
        String[] Arr = string.split(" ");
        for (String word : Arr) {
            word =word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (Words.contains(word)) {
                return word;
            } else {
                Words.addHash(word,word);
            }
        }
        return "no one is here go and C U again ";
    }
    public static List<String> leftJoin(HashMap h1, HashMap h2){

        List<String> list = new ArrayList<>();
        for(Object k : h1.keySet()){
            if(h1.containsKey(k)){
                list.add(k +  ": " + h1.get(k)+ ", " + h2.get(k));
            } else{
                list.add(k + ": " + h1.get(k) + ", " + null);
            }
        }

        return list;
    }


}
