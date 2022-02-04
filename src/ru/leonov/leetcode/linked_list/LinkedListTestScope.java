package ru.leonov.leetcode.linked_list;

import ru.leonov.leetcode.common.component.TestScope;
import ru.leonov.leetcode.linked_list.test.*;

public class LinkedListTestScope implements TestScope {
    public void revertList() {
        runner(new RevertListTaskTest());
    }

    public void removeList() {
        runner(new RemoveListTaskTest());
    }

    public void oddEventList() {
        runner(new OddEventListTaskTest());
    }

    public void palindromeList() {
        runner(new PalindromeListTaskTest());
    }

    public void mergeTwoSortedList() {
        runner(new MergeTwoListsTaskTest());
    }

    public void addTwoNumbers() {
        runner(new AddTwoNumbersTaskTest());
    }

}
