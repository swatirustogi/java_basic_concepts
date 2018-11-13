package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		int i = -1;
		// TODO Auto-generated method stub
		try {
			FileInputStream fin = new FileInputStream("D:\\swati\\slides_path_in_E_drive.txt");
			FileOutputStream fout = new FileOutputStream("D:\\\\swati\\\\slides_path_in_E_drive1.txt");
			do
			{
				i = fin.read();
				if(i!=-1)
					fout.write(i);
			}
			while(i!=1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
