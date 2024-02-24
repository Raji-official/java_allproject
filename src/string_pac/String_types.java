package string_pac;

public class String_types {
	public static void main(String[] args) {
		
		
//		IMmutable
		
		String R="raji";
		String s="raji";//string method memory inside the heap memory 
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(R));
		String d = R.concat(s);
		System.out.println(System.identityHashCode(d));
		
		

		
		
		
		
		
//		mutable   
		
		StringBuffer a=new StringBuffer("welcome"); 
		StringBuffer b=new StringBuffer("welcome");//string method heap memory
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		StringBuffer append = a.append(b);
		System.out.println(System.identityHashCode(append));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
