package gasan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import op.*;

public class total {

	public static void main(String[] args) {
		thehagi thehagi = new thehagi();
		bagi bagi = new bagi();
		goh goh = new goh();
		nanum nanum = new nanum();
		numlist list = new numlist();
		ArrayList<Integer> num = list.numlist();

		int gungdab = 0;
		int dab = 0;
		String giho = null;

		System.out.println(list.numlist());

		try {
			System.out.print("기호를 입력: ");
			giho = list.scS();
		} catch (Exception e) {
			System.out.println("기호만 입력하세요");
		}

		if (giho.equals("+")) {
			System.out.println(num.get(0) + "+" + num.get(1));
			gungdab = thehagi.thehagi(num.get(0), num.get(1));
		}
		if (giho.equals("-")) {
			System.out.println(num.get(0) + "-" + num.get(1));
			gungdab = bagi.bagi(num.get(0), num.get(1));
		}
		if (giho.equals("*")) {
			System.out.println(num.get(0) + "*" + num.get(1));
			gungdab = goh.goh(num.get(0), num.get(1));
		}
		if (giho.equals("/")) {
			System.out.println(num.get(0) + "/" + num.get(1));
			gungdab = nanum.nanum(num.get(0), num.get(1));
		}

		for (;;) {
			try {
				dab = list.scI();
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
			}

		}

		int o = 0;
		int x = 0;

		if (dab == gungdab) {
			o++;
		} else {
			x++;
		}
		System.out.println("맞은 갯수: " + o);
		System.out.println("틀린 갯수: " + x);
	}

}
