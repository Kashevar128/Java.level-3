package Home_Work_Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    List<T> basket = new ArrayList();

    public void addFruits (T fruit, int n) {
        for (int i = 0; i < n; i++) {
            basket.add(fruit);
        }
    }

    public void addFruits (T fruit) {
        basket.add(fruit);
    }

    public float getWeight() {
        return (Fruit.fruitWeight*basket.size());
    }

    public boolean compare (int another) {
        
    }

    public void shiftFruits () {
        basket.clear();
    }




}
