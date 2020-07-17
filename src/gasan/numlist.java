package gasan;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class numlist {
	
	public ArrayList<Integer> numlist() {
		Random rnd = new Random();
		ArrayList<Integer> numslist = new ArrayList<Integer>();
		for (int i = 1; i < 100; i++) {
			numslist.add(i);
		}
		int one = rnd.nextInt(numslist.size());
		int two = rnd.nextInt(numslist.size());

		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(one);
		input.add(two);
		
		return input;
	}

	public int scI() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}

	public String scS() {
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	
}
