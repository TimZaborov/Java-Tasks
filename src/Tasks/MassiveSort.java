package Tasks;
/*
Решить задачу:
Написать метод, принимающий массив различных целых чисел и
возвращает строку с диапазонами
Пример:
In: [8, 2, 5, 1, 11, 0, 7, 12, 4, 9, 13, 3]
Out: "0-5,7-9,11-13"
 */

import java.util.Arrays; // Для работы со списком (динамическим массивом)
import java.util.List; // Для сортировки массива (Arrays.sort)
import java.util.ArrayList; // Интерфейс List (используется для объявления списка)

public class MassiveSort {
    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 1, 11, 0, 7, 12, 4, 9, 13, 3}; // создаем входной массив nums
        System.out.println(massiveSorter(nums));
    }

    public static String massiveSorter(int[] nums) { // метод для нахождения массива
        if (nums == null || nums.length == 0) { // проверка на пустой массив
            return "";
        }

        Arrays.sort(nums); // Сортируем массив по возрастанию
        List<String> ranges = new ArrayList<>(); // создали список string, туда пойдут диапазоны
        int firstElement = nums[0];// первый элемент отсортированного массива

        for (int i = 1; i < nums.length; i++) { // начинаем цикл со второго элемента,перебор массива
            if (nums[i] != nums[i - 1] + 1) { // проверка элемента на продолжения последовательности
                if (firstElement == nums[i - 1]) { // проверка на одиночное число(если 1 число в диапазоне
                    ranges.add(String.valueOf(firstElement)); // преобразование числа в строку + добавили в список
                } else {
                    ranges.add(firstElement + "-" + nums[i - 1]); // добавили в диапазон два числа
                }
                firstElement = nums[i]; // начали новый диапазон с нового первого элемента
            }
        }
        if (firstElement == nums[nums.length - 1]) {//если последнее числа является первым
            ranges.add(String.valueOf(firstElement));
        } else {
            ranges.add(firstElement + "-" + nums[nums.length - 1]);
        }

        return String.join(",", ranges); // склеивает все элементы в одну строку
    }
}