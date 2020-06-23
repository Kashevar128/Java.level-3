package Home_Work_Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    List<T> basket = new ArrayList();
    Object T;

    public void addFruits (T fruit, int n) {
        for (int i = 0; i < n; i++) {
            basket.add(fruit);
        }
    }

    public void addFruits (T fruit) {
        basket.add(fruit);
    }

    public float getWeight() {
        float sum = 0;
        for(Object T : basket) {
            if (!T.equals(null)) {
                sum += Fruit.fruitWeight;
            }
        }
        return sum;
    }

    public boolean compare (Box <?> another) {
        if (this.getWeight() == another.getWeight()) {
            return true;
        }
        else return false;
    }



}
