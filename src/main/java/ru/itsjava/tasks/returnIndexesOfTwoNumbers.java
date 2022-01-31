package ru.itsjava.tasks;

import java.util.Arrays;

public class returnIndexesOfTwoNumbers {
    /*
    Дан массив целых чисел nums и целое число target, верните индексы двух чисел так,
    чтобы их сумма равнялась target. Можете считать, что каждый набор входных значений
    будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент
    дважды. Можно возвращать ответ в любом порядке
    */
    public static void main(String[] args) {
        SolutionOfProblemVer1 solution_1 = new SolutionOfProblemVer1();
        SolutionOfProblemVer2 solution_2 = new SolutionOfProblemVer2();
        SolutionOfProblemVer3 solution_3 = new SolutionOfProblemVer3();
        int[] nums = new int[]{11,7,15,2};
        int target = 9;

        System.out.println("solution_1.twoSum(nums, target) = " + Arrays.toString(solution_1.twoSum(nums, target)));
        System.out.println("solution_2.twoSum(nums, target) = " + Arrays.toString(solution_2.twoSum(nums, target)));
        System.out.println("solution_3.twoSum(nums, target) = " + Arrays.toString(solution_3.twoSum(nums, target)));
    }
}

