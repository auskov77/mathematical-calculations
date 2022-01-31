package ru.itsjava.tasks;

import lombok.Data;

@Data
public class SolutionOfProblemVer1 {
    /*
    Решение является простым, но не оптимальным, так как имеет два вложенных цикла,
    т.e. обладает квадратичной сложностью
    */
    public int[] twoSum(int[] nums, int target) {
        // создаем цикл для итерации по первому слагаемому
        for (int i = 0; i < nums.length; i++) {
            // создаем цикл для итерации по второму слагаемому, берем все последующие значения по порядку
            for (int j = i + 1; j < nums.length; j++) {
                // проверяем равна ли разница суммы target и первого слагаемого nums[i]
                if (nums[j] == target - nums[i]) {
                    // возвращаем индексы слагаемых
                    return new int[] { i, j };
                }
            }
        }
        // Если решение не найдено, то возвращаем null
        return null;
    }
}
