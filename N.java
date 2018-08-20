import java.util.*;
public class N {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		String x=Integer.toString(n);
		ArrayList a=new ArrayList();
		int v=x.length();
		if(v<=3) {
			v=v-1;
		}else {
			v=v-k;
			
		}
		
		
		for(int i=0;i<=v;i++) {
			int r=k;
			if(r==x.length()) {
				r=0;
			}
			a.add(x.substring(0,i)+x.substring(i+r));
			
			
		}
		Collections.sort(a);
		System.out.println(a);
		System.out.println(a.get(0));
		
		
		
	}

}
