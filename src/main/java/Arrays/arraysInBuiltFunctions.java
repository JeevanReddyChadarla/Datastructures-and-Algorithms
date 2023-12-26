package Arrays;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class arraysInBuiltFunctions {
	    public static void main(String[] args) {
	        // Sorting
	        Integer[] intArray = {5, 2, 8, 1, 6};
	        Arrays.sort(intArray);
	        System.out.println("Sorted array: " + Arrays.toString(intArray));

	        // Sorting array of Strings
	        String[] strArr = {"Apple", "kiwi", "Guava"};
	        Arrays.sort(strArr);
	        System.out.println("Sorted String array: " + Arrays.toString(strArr));
	        
	        // Sorting with a custom comparator
	        String[] strArray = {"Apple", "kiwi", "Guava"};
	        Arrays.sort(strArray, Comparator.reverseOrder());
	        System.out.println("Reverse sorted array: " + Arrays.toString(strArray));

	        // Searching
	        int searchKey = 8;
	        int index = Arrays.binarySearch(intArray, searchKey);
	        System.out.println("Index of " + searchKey + ": " + index);

	        // Filling
	        char[] charArray = new char[5];
	        Arrays.fill(charArray, 'X');
	        System.out.println("Filled char array: " + Arrays.toString(charArray));

	        // Filling a specific range
	        Arrays.fill(charArray, 1, 3, 'Y');
	        System.out.println("Filled range in char array: " + Arrays.toString(charArray));

	        // Equality Testing
	        Integer[] arr1 = {1, 2, 3};
	        Integer[] arr2 = {1, 2, 3};
	        System.out.println("Arrays are equal: " + Arrays.equals(arr1, arr2));

	        // Conversions
	        String[] stringArray = {"Hello", "World"};
	        List<String> stringList = Arrays.asList(stringArray);
	        System.out.println("List from array: " + stringList);

	        // Copying
	        int[] sourceArray = {1, 2, 3, 4, 5};
	        int[] destinationArray = Arrays.copyOf(sourceArray, 3);
	        System.out.println("Copied array: " + Arrays.toString(destinationArray));

	        // Copying a range
	        int[] rangeArray = Arrays.copyOfRange(sourceArray, 1, 4);
	        System.out.println("Copied range array: " + Arrays.toString(rangeArray));

	        //Cloning array
	        int[] originalArray = {1, 2, 3, 4, 5};
	        int[] clonedArray = originalArray.clone();
	        System.out.println("Clone array: "+Arrays.toString(clonedArray));
	        
	        // ToString
	        double[] doubleArray = {1.2, 3.4, 5.6};
	        System.out.println("String representation: " + Arrays.toString(doubleArray));
	    }
	}