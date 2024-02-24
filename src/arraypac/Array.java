package arraypac;

public class Array {

	
	public static void main(String[] args) {
		
//      find odd or even
    int[] array= {20,30,40,50};   
    int sum=0;
    for (int i = 0; i < array.length; i++) {
    	sum+=array[i];
    	
	} 
    System.out.println(sum);
   
//
    
int[]array_4= {100,200,300,400,500,600,700,800};
for (int i = 0; i < array_4.length; i++) {
	System.out.println("element at index "+i+":" + array_4[i]);
}
    
    
//  find odd or even
    int[] array_1= {1,2,3,4,5,6};
    int countEven = 0, countOdd = 0;
for (int i = 0; i <array_1.length; i++) {
	if(array_1[i]%2==0) {
	
		countEven+=1;	
	}else {
		
		countOdd+=1;
	}
}
System.out.println("even"+countEven);
System.out.println("odd" +countOdd);
   

int[] array_3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };

double length = array_3.length;

int sum_1 = 0;

for (int i = 0; i < array_3.length; i++) {
    sum_1 += array_3[i];
}
System.out.println(sum_1);
System.out.println(length);
double average = sum_1 / length;
 
System.out.println("Average of array : "+average);


//foreach
int[] datas= {23,45,67,87,98};
for(int val:datas) {
	System.out.println(val);
	
}






   
	}
}
