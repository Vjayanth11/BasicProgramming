package objectorientd.dynamicArray;

public class MainRunner {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        for (int i = 1; i <= 15; i++) {
            myArray.add(i * 10);
        }

        System.out.println("Elements in MyArray:");
        for (int i = 0; i < myArray.size(); i++) {
            System.out.print(myArray.get(i) + " ");
        }

        System.out.println("\nSize of MyArray: " + myArray.size());

        int indexToAccess = 5;
        System.out.println("Element at index " + indexToAccess + ": " + myArray.get(indexToAccess));
    }
}

