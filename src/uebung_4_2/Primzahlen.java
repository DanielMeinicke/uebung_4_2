package uebung_4_2;

public class Primzahlen {

	public static boolean isPrimzahlen(int testzahl) {

		int n = testzahl - 1;
		int loesung1;
		boolean isPrimzahl;

		do {
			loesung1 = testzahl % n;
			n = n - 1;
		} while (n > 1 && loesung1 != 0);

		if (loesung1 != 0) {
			isPrimzahl = true;
		} else {
			isPrimzahl = false;
		}

		return isPrimzahl;

	}

	public static void main(String[] args) {
		int von = 1, bis = 1000;
		int anzahlPrimzahlen;
		
		while (bis <= 10000) {
			anzahlPrimzahlen = ermittelteAnzahlPrimzahlen(von, bis);
			System.out.println(anzahlPrimzahlen);
			von = von + 1000;
			bis = bis + 1000;
		}
		

	}

	public static int ermittelteAnzahlPrimzahlen(int von, int bis) {
		int zahlen = von;
		int ermittelteAnzahlenPrimzahlen = 0;

		do {
			zahlen = zahlen + 1;
			if (isPrimzahlen(zahlen) == true) {
				ermittelteAnzahlenPrimzahlen = ermittelteAnzahlenPrimzahlen + 1;
			}
		} while (zahlen > von && zahlen <= bis);

		return ermittelteAnzahlenPrimzahlen;
	}
}
