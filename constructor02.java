public class constructor02{
	public static void main(String[] args){
		Person p1 = new Person();
		System.out.println(p1.age);
		Person p2 = new Person("����",20);
		System.out.println(p2.name + '\t' + p2.age);

	}
}

class Person{
	String name;
	int age;
	public Person(){
		System.out.println("�޲ι�����������");
		age = 18;
	}
	public Person(String iname,int iage){
		System.out.println("�вι�����������");
		name = iname;
		age = iage;
	}
}