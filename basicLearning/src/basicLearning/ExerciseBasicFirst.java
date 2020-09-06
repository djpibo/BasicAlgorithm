package basicLearning;

public class ExerciseBasicFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode sample1 = new MyNode(0);
		
		sample1.append(20); // 맨 끝에 20이라는 값을 가지는 '노드'를 추가해주는 함수
	//	sample2.delete(40);   // 40이라는 데이터를 가지는 노드를 제거하는 함수 
		sample1.append(30);
		sample1.append(40);
		sample1.append(50);
		sample1.retreive();
	}

}

//적당한 외부 클래스 형식으로 만듬
class MyNode{
	int data;							// 실제 노드에 들어가는 값
	MyNode next_addr  = null;			// 1. 다음 주소를 가리킬 포인터 역할 2. 구현부에서 연결할 노드를 새로 붙이는 것 (선언부에서는 생성)
	
	// 생성자 함수 - 초기화할 때, 클래스 생성할 때 메인함수처럼 자동으로 호출
	MyNode(int pData){
		this.data = pData;			// 1.pData라는 매개인자를 클래스를 생성할 때 기본 값에 집어넣는 과정 2. this는 이제 MyNode 타입의 클래스 중 생성한 클래스를 지칭 (유일자)
	} // end Constructor

	// 1.MyNode 클래스 안에 들어가야 MyNode의 조작 함수로 사용이 가능 2. 맨 끝의 노드를 찾아가서 추가하는 함수 (단방향 링크드리스트)
	public void append(int pData) {
		// TODO Auto-generated method stub
		 MyNode end = new MyNode(pData);		// 마지막 노드에 20이라는 데이터를 넣어서 먼저 생성해 둠
		 MyNode temp = this;							// 링크드리스트의 특성상 지목대상클래스부터 시작해야 함
		while(temp.next_addr != null) {				// next_addr 값은 이미 구현부에서 설정해두었음
			 temp = temp.next_addr;					// 연결되어있는 노드가 있으면, temp가 가리키는 MyNode가 하나씩 바뀜
		 }
		temp.next_addr = end;	// 구현부에서 노드를 생성하는 방식임 -> 선언부 : MyNode end = new MyNode(20) 와 똑같은 기능임
	} // end append
	
	// 2. 40이라는 데이터 값을 가지는 노드를 찾고 일렬에서 배제시키기 
	public void delete(int pData) {
		MyNode temp = this;				// 일종의 커서 역할, 지명된 클래스로 시작점이기도 함
		while(temp.next_addr != null) {				// 끝에 도달할 때 까지 반복탐색
			if(temp.next_addr.data == pData) {	// temp.next_addr은 이미 다음 노드를 의미하는 거임
				temp.next_addr = temp.next_addr.next_addr;		// next_addr는 분명히 가리키고 있는 노드가 있을 것임. 즉, 배제시키는 기능
			}
			else {
				temp = temp.next_addr;		// 연결된 노드가 이제 본 노드가 되어 커서 역할을 하게 됨
			} 				
		} // end while 
	} // end delete
	
	// 3.한 방향으로 끝 노드까지 전부 조회해서 노드들의 데이터를 반환해주는 함수
	public void retreive() {
		int num = 0;
		MyNode temp = this;
		System.out.println("첫데이터: "+temp.data);		// 처음 노드의 데이터도 보여주기
		while (temp.next_addr != null) {
			temp = temp.next_addr;				// 하나씩 이동
			System.out.println("데이터: " + temp.data);
			num++;
		}
		System.out.println("몇 번 ? " + num);
	}
	
} // end Class
