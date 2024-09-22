import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //1. Для любого набора случайно-сгенерированных чисел нужно определить количество чётных чисел.
        List<Integer> intList = new ArrayList<>();
        int number;
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            number = rnd.nextInt() % 100;
            intList.add(number);
        }
        System.out.println(intList);
        List<Integer> evenList = intList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        //2. Задана коллекция, состоящая из строк: «Highload», «High», «Load», «Highload».
        // Нужно с ней выполнить следующие манипуляции:
       /* 2.1. Посчитать, сколько раз объект «High» встречается в коллекции;
        2.2. Определить, какой элемент в коллекции находится на первом месте.
        Если мы получили пустую коллекцию, то пусть возвращается 0;
        2.3. Необходимо вернуть последний элемент, если получили пустую коллекцию,
         то пусть возвращается 0;*/

        List<String> list = new ArrayList<>(List.of("Highload", "High", "Load", "Highload"));
        long count = list.stream().filter(n -> n.contains("High")).count();
        System.out.println("High встречается в строке " + count + " раз");

        String firstElement = list.stream().findFirst().orElse("0");
        System.out.println("Первый элемент " + firstElement);

        String lastElement = list.stream().reduce((a, b) -> b).orElse("0");
        System.out.println("Последний элемент " + lastElement);

/*        3. Задана коллекция, содержащая элементы "f10", "f15", "f2", "f4", "f4".
            Необходимо отсортировать строки по возрастанию и добавить их в массив;*/
        ArrayList<String> listString = new ArrayList<>();
        listString.add("f10");
        listString.add("f15");
        listString.add("f2");
        listString.add("f4");
        listString.add("f4");
        String[] arr = listString.stream().
                sorted(Comparator.comparingInt(s -> Integer.parseInt(s.substring(1)))).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));
/*    }
    5. Нужно написать программу, которая будет принимать от пользователя ввод различных логинов.
    Как только пользователь введет пустую строку - программа должна прекратить приём данных от пользователя
    и вывести в консоль логины, начинающиеся на букву f (строчную).*/
        List<String> newList = new ArrayList<>();
        System.out.println("Введите значение");
        Scanner scan = new Scanner(System.in);
        String a;
        while (true) {
            a = scan.nextLine();
            if (a.isEmpty()) break;
            newList.add(a);
        }
        List<String> filterList = newList.stream().filter(n -> n.startsWith("f")).collect(Collectors.toList());
        System.out.println(filterList);
    }
}
