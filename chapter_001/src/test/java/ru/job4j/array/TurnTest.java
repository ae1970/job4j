package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    Turn turn = new Turn();

    @Test
    public void whenTurnArrayWithEvenOfElements() {
        int[] inArray = {3, 6, 1, 5};
        int[] result = turn.back(inArray);
        int[] expected = {5, 1, 6, 3};
        assertThat(result, is(expected));
    }

    @Test
    public void whenTurnArrayWithOddOfElements() {
        int[] inArray = {1, 2, 3, 4, 5, 6, 7};
        int[] result = turn.back(inArray);
        int[] expected = {7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}


