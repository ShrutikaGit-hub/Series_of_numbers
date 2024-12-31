package practise1;

public class Seriesof2 {
	public static void main(String []args) {
		int count = 1;
		int num = 1;
		while(count <= 10) {
			if(num%2 == 0) {
				System.out.println(num);
				num++;
				count++;
			}
			else {
				num++;
			}
		}
	}
}
