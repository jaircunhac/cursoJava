package javaCourse.section10;

import java.util.ArrayList;
import java.util.List;

public class listMain {
    public static void main(String[] args) {
        // Lectures about lists

        // Lists do not accept primitive types
        List<String> listName = new ArrayList<>();

        listName.add("Jair");
        listName.add("Maria");
        listName.add("Leonardo");
        listName.add("Patricia");
        listName.add("Pedro");
        listName.add("Luana");
        listName.add("Juliana");

        listName.add(1, "Glória");

        System.out.println(listName.size());

        for (String name : listName){
            System.out.println(name);
        }

        System.out.println("------------------------------");

        // Lists are capable of comparing values and removing them by their values
        listName.remove("Jair");

        for (String name : listName){
            System.out.println(name);
        }

        System.out.println("------------------------------");

        // Removing all values that starts with the letter 'P'
        listName.removeIf(x -> x.charAt(0) == 'P');

        for (String name : listName){
            System.out.println(name);
        }

        System.out.println("------------------------------");

        // Getting the index based on the value
        System.out.println("Index of Glória: " + listName.indexOf("Glória"));

        System.out.println("------------------------------");

        // Can also use in the end .collect(Collectors.toList()) but it is a old way of solving this
        // The line below is creating a new list based on the result of the filter that is pulling only values that start with 'L'
        List<String> separate = listName.stream().filter(x -> x.charAt(0) == 'L').toList();

        for (String name : separate){
            System.out.println(name);
        }

        System.out.println("------------------------------");

        // It will search all elements of the list to find the first element that starts with 'L' and it will print it
        String name = listName.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);

        System.out.println(name);
    }
}
