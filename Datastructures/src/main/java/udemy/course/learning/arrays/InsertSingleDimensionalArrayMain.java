package udemy.course.learning.arrays;

public class InsertSingleDimensionalArrayMain {
    public static void main(String[] args) {
        InsertSingleDimensionalArray insertSingleDimensionalArray = new InsertSingleDimensionalArray(10);
        insertSingleDimensionalArray.insert(0,10);
        insertSingleDimensionalArray.insert(4,20);
        insertSingleDimensionalArray.insert(4,30);
        insertSingleDimensionalArray.insert(10,10);

        int firstElement = insertSingleDimensionalArray.arr[0];
        System.out.println(firstElement);
//        int lastElement = insertSingleDimensionalArray.arr[10];
//        System.out.println(lastElement);

        insertSingleDimensionalArray.traverseArray();
        insertSingleDimensionalArray.searchElementInArray(20);
        insertSingleDimensionalArray.deleteValueAtSpecificIndex(4);

    }
}
