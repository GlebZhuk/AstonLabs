import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<Integer>> phonebook;

    Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(String name, Integer number) {
        phonebook.computeIfAbsent(name, k -> new ArrayList<>()).add(number);
    }

    public void get(String name) {
        if (phonebook.containsKey(name)) {
            List<Integer> numbers = phonebook.get(name);
            System.out.println(name + " : " + numbers);
        } else {
            System.out.println("Пользователя нет в справочнике");
        }
    }
}
