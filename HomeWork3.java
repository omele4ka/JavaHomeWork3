// 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
// 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
// 3. Вставить элемент в список в первой позиции.
// 4. Извлечь элемент (по указанному индексу) из заданного списка.
// 5. Обновить определенный элемент списка по заданному индексу.
// 6. Удалить третий элемент из списка.
// 7. Поиск элемента в списке по строке.
// 8. Создать новый список и добавить в него несколько элементов первого списка.
// 9. Удалить из первого списка все элементы отсутствующие во втором списке.
// 10. *Сортировка списка.

import java.util.*;

public class HomeWork3 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList();    // Задание 1
        l1.add("Hello");
        l1.add("Welcome");
        l1.add("To");
        l1.add("The");
        l1.add("Java");
        l1.add("World");
        System.out.println(l1);


        Iterator<String> iterator = l1.iterator();  // Задание 2
        while(iterator.hasNext()) {
            String str = iterator.next();
            String character = "!";
            System.out.println(str + character);
        }

        l1.add(0, "Username");  // Задание 3. Поняла так, что "Первая позиция" - это именно индекс 0.
        System.out.println(l1);

        System.out.println(l1.get(1)); // Задание 4.

        l1.set(0, "Name");  // Задание 5
        System.out.println(l1);

        l1.remove(2);  // Задание 6
        System.out.println(l1);

        System.out.println(l1.indexOf("World")); // Задание 7

        List <String> l2 = new ArrayList();  // Задание 8
        l2.add(0, l1.get(3));
        l2.add(1,l1.get(4));
        l2.add(2, l1.get(5));
        System.out.println(l2);

        l1.retainAll(l2);  // Задание 9
        System.out.println(l1);

        Collections.sort(l1); // Задание 10
        System.out.println(l1);

    }


}