package Home_Work_Lesson_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Третье задание");
        Box<Apple> box1 = new Box();
        Box<Orange> box2 = new Box();
        Box<Orange> box3 = new Box();
        box1.addFruits(new Apple(), 3);
        box2.addFruits(new Orange(), 2);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));
        box2.shiftFruit(box3);
        System.out.println(box2.getWeight());
        System.out.println(box3.getWeight());

        System.out.println();
        System.out.println("Первое задание");
        String [] strObjs = {"Море", "Пляж", "Гора", "Дерево", "Луг", "Лес"};
        shiftObj(strObjs, 2, 4);

        System.out.println();
        System.out.println("Второе задание");
        convert(strObjs);
       // int[] intO = {1,3,4,5,6};
       // convert(intO); почему то не работает


    }

    public static void shiftObj(Object[] arr, int a, int b) {
        System.out.println("Введенный массив:" + Arrays.toString(arr));
        Object o = arr[a];
        arr[a] = arr[b];
        arr[b] = o;
        System.out.println("Получившийся массив: " + Arrays.toString(arr));
    }

    public static <T> void convert  ( T []arr) {
        System.out.println("Введенный массив: " + Arrays.asList(arr));
        ArrayList<T> arrNew = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Полученный массив ArrayList: " + Arrays.asList(arrNew));
    }


}



