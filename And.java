import java.util.Scanner;
public class And {
	public static void main(String []args )    {
		String input1="vip";
		String input2="vip";
		String input3="vip";
		String result="";
		int length=0;
		if(input1.length()<input2.length()&&input1.length()<input3.length()) {
			length=input1.length();
		}else if(input2.length()<input3.length()&&input2.length()<input1.length()) {
			length=input2.length();
		}else {
			length=input3.length();
		}
		for(int i=0;i<length;i++) {
			if(input1.charAt(i)==input2.charAt(i)&&input2.charAt(i)==input3.charAt(i)) {
				result+=input1.charAt(i);
			}
		}
		System.out.println(result);
			
		}
		
		
		
		
	}
