package ru.leonov.leetcode;

import ru.leonov.leetcode.linked_list.LinkedListTestScope;
import ru.leonov.leetcode.recursion.RecursionTestScope;
import ru.leonov.leetcode.two_pointer.TwoPointerTestScope;

public class CheckTaskFacade {
    public void checkAllLinkedListTasks() {
        LinkedListTestScope linkedListTestScope = new LinkedListTestScope();
        linkedListTestScope.revertList();
        linkedListTestScope.removeList();
        linkedListTestScope.oddEventList();
        linkedListTestScope.palindromeList();
        linkedListTestScope.mergeTwoSortedList();
        linkedListTestScope.addTwoNumbers();
        linkedListTestScope.flattenMultilevelList();
    }

    public void checkAllTwoPointerTasks() {
        TwoPointerTestScope twoPointerTestScope = new TwoPointerTestScope();
        twoPointerTestScope.detectCycle();
        twoPointerTestScope.intersectionLists();
        twoPointerTestScope.removeNElementFromEndList();
    }

    public void checkAllRecursionTasks() {
        RecursionTestScope recursionTestScope = new RecursionTestScope();
        recursionTestScope.revertString();
    }

}
