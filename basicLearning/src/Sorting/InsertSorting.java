package Sorting;

/*
 * ���� : ���ʴ�� �ϳ��� ���� �̾Ƽ� ���ĵ� �迭�� �˸��� ��ġ�� ����ֱ�
 * 
 * ����
 * 1) ù ��° �ε����� ���� �״�� ���ΰ� �� ��° ���� �������� 
 * 2) ù ��° ���� ���ؼ� �������߱� -> �� �� ���ĵ� �迭 ����
 * 3) �� ��° ���� �̾ƿ� �� ���ĵ� �迭�� ��
 * 4) ������ �ݺ�
 */
public class InsertSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample sc = new Sample();
		int arr[] = {4,2,1,6,5,3,9,7,8};
		sc.showing(arr);
		sc.sorting(arr);
		sc.showing(arr);
	}

}
class Sample{

	public void showing(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println();
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}

	public void sorting(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for(int j=1; j<arr.length;j++) {		// ù��° �ε��� ��(arr[0])�� ����
			for(int i=0;i<j;i++) {				// ���� ������� Ž��, arr[j]�� �ϳ��� ����
				if(arr[i]>arr[j]) {					// ���� ����� arr[i] �߿��� ���� ���� ���� ������ arr[j]�� ��ġ �ٲ� 
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.print("\n"+j+"ȸ��: ");
			showing(arr);
		} // for j
	}
	
}
