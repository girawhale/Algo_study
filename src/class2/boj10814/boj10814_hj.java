package class2.boj10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boj10814_hj {
	
	public static class Person implements Comparable<Person> {
		int age;
		String name;
		
		Person(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public int compareTo(Person o) {
			return this.age-o.age;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Person> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			String[] s = br.readLine().split(" ");
			list.add(new Person(Integer.parseInt(s[0]), s[1]));
		}
		
		Collections.sort(list);
		
		for (int i = 0; i < N; i++) {
			System.out.println(list.get(i).age+" "+list.get(i).name);
		}
	}

}
