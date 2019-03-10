import java.io.*;
import java.util.*;
public class StringConversion {
	 public static void main(String[] args)throws IOException { 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();
        String str2=str1.toUpperCase();
        System.out.println(str2);
	}
}