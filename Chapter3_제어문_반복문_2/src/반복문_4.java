// while
import java.io.*;
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	FileReader fr=
        			new FileReader("C:\\javaDev\\javaStudy\\Chapter3_제어문_반복문_2\\src\\반복문_3.java");
        	int i=0;
        	while((i=fr.read())!=-1)// -1 ==>(문장끝 = 파일의 값이 없을 때) 파일 종료
        	{
        		System.out.print((char)i);
        		// 네트워크로 파일 전송
        	}
        }catch(Exception ex){}
	}

}
