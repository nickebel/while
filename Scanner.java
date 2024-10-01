package programacao;

import java.io.InputStream;

public class Scanner {
	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int cc = 0;
		
		
		while (cc<10) {
			
			cc++;
			if (cc==7) {
				break;
			}
			System.out.println("Camabalhota"+ cc);
		}
		
	}

}
