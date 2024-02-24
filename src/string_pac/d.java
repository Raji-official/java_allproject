package string_pac;

public class d {
	public static void main(String[] args) {
		
		
//		IMmutable
		
		String R="raji";
		String s="raji";//string method memory inside the heap memory
		String c="swetha";
		
	
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(R));
		
		
		
		String concat = R.concat(s).concat(c);
		System.out.println(concat);
		
		
//		mutable
		
		StringBuffer a=new StringBuffer("welcome"); 
		StringBuffer b=new StringBuffer("welcome");//string method heap memory
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		StringBuffer append = a.append(b);
		System.out.println(System.identityHashCode(append));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
