package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		File f=new File("c:/acorn202206/my_Folder/memo.txt"); //메모파일 없음
		//실제로 파일이 만들어지는지 확인해 보세요
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
