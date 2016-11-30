import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws IOException {
		Scanner af=new Scanner(new File("E:\\InputNumData\\StupidPlusSigns"));
		int aa=-1;
		String xyz[]=new String[1000];
		
		while (af.hasNext());
		{
			aa++;
			xyz[aa]=af.next();
		}
		af.close();
		
		for (int i=0;i<aa+1;i++)
		{
			String zyx=xyz[i].substring(1);
			System.out.println(zyx);
		}
	




	}

}
