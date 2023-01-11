import java.util.Scanner;
public class NumberSystem {
	public static void main(String[]args) {
		//Q1. Divisible by 2 numbers
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter input");
			int A = sc.nextInt();
			if(A%5==0 && A%11==0) {
				System.out.println(1);
			}
				else {
					System.out.println(0);
				}
			}
}*/
  //Q2. Max of three
  Scanner sc = new Scanner (System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();
  int C = sc.nextInt();
   if(A>= B && A>=C) {
	   System.out.println(A);
   }
	   else if(B>=C) {
		   System.out.println(B);
	   }
		   else {
			   System.out.println(C);
		   }
	}
}
   
	//Q3. Check even/odd
 /* Scanner sc = new Scanner(System.in);
  int N = sc.nextInt();
    if(N%2==0) 
    	System.out.print(1);
    else {
    System.out.println(0);
    }
}
}*/
//Q4. Min of two;
	/*	Scanner sc = new Scanner (System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A<=B) {
			System.out.println(A);
		}
		else {
			System.out.println(B);
		}
	}
}*/
//Q5. Min of three;
		/*Scanner sc = new Scanner (System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if(A<=B && A<=C) {
			System.out.println(A);
	}
			else if(B<=C) {
				System.out.println(B);
			}
				else {
					System.out.println(C);
				}
				
			}
		}*/




