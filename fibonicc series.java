import java.util.*;
public class Solution {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n==0){
		System.out.print("0");
		return;
	}
	if(n==1){
		System.out.print("1");
		return;
	}

	int a=0,b=1;
	int c=0;
	for(int i=2;i<=n;i++){
		 c=a+b;
		a=b;
		b=c;
	}
	System.out.print(c);
	sc.close();
	
		
	}

}
