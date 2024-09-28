import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String arr[] = {"One", "Two", "One", "Three", "Two", "Five", "One", "Five", "Three", "One"};
        Set<String> mySet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            mySet.add(arr[i]);
        }
        System.out.println("Список уникальных слов " + mySet);

        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String word : arr) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        System.out.println("Количество вхождений: ");
        for (String word : wordsCount.keySet()) {
            System.out.println(word + "-" + wordsCount.get(word));
        }
        // Справочник
        System.out.println();
        Phonebook phonebook = new Phonebook();
        phonebook.add("Petrov", 912);
        phonebook.add("Petrov", 111);
        phonebook.add("Ivanov", 123);

        phonebook.get("Petrov");
        phonebook.get("Ivanov");


    }
}
