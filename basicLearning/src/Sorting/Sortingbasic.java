package Sorting;

/*
 * 선택 정렬
 * 
 * 정의 : 배열에서 가장 작은 수 or 가장 큰 수를 맨 앞으로 두면서 오름차순 or 내림차순으로 정렬하는 것
 * 
 * 순서 (오름차순)
 * 1) 배열을 전부 탐색한 후 가장 작은 수를 찾음
 * 2) 가장 작은 수를 맨 앞으로 이동(자리 바꾸기)
 * 3) 다음 탐색 단계부터 탐색할 배열을 한 칸씩 좁히기
 * 4) 마지막에는 탐색할 필요 없음 (총 반복횟수는 배열크기 -1임)
 */

public class Sortingbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,1,4,9,6,5,8,7};
		boolean mode = true; // 기본은 오름차순(ASC)

		SimpleClass sc = new SimpleClass();
		sc.showArray(arr);
		sc.sorting(arr,mode);	
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
				int min = arr[j];
				for(int i=j; i<size;i++) {
					if(min>=arr[i]) {
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
