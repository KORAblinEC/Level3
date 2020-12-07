package lesson1;

import java.util.Arrays;
import java.util.List;

public class MassToArrayList {
    private  Object[] array;

    public MassToArrayList(Object[] array){
        this.array = array;
    }

    public void MassToArrayList(){
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        List m= Arrays.asList(array);
        System.out.println("Полученный ArrayList: " + m + "\n================================");
    }

}
