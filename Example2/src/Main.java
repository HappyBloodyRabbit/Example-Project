
public class Main {
	
	private String name;
	private int age;
	
	
	
	public Main() {
		super();
	}


	public Main(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Main [name=" + name + ", age=" + age + "]";
	}


	public void foo(){
		setObject(this);
		System.out.println("name: " + ", age: " + age);
//		System.out.println("My name is " + main.getName() + " I'm " + main.getAge() + " years old.");
		
	}
	
	public static void setObject(Main main){
		
	}


	public static void main(String[] args) {
		Main main1 = new Main("Eugene", 23);
		Main main2 = new Main("Jordan", 21);
		
		System.out.println(main1.toString());
		
		
	}
	
}
