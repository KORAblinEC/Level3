package lesson1;

public class Main {
    public static void main(String[] args) {
        //Task1
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"} ;
        ReplacingElements test1 = new ReplacingElements(arr1, 1, 4);
        test1.ReplacingElements();
        ReplacingElements test2 = new ReplacingElements(arr2, 1, 2);
        test2.ReplacingElements();

        //Task2
        Integer arr3[] = {1, 2, 3, 4, 5, 6, 7};
        String arr4[] = {"A", "B", "C"} ;
        MassToArrayList test3 = new MassToArrayList(arr3);
        test3.MassToArrayList();
        MassToArrayList test4 = new MassToArrayList(arr4);
        test4.MassToArrayList();
        //Task3
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();
        Box<Apple> appple1 = new Box<>();
        Box<Apple> appple2 = new Box<>();
        System.out.println("Task3");
        System.out.println("'g' - addFruit: ");
        orange1.addFruit(new Orange(),10);
        orange2.addFruit(new Orange(),12);
        appple1.addFruit(new Apple(),8);
        appple2.addFruit(new Apple(),4);
        System.out.println("Box 1: "+orange1.getWeight());
        System.out.println("Box 2: "+orange2.getWeight());
        System.out.println("Box 3: "+appple1.getWeight());
        System.out.println("Box 4: "+appple2.getWeight());
        System.out.println("'e' - compare(): ");
        System.out.println("Box 1 equals box 3: "+orange1.compare(appple1));
        System.out.println("Box 2 equals box 4: "+orange2.compare(appple2));
        System.out.println("'f' - pourTo(): ");
        orange1.pourTo(orange1);
        appple1.pourTo(appple2);
        System.out.println("'d' - getWeight(): ");
        System.out.println("Box 1: "+orange1.getWeight());
        System.out.println("Box 2: "+orange2.getWeight());
        System.out.println("Box 3: "+appple1.getWeight());
        System.out.println("Box 4: "+appple2.getWeight());
    }
}
