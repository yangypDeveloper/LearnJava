class SingletonTest {
	public static void main(String[] args) {
		SingletonA.getInstance();
		SingletonB.getInstance();
		
	}
}
/**
 ** 懒汉式(线程不安全)
 */
class SingletonA{
	private static SingletonA uniqueInstance;
	private SingletonA(){
		System.out.println("SingletonA created");
	}
	public static SingletonA getInstance(){
		if(uniqueInstance==null){
			uniqueInstance=new SingletonA();
		}
		return uniqueInstance;
	}
}
// TODO 懒汉式多线程改进
/**
 ** 饿汉式(线程安全)
 */
class SingletonB{
	private static SingletonB uniqueInstance=new SingletonB();
	private SingletonB(){
		System.out.println("SingletonB created");
	}
	public static SingletonB getInstance(){
		return uniqueInstance;
	}
}