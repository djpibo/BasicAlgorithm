package SelectSorting;

/*
 * 선택 정렬
 * 1) 배열을 전부 비교 탐색
 * 2) 가장 작은 수/ 가장 큰 수를 앞으로 (오름차순 or 내림차순)
 */

public class SelectSoringbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,1,4,9,6,5,8,7};
		boolean mode = true; // 기본은 오름차순(ASC)

		SimpleClass sc = new SimpleClass();
		sc.showArray(arr);
		sc.sorting(arr,mode);	
		sc.showArray(arr);
	}
}

class SimpleClass{
	
	public void showArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i =0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public void sorting(int[] arr, boolean mode) {
		// TODO Auto-generated method stub
		int size = arr.length;
		int index=0;
		int temp;
		if(mode) {

			// 1) 탐색
			for(int j=0;j<size-1;j++) {
				int min = 100;
				for(int i=j; i<size;i++) {
					if(min>arr[i]) {
						min = arr[i];
						index = i;
					}
				}
				// 2) 정렬
				temp = arr[j];
				arr[j] = min;
				arr[index] = temp;

				System.out.println("\n");
				for(int i =0; i<arr.length; i++)
					System.out.print(arr[i] + " ");
				System.out.print("\n"+(j)+"회차 min: "+arr[j] + " index: "+index);

				System.out.println();
				for(int i =0; i<arr.length; i++)
					System.out.print(arr[i] + " ");

			}

		}
		else {

			for(int j=0;j<size-1;j++) {
				int min = -100;
				for(int i=j; i<size;i++) {
					if(min<arr[i]) {
						min = arr[i];
						index = i;
					}
				}
				temp = arr[j];
				arr[j] = min;
				arr[index] = temp;

				System.out.println("\n");
				for(int i =0; i<arr.length; i++)
					System.out.print(arr[i] + " ");
				System.out.print("\n"+(j)+"회차 min: "+arr[j] + " index: "+index);

				System.out.println();
				for(int i =0; i<arr.length; i++)
					System.out.print(arr[i] + " ");

			}

		}

	}

}
