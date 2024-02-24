package loop;

import java.util.Iterator;

//import java.util.Iterator;

public class Loopclass {
////array string type
//
//String[] arr= {"raji","ranjith","ravi"};
//for (int i = 0; i <arr.length; i++) {
////arr[0]="ram";
//System.out.println(arr[i]);
//}
//
// System.out.println("////////////");
// 
//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//for (String i : cars) {
//  System.out.println(i);
//}
//
////array object type
//Object[] obj= {"raji",22,67,"ranjith"};
//for (int i = 0; i < obj.length; i++) {
//	System.out.println(obj[i]);
//}
//
//for (Object i : obj) {
//	  System.out.println(i);
//	}

public static void main(String[] args) {
	int e=23;
	int sum=0;
	
	for (int i = 0; i < e; i++) {
//		System.out.println(i);
		sum +=i;
	}
	System.out.println(sum);

	
//	while loop
	int g=1;
	while (g<10) {
		System.out.println(g);
		g++;
	}
	
//	do while
	int b=2;
	do {
		System.out.println(b);
		b++;
	} while (b<=15);
	
//	star patten +
	
	int val=6;
	for (int i = 0; i < val; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print("* ");  
		}
		System.out.println();  
		
	}
	
	
//	star patten-
	
	int row=7;       
	for (int i= row; i>=0 ; i--)  
	{  
	for (int j=0; j<=i; j++)  
	{   
	System.out.print("* ");  
	}  
	System.out.println();  
	}  
	
	
//	for loop sum number
	int num=10;
	int sum_1=0;
	for (int i = 0; i < num; i++) {
		sum_1 +=i;
	}
	System.out.println(sum_1);
	
//	//	while loop sum number
	
	   int x = 1, sum_2 = 0;
       while (x <= 10) {
          
           sum_2 += x;
           x++;
       }
       System.out.println("Sum: " + sum_2);
	
       
       int f=1;    
       do{    
           System.out.println(f);    
       f++;    
       }while(f>=10);  
       
//       for
       
       for (int k = 5; k >= 0; k--) {
             for (int j = 1; j<=k; j++) {
            	 System.out.print(j);
				
			}		
             System.out.println();
	}
//       find odd or even
       int n=12;
    for (int i = 0; i <n; i++) {
    	if(i%2 ==0) {
    		System.out.println("even:"+ i);
    		
    	}else {
    		System.out.println("odd :" + i);
    	}
		
	}
    
    for (int i = 1; i < 4; i++) {
    	
    	for (int j = 1; j <=3; j++) {
			System.out.print(1);
		}
	System.out.println();
		
	}
 for (int i = 1; i < 4; i++) {
    	
    	for (int j = 1; j <=3; j++) {
			System.out.print(j);
		}
	System.out.println();
	}
       
	
	
	
}
}
