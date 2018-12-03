package com.biz.inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringInput01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strLetter = "src/com/biz/inout/loveLetter.txt";
		List<Integer> intList = new ArrayList();
		
		FileReader fr;
		
		try {
			fr = new FileReader(strLetter);
			
			while(true) {
				//ASCII코드로 파일을 읽기
				int read = fr.read();
				if(read < 0) break; 			//EOF이면 끝
				System.out.print(read + ", "); 	// (char)만 붙여주면 ASCII코드로 나온 값을 한글로 변환 됌
				
				intList.add(read);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// intList에 담긴 int값을 문자로 변환하여 콘솔에 출력하시오
		int listLen = intList.size();
		for(int i = 0 ; i < listLen ; i ++) {
			int t = intList.get(i);
			System.out.println((char)t);
//			System.out.print((char)(int)intList.get(i)); 위와 같은 코드
		}
		System.out.println();
		
		for(int i : intList) {
			System.out.print((char)i);
		}
		
	}

}
