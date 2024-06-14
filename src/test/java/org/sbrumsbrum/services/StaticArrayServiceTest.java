package org.sbrumsbrum.services;

import org.junit.jupiter.api.Test;
import org.sbrumsbrum.dto.IntegerDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

class StaticArrayServiceTest {

	@Test
	void calcolo1() {
		System.out.println("Stampa tutto l'array: ");
		StaticArrayService stampaTuttoArray = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(2);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaTuttoArray.Esercizio1(dto1, dto2, dto3);;
		System.out.println();

	}

	@Test
	void calcolo2() {
		System.out.println("Stampa solo i numeri pari: ");
		StaticArrayService stampaSoloNumeriPari = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(2);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeriPari.Esercizio2(dto1, dto2, dto3);
		System.out.println();
	}

	@Test
	void calcolo3() {
		System.out.println("Stampa solo i numeri dispari: ");
		StaticArrayService stampaSoloNumeriDispari = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(2);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeriDispari.Esercizio3(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo4() {
		System.out.println("Stampa di solo i numeri pari o dispari: caso pari");
		StaticArrayService stampaSoloNumeriDispariOPari = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(2);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeriDispariOPari.Esercizio4(dto1, dto2, dto3, EvenOddEnum.EVEN);
		System.out.println();
	}
	@Test
	void calcolo5() {
		System.out.println("Stampa di solo i numeri pari o dispari: caso dispari");
		StaticArrayService stampaSoloNumeriDispariOPari = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(1);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeriDispariOPari.Esercizio4(dto1, dto2, dto3, EvenOddEnum.ODD);;
		System.out.println();
	}
	@Test
	void calcolo6() {
		System.out.println("Stampa di tutto l'array, poi solo array pari e infine array dispari: ");
		StaticArrayService stampaSoloNumeri = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(1);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		stampaSoloNumeri.Esercizio5(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo7() {
		System.out.println("Calcola la somma: ");
		StaticArrayService calcolaSomma = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(1);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		calcolaSomma.Esercizio6(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo8() {
		System.out.println("Calcola la media: ");
		StaticArrayService calcolaMedia = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(1);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		calcolaMedia.Esercizio7(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo9() {
		System.out.println("Calcola la media pesata: ");
		StaticArrayService calcolaMediaPesata = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaMediaPesata.Esercizio8(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo10() {
		System.out.println("Calcola il massimo: ");
		StaticArrayService calcolaIlMassimo = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlMassimo.Esercizio9(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo11() {
		System.out.println("Calcola il secondo massimo: ");
		StaticArrayService calcolaIlSecondoMassimo = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlSecondoMassimo.Esercizio10(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo12() {
		System.out.println("Calcola il minimo: ");
		StaticArrayService calcolaIlMinimo = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlMinimo.Esercizio11(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo13() {
		System.out.println("Calcola il secondo minimo: ");
		StaticArrayService calcolaIlSecondoMinimo = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(7);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlSecondoMinimo.Esercizio12(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo14() {
		System.out.println("Calcola quante volte un numero è all'interno dell'array ");
		StaticArrayService calcolaIlNumeroDiVolte = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(3);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(2);
		calcolaIlNumeroDiVolte.Esercizio13(dto1, dto2, dto3, 3);
		System.out.println();
	}
	@Test
	void calcolo15() {
		System.out.println("Array invertito: ");
		StaticArrayService arrayInvertito = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(5);
		IntegerDTO dto3 = new IntegerDTO(2);
		arrayInvertito.Esercizio14(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo16() {
		System.out.println("Dividi array in pari e dispari e poi uniscilo:");
		StaticArrayService dividiEUnisciArray = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(5);
		IntegerDTO dto3 = new IntegerDTO(2);
		dividiEUnisciArray.Esercizio15(dto1, dto2, dto3);
		System.out.println();
	}
	@Test
	void calcolo17() {
		System.out.println("Numeri comuni fra due array:");
		StaticArrayService numeriComuni = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(5);
		IntegerDTO dto3 = new IntegerDTO(2);
		IntegerDTO dto4 = new IntegerDTO(10);
		IntegerDTO dto5 = new IntegerDTO(5);
		IntegerDTO dto6 = new IntegerDTO(3);
		numeriComuni.Esercizio16(dto1, dto2, dto3, dto4, dto5, dto6);
		System.out.println();
	}
	@Test
	void calcolo18() {
		System.out.println("Numeri non comuni fra due array:");
		StaticArrayService numeriNonComuni = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(5);
		IntegerDTO dto3 = new IntegerDTO(2);
		IntegerDTO dto4 = new IntegerDTO(10);
		IntegerDTO dto5 = new IntegerDTO(5);
		IntegerDTO dto6 = new IntegerDTO(3);
		numeriNonComuni.Esercizio17(dto1, dto2, dto3, dto4, dto5, dto6);
		System.out.println();
	}
	@Test
	void calcolo19() {
		System.out.println("Somma arrayList:");
		StaticArrayService sommaArray = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(5);
		IntegerDTO dto3 = new IntegerDTO(2);
		IntegerDTO dto4 = new IntegerDTO(10);
		IntegerDTO dto5 = new IntegerDTO(5);
		IntegerDTO dto6 = new IntegerDTO(3);
		sommaArray.Esercizio18(dto1, dto2, dto3, dto4, dto5, dto6);
		System.out.println();
	}
	@Test
	void calcolo20() {
		System.out.println("Array ordinato tramite bubble sort:");
		StaticArrayService bubbleSort = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(8);
		IntegerDTO dto3 = new IntegerDTO(7);
		IntegerDTO dto4 = new IntegerDTO(5);
		IntegerDTO dto5 = new IntegerDTO(3);
		bubbleSort.Esercizio19(dto1, dto2, dto3, dto4, dto5);
		System.out.println();
	}
	@Test
	void calcolo21() {
		System.out.println("Array ordinato tramite bubble sort e visualizzazione dell'array di input:");
		StaticArrayService bubbleSort = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(8);
		IntegerDTO dto3 = new IntegerDTO(7);
		IntegerDTO dto4 = new IntegerDTO(5);
		IntegerDTO dto5 = new IntegerDTO(3);
		bubbleSort.Esercizio20(dto1, dto2, dto3, dto4, dto5);
		System.out.println();
	}
	@Test
	void calcolo22() {
		System.out.println("Matrice:");
		StaticArrayService matrix = new StaticArrayService();
		IntegerDTO dto1 = new IntegerDTO(10);
		IntegerDTO dto2 = new IntegerDTO(8);
		IntegerDTO dto3 = new IntegerDTO(7);
		IntegerDTO dto4 = new IntegerDTO(5);
		matrix.Esercizio21(dto1, dto2, dto3, dto4);
		System.out.println();
	}

}
