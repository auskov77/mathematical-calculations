package ru.itsjava.tasks;

import java.util.HashMap;
import java.util.Map;

public class SolutionOfProblemVer3 {
    /*
    Пока мы итерируем и вставляем элементы в хэш-таблицу, мы можем оглянуться назад, чтобы проверить, существует ли нужное слагаемое в хэш-таблице.
    Если оно существует, то мы нашли решение и сразу возвращаем индексы
     */
    public int[] twoSum(int[] nums, int target){
        // создаем хэш-таблицу значений
        Map<Integer, Integer> map = new HashMap<>();
        // заполняем хэш-таблицу map значениями из nums, где ключом словаря будет значение массива по индексу i, а соответствующим значением словаря будет индекс
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
            // вычитаем из нужной суммы слагаемое
            int complement = target - nums[i];
            // и проверяем есть ли это слагаемое в словаре, а также что оно не является повтором, то есть индекс из словаря не равен индексу из массива
            if (map.containsKey(complement) && map.get(complement) != i) {
                // если есть совпадение, то возвращаем текущий индекс массива и значение из словаря
                return new int[] { i, map.get(complement) };
            }
        }

        return null;
    }
}
