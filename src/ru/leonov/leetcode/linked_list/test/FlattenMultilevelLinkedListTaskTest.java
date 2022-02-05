package ru.leonov.leetcode.linked_list.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.common.model.Node;
import ru.leonov.leetcode.common.utils.CommonUtil;
import ru.leonov.leetcode.linked_list.solution.FlattenMultilevelLinkedListTask;

public class FlattenMultilevelLinkedListTaskTest extends AbstractTest<FlattenMultilevelLinkedListTask> {
    public FlattenMultilevelLinkedListTaskTest() {
        super(new FlattenMultilevelLinkedListTask());
    }

    @Override
    public void run() {
        baseFlow();
        extremalCase_1();
    }

    /*
       Input: 1 = 2 = 3 = 4 = 5 = 6
                      |
                      7 = 8 = 9 = 10
                          |
                          11 = 12
       Expected: 1 = 2 = 3 = 7 = 8 = 11 = 12 = 9 = 10 = 4 = 5 = 6
     */
    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");

        Node source = CommonUtil.buildFlatList(new int[]{1,2,3,4,5,6});
        Node level2 = CommonUtil.buildFlatList(new int[]{7,8,9,10});
        Node level3 = CommonUtil.buildFlatList(new int[]{11,12});

        Node i = source;
        while (i.val != 3) {
            i = i.next;
        }
        i.child = level2;

        Node j = level2;
        while (j.val != 8) {
            j = j.next;
        }
        j.child = level3;


        Node expected = CommonUtil.buildFlatList(new int[]{1,2,3,7,8,11,12,9,10,4,5,6});
        Node actual = solution.flatten(source);
        assertResult(expected, actual);
    }

    /*
       Input:   1
                |
                2
                |
                3
       Expected: 1 = 2 = 3
     */
    private void extremalCase_1() {
        System.out.println(this.getClass().getSimpleName() + "#extremalCase_1 starting test");

        Node source = CommonUtil.buildFlatList(new int[]{1});
        Node level2 = CommonUtil.buildFlatList(new int[]{2});
        Node level3 = CommonUtil.buildFlatList(new int[]{3});

        source.child = level2;
        level2.child = level3;

        Node expected = CommonUtil.buildFlatList(new int[]{1,2,3});
        Node actual = solution.flatten(source);
        assertResult(expected, actual);
    }
}
