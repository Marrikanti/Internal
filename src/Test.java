import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Test {
	
	public static void main(String args[]){
		int num=98234;
		int small,big;
		small=big=num%10;
			while(num>0){
				int rem=num%10;
				num=num/10;
				if(rem>big){
					big=rem;
				}
				else if(rem<big && rem > small){
					small=rem;
						
				}
				
			}
			System.out.println("Big "+ big + " small " +small) ;
			System.out.println("Thanks");
			
		}
	}


