package ru.itsjava.tasks;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class SolutionOfProblemVer2 {
    /*
    Это решение требует больше памяти, так как создается новая структура данных,
    но вместо квадратичной сложности по времени выполнения мы получаем линейную.
    Но это решение все еще не оптимальное, решить задачу можно за один проход цикла
     */
    public int[] twoSum(int[] nums, int target) {
        // создаем хэш-таблицу значений
        Map<Integer, Integer> map = new HashMap<>();
        // заполняем хэш-таблицу map значениями из nums, где ключом словаря будет значение массива по индексу i, а соответствующим значением словаря будет индекс
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        // проходим по массиву nums второй раз
        for (int i = 0; i < nums.length; i++) {
            // вычитаем из нужной суммы слагаемое
            int complement = target - nums[i];
            // и проверяем есть ли это слагаемое в словаре, а также что оно не является повтором, то есть индекс из словаря не равен индексу из массива
            if (map.containsKey(complement) && map.get(complement) != i) {
                // если есть совпадение, то возвращаем текущий индекс массива и значение из словаря
                return new int[] { i, map.get(complement) };
            }
        }
        // Если решение не найдено, то возвращаем null
        return null;
    }
}