package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.assertThat;
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        //напишите здесь тест, проверяющий удаление дубликатов строк из массива строк.
        String[] input = {"Oleg","Masha","Ira","Semen","Ira","Zhenya","Olga","Liza", "Zhenya", "Sasha", "Oleg", "Misha"};
        String[] except = {"Oleg","Masha","Ira","Semen","Zhenya","Olga","Liza","Sasha","Misha"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] result = duplicate.remove(input);
        assertThat(result, arrayContainingInAnyOrder(except));
    }
}
