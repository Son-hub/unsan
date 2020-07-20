package gasan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		Numlist list = new Numlist();
		int[] num = list.numlist();

		int dab = 0;
		String giho = null;

//		System.out.println(list.numlist());

		try {
			System.out.print("기호를 입력: ");
			list.giho();
		} catch (Exception e) {
			System.out.println("기호만 입력하세요");
		}

		for (;;) {
			int i=0;
			if(i>10) {
				list.giho();
			}
			try {
				System.out.println("답을 입력하세요");
				
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요");
			}

		}
//
//		int o = 0;
//		int x = 0;
//
//		if (dab == gungdab) {
//			o++;
//		} else {
//			x++;
//		}
//		System.out.println("맞은 갯수: " + o);
//		System.out.println("틀린 갯수: " + x);
	}

}
