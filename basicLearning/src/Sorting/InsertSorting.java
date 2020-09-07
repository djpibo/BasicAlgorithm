package Sorting;

/*
 * 정의 : 차례대로 하나씩 값을 뽑아서 정렬된 배열의 알맞은 위치에 집어넣기
 * 
 * 순서
 * 1) 첫 번째 인덱스의 값은 그대로 냅두고 두 번째 값을 가져오기 
 * 2) 첫 번째 값과 비교해서 서열맞추기 -> 이 때 정렬된 배열 생성
 * 3) 세 번째 값을 뽑아온 후 정렬된 배열과 비교
 * 4) 끝까지 반복
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
		for(int j=1; j<arr.length;j++) {		// 첫번째 인덱스 값(arr[0])은 냅둠
			for(int i=0;i<j;i++) {				// 세모 모양으로 탐색, arr[j]를 하나씩 뽑음
				if(arr[i]>arr[j]) {					// 세모 모양의 arr[i] 중에서 가장 작은 값이 있으면 arr[j]와 위치 바꿈 
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.print("\n"+j+"회차: ");
			showing(arr);
		} // for j
	}
	
}
