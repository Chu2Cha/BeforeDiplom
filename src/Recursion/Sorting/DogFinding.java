package Recursion.Sorting;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DogFinding {

    public static void main(String[] args) {
        List<Dog> unsortedDogs = Stream.of(
                        "Дружок", "Пушок", "Тузик", "Ромео",
                        "Белка", "Стрелка", "Бобик", "Афоня",
                        "Волчок")
                .map(Dog::new)
                .collect(Collectors.toList());

        // найдите Белку
        Dog dog = new Dog("Белка");
        String result = search(unsortedDogs, dog)
                .map(d -> "А вот и собака по кличке " + d + " нашлась")
                .orElseGet(() -> "Нет собаки по кличке " + dog + " :(");

        System.out.println(result);
    }

    private static <T extends Comparable<T>> Optional<T> search(List<T> unsortedList, T searchObject) {
        List<T> sortedList = unsortedList.stream().sorted().collect(Collectors.toList());
        for (T t : sortedList) {
            if (t.equals(searchObject))
                return Optional.ofNullable(t);
        }
        return Optional.empty();
        }
        // искать легче по упорядоченному списку — вам поможет алгоритм сортировки
    }



