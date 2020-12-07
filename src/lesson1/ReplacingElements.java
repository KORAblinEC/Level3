package lesson1;

import java.util.Arrays;

public class ReplacingElements {
    private  Object[] array;
    private final int i;
    private final int i1;

    public ReplacingElements(Object[] array, int i, int i1) {

        this.array = array;
        this.i = i;
        this.i1 = i1;
    }

    public void ReplacingElements () {
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        System.out.println("Меняем местами элементы массива с номерами " + i + " и " + i1);
        Object sw = array[i];
        array[i] = array[i1];
        array[i1] = sw;
        System.out.println("Массив после замены элементов: " + Arrays.toString(array) + "\n================================");
    }
}
