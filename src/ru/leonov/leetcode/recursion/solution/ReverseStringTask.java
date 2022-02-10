package ru.leonov.leetcode.recursion.solution;

import ru.leonov.leetcode.common.component.Solution;

public class ReverseStringTask extends Solution {
    public void reverseString(char[] s) {
        recursive(0, s);
    }


    private void recursive(int index, char[] input) {
        if (index == input.length / 2) {
            return;
        }

        char tmp = input[index];
        input[index] = input[input.length - 1 - index];
        input[input.length - 1 - index] = tmp;

        recursive(index + 1, input);
    }
}
