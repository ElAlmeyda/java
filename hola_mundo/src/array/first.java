package array;

public class first {

	
	public static void main(String[] arg) {
		
		int [] x= {0,1,2,3,4};
		String res="";
		
		for(int i=0;i<x.length;i++) {
			int result = x[i];
			res += result + "-";
		}
		System.out.print(res.substring(0,res.length()-1)+"\n");
		int [] y = {1,0,3,2};
		String pri="";
		for(int i:y) {
			pri += i + " ";
		}
		
		ordenar(y, pri);
	}
	
	
	public static void ordenar(int []x, String pri) {
		String res="";
		System.out.println(pri);
		for(int i:x) {
			for(int j=i+1;j< x.length; j++) {
				if(i>x[j]) {
					int aux=i;
					i=x[j];
					x[j]=aux;
				}
			}
			res += x[i] + " ";
		}
		System.out.println(res);
	}
}
