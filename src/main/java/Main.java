import simple_classes.Book;
import simple_classes.Magazine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {



        /* Trying out with Branches
        *
        *
        *  */


        String space = "\n_________";
        // TASK 1
        int[] integers = {55, 11, 12, 676, 57, 48, 99, 909};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : integers) {
            list.add(i);
        }
        System.out.printf("Number of Palindromes: %s", getNumberOfPalindromes(list));
        System.out.println(space);


        // TASK 2
        String[] stringList = {"First", "Third", "Second", "Forth", "Fifth"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringList));
        System.out.println(arrayList);
        System.out.println(changeElements(arrayList, 1, 2));
        System.out.println(space);

        int[] numbers = {1, 2, 3, 5, 4, 6, 7, 8};
        ArrayList<Integer> listNum = new ArrayList<>();
        for (int i : numbers) {
            listNum.add(i);
        }
        System.out.println(listNum);
        System.out.println(changeElements(listNum, 3, 4));
        System.out.println(space);


        // TASK 3

        System.out.printf("Maximum Value in Integer Array is: %d", maxElementInRangeArray(listNum, 4, 6));
        System.out.println(space);

        // TASK 4
        // Generic Class for Library
        LibraryGeneric<Book> libraryGenericBook = new LibraryGeneric<>(new Book("Java for Dummies",
                "Some Genius", 400));
        System.out.println(libraryGenericBook);

        LibraryGeneric<Magazine> libraryGenericMagazine = new LibraryGeneric<>(new Magazine("Forbes", "Media Investments", 500));
        System.out.println(libraryGenericMagazine);


        Magazine magazine = new Magazine("Cosmopolitan", "Herst Corporation", 1741);
        System.out.println(magazine);

    }

    // TASK 1: Generic method for get the palindrome number
    public static <T extends Integer> int getNumberOfPalindromes(Collection<T> numberList) {
        int tempNum;
        int remainder;
        int reversedNum = 0;
        int count = 0;

        for (T t : numberList) {
            tempNum = Integer.parseInt(String.valueOf(t));
            int originalNum = tempNum;
            while (tempNum != 0) {
                remainder = tempNum % 10;
                reversedNum = reversedNum * 10 + remainder;
                tempNum /= 10;
            }
            if (originalNum == reversedNum) {
                count++;
            }

            reversedNum = 0;
        }

        return count;
    }


    // TASK 2: change the position  of two elements in array
    public static <T> ArrayList<T> changeElements(ArrayList<T> list, int indexA, int indexB) {
        T tempItem = list.get(indexB);
        list.set(indexB, list.get(indexA));
        list.set(indexA, tempItem);
        return list;
    }


    // TASK 3: find the maximum element in the range (start, end) of the collection
    public static <T extends Integer> T maxElementInRangeArray(ArrayList<T> list, int start, int end) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            arrayList.add((list.get(i)));
        }
        return Collections.max(arrayList);
    }

}
