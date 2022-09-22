package by.home.maxzzzit;

import java.util.Scanner;

public class RazloshenieChetirehznathnogoChisla {

	public static void main(String[] args) {
		Scanner vvod = new Scanner(System.in);
		int ed, des, sotni, tisaci, chislo;
		System.out.println("Введите четырехзначное число: ");
		chislo = vvod.nextInt();
		tisaci = chislo / 1000;
		sotni = (chislo % 1000) / 100;
		des = (chislo % 100) / 10;
		ed = chislo % 10;
		System.out.println(chislo + "=" + tisaci * 1000 + "+" + sotni * 100 + "+" + des * 10 + "+" + ed);
	}

}