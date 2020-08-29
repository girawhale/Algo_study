package class2.boj10814;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10814_tk {
	static class Person implements Comparable<Person>{
		int age;
		String name;
		
		Person(int age, String name) {
			this.age = age;
			this.name = name;
		}

		@Override
		public int compareTo(Person o) {
			return this.age - o.age;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person[] arr = new Person[n];
		for(int i = 0; i < n; i++) {
			arr[i] = new Person(sc.nextInt(), sc.next());
		}
		Arrays.sort(arr);
		for(Person p : arr) {
			System.out.println(p.age + " " + p.name);
		}
	}
}
