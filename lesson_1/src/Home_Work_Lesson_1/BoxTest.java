package Home_Work_Lesson_1;

public class BoxTest {
    public static void main(String[] args) {
        Box <TransferApple> box1 = new Box();
        Box <TransferOrange> box2 = new Box();
        box1.addFruits(new Apple(), 3);
        box1.addFruits(new Apple());
        box2.addFruits(new Orange());
        box2.addFruits(new Orange());
    }
}
