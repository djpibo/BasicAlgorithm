package SelectSorting;

/*
 * ���� ����
 * 1) �迭�� ���� �� Ž��
 * 2) ���� ���� ��/ ���� ū ���� ������ (�������� or ��������)
 */

public class SelectSoringbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,1,4,9,6,5,8,7};
		boolean mode = true; // �⺻�� ��������(ASC)

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

			// 1) Ž��
			for(int j=0;j<size-1;j++) {
				int min = 100;
				for(int i=j; i<size;i++) {
					if(min>arr[i]) {
						min = arr[i];
						index = i;
					}
				}
				// 2) ����
				temp = arr[j];
				arr[j] = min;
				arr[index] = temp;

				System.out.println("\n");
				for(int i =0; i<arr.length; i++)
					System.out.print(arr[i] + " ");
				System.out.print("\n"+(j)+"ȸ�� min: "+arr[j] + " index: "+index);

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
				System.out.print("\n"+(j)+"ȸ�� min: "+arr[j] + " index: "+index);

				System.out.println();
				for(int i =0; i<arr.length; i++)
					System.out.print(arr[i] + " ");

			}

		}

	}

}
