package kosa.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam2 {

	public static void main(String[] args) {
		String data[] = {
				"bat", "bba", "bbg", "bonus",
				"CA", "ca", "c232", "car",
				"date", "dic", "diraaa"
		};
		
//		Pattern p = Pattern.compile("c[a-z]*");	//c로 시작하는 영소문자 문자열 패턴 생성
//		
//		for (int i = 0; i < data.length; i++) {	
//			Matcher m = p.matcher(data[i]);		//c로 시작하는 영소문자 문자열 패턴 검색해 해당 객체 반환
//			
//			if (m.matches()) {		//매칭이 되면 (true)	(패턴 만족하는)
//				System.out.println(data[i]);
//			}
//		}
		
		
//		String source = "ab?cd?ef?hg";
//		String reg = "(\\w*)";		//특수문자 없는 문자열을 한 그룹으로
//		
//		Pattern p = Pattern.compile(reg);
//		Matcher m = p.matcher(source);		//조건(정규표현식)을 만족하는지 매칭
//		
//		while(m.find()) {		//매칭된 (조건을 만족한) 모든 객체 출력
//			System.out.println(m.group());
//		}
		
		
		//전화번호만 뽑아내기
		String source = "HP: 010-1111-1111, HOME: 02-222-2222";
		String reg = "(\\d{2,3}-\\d{3,4}-\\d{4})";
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(source);		
		
		while(m.find()) {	
			System.out.println(m.group());
		}
		
		
		
	}
}
