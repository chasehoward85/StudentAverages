import java.io.*;
import java.util.*;
import java.math.*;

public class StudentAverages {

	public static void main(String[] args) throws IOException {

		Scanner ave = new Scanner(new File("E:\\StudentAverages\\StudentScores.in"));
		int maxIndx = -1;
		String text[] = new String[1000];
		double averTot = 0.0;
		
		while(ave.hasNext()){
			maxIndx++;
			text[maxIndx] = ave.nextLine();
		}
		
		ave.close();
		
		String name[] = new String[maxIndx + 1];
				
		int numA = 0;
		int aver = 0;
		
		for(int i = 0; i <= maxIndx; i++){
			Scanner num = new Scanner(text[i]);
			System.out.print(num.next() + ", average = ");
			
			while(num.hasNextInt()){
				aver = num.nextInt();
				averTot = averTot + aver;
				numA++;
			}
				averTot = (double) averTot / numA;
				System.out.println(Math.round(averTot));
				numA = 0;
				averTot = 0;
		}
		
	}

}
