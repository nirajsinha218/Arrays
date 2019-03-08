
public class ArrayRotationusingRotationAlgorithm {

	private static void rotateUsingRotationAlgo(int[] arr, int rotateBy, int arraySize) {

		if (rotateBy > arraySize) {
			rotateBy = rotateBy % arraySize;
		}
		reverseArray(arr, 0, rotateBy - 1);
		reverseArray(arr, rotateBy, arraySize - 1);
		reverseArray(arr, 0, arraySize - 1);

	}

	private static void reverseArray(int[] arr, int startIndex, int lastIndex) {

		int temp;
		while (startIndex < lastIndex) {
			temp = arr[startIndex];
			arr[startIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
			startIndex++;
			lastIndex--;
		}

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int rotateBy = 16;
		int arraySize = arr.length;
		rotateUsingRotationAlgo(arr, rotateBy, arraySize);
		for (int elements : arr) {
			System.out.print(elements + " ");
		}

	}

}
