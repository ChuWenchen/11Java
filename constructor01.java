public class constructor01{
	public static void main(String[] agrs){
		Person p = new Person("����",20);
		System.out.println(p.name + '\t' + p.age);

	}
}

//  �ڴ�������Ķ���ʱ����ֱ��ָ�������������������

class Person{
	String name;
	int age;
//������û�з���ֵ��Ҳ����дvoid
//���������ֺ���Person���뱣��һ��
//���������β��б�
//һ�����п����ж��������������������������
	public Person(String iname,int iage){
		System.out.println("�����������ã���ɶ�������Գ�ʼ��");
		name = iname;
		age = iage;
	}
}