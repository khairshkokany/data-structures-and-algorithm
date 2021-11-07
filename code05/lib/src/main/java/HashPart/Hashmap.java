package HashPart;

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
}
