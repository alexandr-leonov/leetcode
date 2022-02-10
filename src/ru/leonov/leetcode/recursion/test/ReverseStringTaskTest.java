package ru.leonov.leetcode.recursion.test;

import ru.leonov.leetcode.common.component.AbstractTest;
import ru.leonov.leetcode.recursion.solution.ReverseStringTask;

public class ReverseStringTaskTest extends AbstractTest<ReverseStringTask> {


    public ReverseStringTaskTest() {
        super(new ReverseStringTask());
    }

    @Override
    public void run() {
        baseFlow();
    }

    private void baseFlow() {
        System.out.println(this.getClass().getSimpleName() + "#baseFlow starting test");
        char[] source = {'z', 'e', 'l', 'l', 'i', 'b', 'o', 'b', 'a'};
        char[] expected = {'a', 'b', 'o', 'b', 'i', 'l', 'l', 'e', 'z'};
        // actual
        solution.reverseString(source);

        boolean isOk = true;
        for (int i = 0; i < source.length; i ++) {
            if (expected[i] != source[i]) {
                isOk = false;
                break;
            }
        }

        assertResult(true, isOk);
    }
}
