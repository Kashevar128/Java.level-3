import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayMethodTest {
    private static ArrayMethod arrayMethod;

    @BeforeClass
    public static void initTest() {
        arrayMethod = new ArrayMethod();
        System.out.println("init suite");
    }

    int[] arr = {1, 4, 1, 4, 5, 6, 1, 4};
    @Test
    public void testMethod2() {
        Assert.assertTrue(ArrayMethod.method2(arr));
    }

    int[] arr2 = {1, 4, 1, 4, 4, 1, 1, 4};
    @Test
    public void test2Method2() {
        Assert.assertTrue(ArrayMethod.method2(arr2));
    }

    int[] arr3 = {1, 4, 1, 0, 0, 1, 0, 4, 0, 0};
    @Test
    public void test3Method2() {
        Assert.assertTrue(ArrayMethod.method2(arr3));
    }

    int[] arr4 = {4, 4, 4, 1, 4};
    @Test
    public void test4Method2() {
        Assert.assertTrue(ArrayMethod.method2(arr4));
    }






    int[] matrix = {1, 4, 5, 7, 0, 4, 2, 3, 0, 2};
    int[] matrix2 = {2, 3, 0, 2};
    @Test
    public void testMethod1() {
        Assert.assertArrayEquals(matrix2, ArrayMethod.method1(matrix));
    }

    int[] matrix3 = {5, 10, 21, 4, 5, 6};
    int[] matrix4 = {5, 6};
    @Test
    public void test2Method1() {
        Assert.assertArrayEquals(matrix4, ArrayMethod.method1(matrix3));
    }

    int[] matrix5 = {7, 8, 0, 4, 4, 4, 7};
    int[] matrix6 = {7};
    @Test
    public void test3Method1() {
        Assert.assertArrayEquals(matrix6, ArrayMethod.method1(matrix5));
    }

    int[] matrix7 = {10, 12, 13, 4, 5, 0};
    int[] matrix8 = {5, 3, 7};
    @Test
    public void test4Method1() {
        Assert.assertArrayEquals(matrix8, ArrayMethod.method1(matrix7));
    }
}
