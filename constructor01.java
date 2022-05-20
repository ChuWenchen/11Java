public class constructor01{
	public static void main(String[] agrs){
		Person p = new Person("张三",20);
		System.out.println(p.name + '\t' + p.age);

	}
}

//  在创建人类的对象时，就直接指定这个对象的年龄和姓名

class Person{
	String name;
	int age;
//构造器没有返回值，也不能写void
//构造器名字和类Person必须保持一致
//括号内是形参列表
//一个类中可以有多个构造器，即构造器可以重载
	public Person(String iname,int iage){
		System.out.println("构造器被调用，完成对象的属性初始化");
		name = iname;
		age = iage;
	}
}