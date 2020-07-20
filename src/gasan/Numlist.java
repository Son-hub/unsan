package gasan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Numlist {
	private Scanner sc;
	private int one;
	private int two;
	private int dab;

	public Numlist() {
		sc = new Scanner(System.in);
	}

	public int[] numlist() {
		// 랜덤 숫자 리스트배열에 넣음
		Random rnd = new Random();
		ArrayList<Integer> numslist = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			numslist.add(i);
		}
		one = rnd.nextInt(numslist.size());
		two = rnd.nextInt(numslist.size());

//		ArrayList<Integer> input = new ArrayList<Integer>();
//		input.add(one);
//		input.add(two);
		// 배열에 랜덤숫자 넣고 리턴
		int[] input = new int[2];
		input[0] = this.one;
		input[1] = this.two;

		return input;
	}

	public void giho() {
		String giho = sc.next();
		if (giho.equals("+")) {
			the(one, two);
		}
		if (giho.equals("-")) {
			bbe(one, two);
		}
		if (giho.equals("*")) {
			goh(one, two);
		}
		if (giho.equals("/")) {
			na(one, two);
		}
	}
	

	public void check(int a, int b) {
		this.one = (Math.max(one, two));
		this.two = (Math.min(one, two));
	}

	public void the(int num, int num2) {
		int dab = one + two;
		System.out.println(one + "+" + two + "= ");
	}

	public int bbe(int num, int num2) {
		check(one, two);
		System.out.println(one + "-" + two + "= ");
		return one - two;
	}

	public int goh(int num, int num2) {
		System.out.println(one + "*" + two + "= ");
		return one * two;
	}

	public int na(int num, int num2) {
		check(one, two);
		System.out.println(one + "/" + two + "= ");
		return one / two;
	}

}
