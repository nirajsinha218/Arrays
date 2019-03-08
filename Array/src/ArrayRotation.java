
public class ArrayRotation {

	private static int[] rotate(int arr[], int rotateBy, int arraySize) {

		int tempArray[] = new int[arraySize];
		if (rotateBy > arraySize) {
			rotateBy = rotateBy % arraySize;
		}
		for (int i = 0; i < arraySize; i++) {
			if ((i - rotateBy) >= 0) {
				tempArray[i - rotateBy] = arr[i];
			} else {
				tempArray[arraySize + i - rotateBy] = arr[i];
			}
		}
		return tempArray;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int rotateBy = 15;
		int arraySize = arr.length;
		arr = rotate(arr, rotateBy, arraySize);
		for (int elements : arr) {
			System.out.print(elements + " ");
		}

	}

}
