package com.reddy.learn.june;

import java.util.concurrent.ThreadLocalRandom;

public class LicencePlate {

	public static void main(String[] args) {

		// misc();
		licensePlateRandomGenerator();
		licensePlateRandomGeneratorUsingThreadLocal();
	}

	public static void licensePlateRandomGenerator() {
		// ASCII
		// A-Z 65-90
		// a-z 97-122
		// 0-9 48-57
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			char ch = (char) (Math.random() * 26 + 'A');
			s.append(ch);
		}
		for (int i = 0; i < 4; i++) {
			char digit1 = (char) (Math.random() * 10 + '0');
			s.append(digit1);
		}
		System.out.println("Random vehicle plate number: " + s);
	}

	public static void licensePlateRandomGeneratorUsingThreadLocal() {
		// ASCII
		// A-Z 65-90
		// a-z 97-122
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			// char ch = (char) (Math.random() * 26 + 'A');
			char ch = (char) (ThreadLocalRandom.current().nextInt(65, 91)); // 65 inclusive 91 exculsive
			s.append(ch);
		}
		for (int i = 0; i < 4; i++) {
			int randInt = ThreadLocalRandom.current().nextInt(0, 10); // 0 inclusive 10 exculsive
			char charDIgit = (char) (randInt + '0');
			s.append(charDIgit);
		}
		System.out.println("Random vehicle plate number: " + s);
	}

	public static void misc() {

		char ch = (char) ('A' + 1);
		int chInt = (int) ('A' + 1);
		System.out.println(ch);
		System.out.println(chInt);
		System.out.println(
				"------------------------------------------------------------------------------------------------");
		for (int i = 0; i < 10; i++) {
			// char chA = (char) (Math.random() * 26 + 'A');
			// System.out.println( (Math.random() * 26 + 'A'));
			// System.out.println((char)84.11466346206845);
			// System.out.println((int)'T');
			// char randChar = (char)(ThreadLocalRandom.current().nextInt(65 , 91)); // 65
			// inclusive 91 exculsive
			// int randInt = (char)(ThreadLocalRandom.current().nextInt(0 , 10)); // 0
			// inclusive 10 exculsive
			// System.out.println(randChar);
			// System.out.println(randInt);

			int randInt = (ThreadLocalRandom.current().nextInt(0, 10)); // 0 inclusive 10 exculsive
			System.out.println(randInt);
			System.out.println(randInt + '0');
			System.out.println("----------------------------");

		}

	}

}
