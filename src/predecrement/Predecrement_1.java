package predecrement;

public class Predecrement_1 {
	int a=33;//	global variable or instance variable

	
	void addtwonumber() {
		int a=23;//local variable
		System.out.println(this.a);
//		this.a IsindexAction pointing to windows object use 
//		to access  most priority in local scope
	}
	
	
	
	public static void main(String[] args) {
		Predecrement_1 ans =new Predecrement_1();
		ans.addtwonumber();
		int i=11;
		System.out.println(--i);;//10
		System.out.println(i--);//10
		System.out.println(i++);//9
		System.out.println(--i);//9
		System.out.println(--i);//8
		System.out.println(i++);//8
		System.out.println(--i);//8

		System.out.println(i++);//8
		System.out.println(i--);//9
		System.out.println(--i);//7
		System.out.println(i++);//7
		System.out.println(--i);//7
		
	}

}
