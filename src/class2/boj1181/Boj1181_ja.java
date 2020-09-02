package class2.boj1181;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Boj1181_ja {
	/**
	 * 
	 * 단어 정렬
	 * 1. 길이가 짧은 것부터
	 * 2. 길이가 같으면 사전 순
	 * 
	 * N : 단어의 개수
	 * 소문자로 이루어짐
	 * 문자열 길이는 50까지
	 * 같은 단어가 여러 번 입력되 경우에는 한 번만
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Set<String> str = new HashSet<>();
		for(int i=0;i<N;i++) {
			str.add(in.next());
			
		}
		List<String> arr = new ArrayList<>(str);
		arr.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() <= o2.length()) {
					if(o1.length() == o2.length()) {
						return o1.compareTo(o2);
					}
					return -1;
				}
				return 1;
			}
		});
		for(String s : arr) {
			System.out.println(s);
		}
	}
	
	
}
