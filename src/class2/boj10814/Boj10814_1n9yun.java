package class2.boj10814;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10814_1n9yun {
    static class Person{
        int idx;
        int age;
        String name;

        public Person(int idx, int age, String name) {
            super();
            this.idx = idx;
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Person[] personList = new Person[n];
        for(int i=0;i<n;i++) {
            personList[i] = new Person(i, sc.nextInt(), sc.next());
        }

        Arrays.sort(personList, ((p1, p2) -> {
            if(p1.age > p2.age) return 1;
            else if(p1.age == p2.age) {
                if(p1.idx > p2.idx) return 1;
                else return -1;
            }
            else return -1;
        }));

        for(Person p : personList) System.out.println(p.age + " " + p.name);
    }
}
