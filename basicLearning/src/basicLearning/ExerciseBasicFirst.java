package basicLearning;

public class ExerciseBasicFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode sample1 = new MyNode(0);
		
		sample1.append(20); // �� ���� 20�̶�� ���� ������ '���'�� �߰����ִ� �Լ�
	//	sample2.delete(40);   // 40�̶�� �����͸� ������ ��带 �����ϴ� �Լ� 
		sample1.append(30);
		sample1.append(40);
		sample1.append(50);
		sample1.retreive();
	}

}

//������ �ܺ� Ŭ���� �������� ����
class MyNode{
	int data;							// ���� ��忡 ���� ��
	MyNode next_addr  = null;			// 1. ���� �ּҸ� ����ų ������ ���� 2. �����ο��� ������ ��带 ���� ���̴� �� (����ο����� ����)
	
	// ������ �Լ� - �ʱ�ȭ�� ��, Ŭ���� ������ �� �����Լ�ó�� �ڵ����� ȣ��
	MyNode(int pData){
		this.data = pData;			// 1.pData��� �Ű����ڸ� Ŭ������ ������ �� �⺻ ���� ����ִ� ���� 2. this�� ���� MyNode Ÿ���� Ŭ���� �� ������ Ŭ������ ��Ī (������)
	} // end Constructor

	// 1.MyNode Ŭ���� �ȿ� ���� MyNode�� ���� �Լ��� ����� ���� 2. �� ���� ��带 ã�ư��� �߰��ϴ� �Լ� (�ܹ��� ��ũ�帮��Ʈ)
	public void append(int pData) {
		// TODO Auto-generated method stub
		 MyNode end = new MyNode(pData);		// ������ ��忡 20�̶�� �����͸� �־ ���� ������ ��
		 MyNode temp = this;							// ��ũ�帮��Ʈ�� Ư���� ������Ŭ�������� �����ؾ� ��
		while(temp.next_addr != null) {				// next_addr ���� �̹� �����ο��� �����صξ���
			 temp = temp.next_addr;					// ����Ǿ��ִ� ��尡 ������, temp�� ����Ű�� MyNode�� �ϳ��� �ٲ�
		 }
		temp.next_addr = end;	// �����ο��� ��带 �����ϴ� ����� -> ����� : MyNode end = new MyNode(20) �� �Ȱ��� �����
	} // end append
	
	// 2. 40�̶�� ������ ���� ������ ��带 ã�� �ϷĿ��� ������Ű�� 
	public void delete(int pData) {
		MyNode temp = this;				// ������ Ŀ�� ����, ����� Ŭ������ �������̱⵵ ��
		while(temp.next_addr != null) {				// ���� ������ �� ���� �ݺ�Ž��
			if(temp.next_addr.data == pData) {	// temp.next_addr�� �̹� ���� ��带 �ǹ��ϴ� ����
				temp.next_addr = temp.next_addr.next_addr;		// next_addr�� �и��� ����Ű�� �ִ� ��尡 ���� ����. ��, ������Ű�� ���
			}
			else {
				temp = temp.next_addr;		// ����� ��尡 ���� �� ��尡 �Ǿ� Ŀ�� ������ �ϰ� ��
			} 				
		} // end while 
	} // end delete
	
	// 3.�� �������� �� ������ ���� ��ȸ�ؼ� ������ �����͸� ��ȯ���ִ� �Լ�
	public void retreive() {
		int num = 0;
		MyNode temp = this;
		System.out.println("ù������: "+temp.data);		// ó�� ����� �����͵� �����ֱ�
		while (temp.next_addr != null) {
			temp = temp.next_addr;				// �ϳ��� �̵�
			System.out.println("������: " + temp.data);
			num++;
		}
		System.out.println("�� �� ? " + num);
	}
	
} // end Class
