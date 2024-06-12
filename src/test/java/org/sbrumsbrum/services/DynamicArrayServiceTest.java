package org.sbrumsbrum.services;

import org.junit.jupiter.api.Test;
import org.sbrumsbrum.dto.IntegerDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

class DynamicArrayServiceTest {

	@Test
	void calcolo1() {
		System.out.println("Stampa tutto l'array: ");
		DynamicArrayService stampaTuttoArray = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(2);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaTuttoArray.Esercizio1Array(dto1, dto2, dto3);
		System.out.println();

	}

	@Test
	void calcolo2() {
		System.out.println("Stampa solo i numeri pari: ");
		DynamicArrayService stampaSoloNumeriPari = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(2);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeriPari.Esercizio2Array(dto1, dto2, dto3);
		System.out.println();
	}

	@Test
	void calcolo3() {
		System.out.println("Stampa solo i numeri dispari: ");
		DynamicArrayService stampaSoloNumeriDispari = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(2);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeriDispari.Esercizio3Array(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo4() {
		System.out.println("Stampa di solo i numeri pari o dispari: caso pari");
		DynamicArrayService stampaSoloNumeriDispariOPari = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(2);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeriDispariOPari.Esercizio4Array(dto1, dto2, dto3, EvenOddEnum.EVEN);
		System.out.println();
	}
	@Test
	void calcolo5() {
		System.out.println("Stampa di solo i numeri pari o dispari: caso dispari");
		DynamicArrayService stampaSoloNumeriDispariOPari = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(1);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeriDispariOPari.Esercizio4Array(dto1, dto2, dto3, EvenOddEnum.ODD);
		System.out.println();
	}
	@Test
	void calcolo6() {
		System.out.println("Stampa di tutto l'array, poi solo array pari e infine array dispari: ");
		DynamicArrayService stampaSoloNumeri = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(1);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeri.Esercizio5Array(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo7() {
		System.out.println("Calcola la somma: ");
		DynamicArrayService calcolaSomma = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(1);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		calcolaSomma.Esercizio6ArrayList(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo8() {
		System.out.println("Calcola la media: ");
		DynamicArrayService calcolaMedia = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(1);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		calcolaMedia.Esercizio7ArrayList(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo9() {
		System.out.println("Calcola la media pesata: ");
		DynamicArrayService calcolaMediaPesata = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaMediaPesata.Esercizio8ArrayList(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo10() {
		System.out.println("Calcola il massimo: ");
		DynamicArrayService calcolaIlMassimo = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlMassimo.Esercizio9ArrayList(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo11() {
		System.out.println("Calcola il secondo massimo: ");
		DynamicArrayService calcolaIlSecondoMassimo = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlSecondoMassimo.Esercizio10ArrayList(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo12() {
		System.out.println("Calcola il minimo: ");
		DynamicArrayService calcolaIlMinimo = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlMinimo.Esercizio11ArrayList(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo13() {
		System.out.println("Calcola il secondo minimo: ");
		DynamicArrayService calcolaIlSecondoMinimo = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlSecondoMinimo.Esercizio12ArrayList(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo14() {
		System.out.println("Calcola quante volte un numero è all'interno dell'array ");
		DynamicArrayService calcolaIlNumeroDiVolte = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(3);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlNumeroDiVolte.Esercizio13ArrayList(dto1, dto2, dto3, 3);
		System.out.println();
	}
	@Test
	void calcolo15() {
		System.out.println("Inverti array:");
		DynamicArrayService invertiArray = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(5);
		IntegerDTO dto3 = new IntegerDTO(2);
		invertiArray.Esercizio14ArrayList(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo16() {
		System.out.println("Dividi array in pari e dispari e poi uniscilo:");
		DynamicArrayService dividiEUnisciArray = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(5);
		IntegerDTO dto3 = new IntegerDTO(2);
		dividiEUnisciArray.Esercizio15ArrayList(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo17() {
		System.out.println("Numeri comuni fra due array:");
		DynamicArrayService numeriComuni = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(5);
		IntegerDTO dto3 = new IntegerDTO(2);
		IntegerDTO dto4 = new IntegerDTO(10);
		IntegerDTO dto5 = new IntegerDTO(5);
		IntegerDTO dto6 = new IntegerDTO(3);
		numeriComuni.Esercizio16ArrayList(dto1, dto2, dto3, dto4, dto5, dto6);
		System.out.println();
	}
}
