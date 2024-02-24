 package typecasting;

import javax.sql.rowset.JoinRowSet;

public class Typecasting_1 {
public static void main(String[] args) {
	
//	lower data type to higher data assing this is widening
int val=88;
double ans=val;
System.out.println(ans);
	
	
	double a=999;
//	narrowing higher data type to lower data type convert this is narrowing type casting
	 int d=(int) a;
	 System.out.println(d);
}
}
