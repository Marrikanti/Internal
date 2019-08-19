import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Test1 {
	public static void main(String args[]){
		String str="Praneeth";
		//StringBuilder br= new StringBuilder();
		//br.append(str);
		//br.reverse();
		//System.out.println(br);
		
		char[] str1=str.toCharArray();
		for(int i=str1.length-1; i>=0; i--){
			System.out.print(str1[i]);
		}
		
	/*	List<Character> list=new ArrayList<>();
		for(char e:str1){
			list.add(e);
		}
		Collections.reverse(list);
		ListIterator li=list.listIterator();
		while(li.hasNext()){
			System.out.print(li.next().toString());
		}*/
		
	}

}
