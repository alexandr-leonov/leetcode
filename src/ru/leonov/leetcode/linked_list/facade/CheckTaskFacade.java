package ru.leonov.leetcode.linked_list.facade;

import ru.leonov.leetcode.linked_list.LinkedListTestScope;

public class CheckTaskFacade {
    public void checkAllLinkedListTasks() {
        LinkedListTestScope linkedListTestScope = new LinkedListTestScope();
        linkedListTestScope.revertList();
        linkedListTestScope.removeList();
        linkedListTestScope.oddEventList();
        linkedListTestScope.palindromeList();
    }
}
