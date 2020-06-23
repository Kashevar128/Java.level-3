package Home_Work_Lesson_1;

import java.util.ArrayList;
import java.util.List;

public class Box{
    List<TransferApple> basket = new ArrayList();
    List<TransferOrange> basket = new ArrayList<>();

    public void addFruits (TransferApple fruit) {basket.add(fruit);}


    public float getWeight() {
        return (float) (Fruit.fruitWeight*basket.size());
    }

    public boolean compare (int another) {
        return Math.abs(this.getWeight() - another.getWeight) < 0.0001;
    }

    public void shiftFruits (Object box) {
        box = basket.size();
        basket.clear();
    }




}
