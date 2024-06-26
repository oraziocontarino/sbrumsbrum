package org.sbrumsbrum.services;

import org.sbrumsbrum.dto.IntegerDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

public class StaticArrayService {

	public void Esercizio1(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (IntegerDTO dto : array) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public void Esercizio2(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (IntegerDTO dto : array) {
			if (((Number) dto.getValue()).intValue() % 2 == 0) {

				System.out.print(dto.getValue() + " ");
			}
		}
	}

	public void Esercizio3(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (IntegerDTO dto : array) {
			if (dto.getValue() % 2 == 1) {

				System.out.print(dto.getValue() + " ");
			}
		}
	}

	public void Esercizio4(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, EvenOddEnum evenOdd) {

		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (IntegerDTO dto : array) {
			int temp = dto.getValue();
			if (evenOdd == EvenOddEnum.EVEN && temp % 2 == 0) {
				System.out.println(temp + ": è un numero pari");
			} else if (evenOdd == EvenOddEnum.ODD && temp % 2 != 0) {
				System.out.println(temp + ": è un numero dispari");
			}
		}
	}

	public void Esercizio5(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		IntegerDTO[] arrayEven = new IntegerDTO[3];
		IntegerDTO[] arrayOdd = new IntegerDTO[3];
		int evenIndex = 0;
		int oddIndex = 0;

		for (IntegerDTO dto : array) {
			if (dto.getValue() % 2 == 0) {
				arrayEven[evenIndex++] = dto;
			} else {
				arrayOdd[oddIndex++] = dto;
			}
		}
		System.out.println("Array iniziale: ");
		for (IntegerDTO dto : array) {
			System.out.println(dto.getValue());
		}
		System.out.println("Array pari: ");
		for (int i = 0; i < evenIndex; i++) {
			System.out.println(arrayEven[i]);
		}
		System.out.println("Array dispari: ");
		for (int i = 0; i < oddIndex; i++) {
			System.out.println(arrayOdd[i]);
		}
	}

	public void Esercizio6(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		double sum = 0;
		for (IntegerDTO dto : array) {
			sum += dto.getValue();
		}
		System.out.println("La somma è: " + sum);
	}

	public void Esercizio7(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		double sum = 0;
		for (IntegerDTO dto : array) {
			sum += dto.getValue();
		}
		double average = sum / array.length;
		System.out.println("La media è: " + average);
	}

	public void Esercizio8(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		double sommaDeiNumeri = 0;
		int totaleDeiPesi = 0;

		for (IntegerDTO dto : array) {
			int valore = (int) dto.getValue();
			int peso = (valore % 2 == 0) ? 10 : 5;
			sommaDeiNumeri += valore * peso;
			totaleDeiPesi += peso;
		}
		double mediaPesata = sommaDeiNumeri / totaleDeiPesi;

		System.out.println("La media pesata è: " + mediaPesata);
	}

	public void Esercizio9(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		IntegerDTO maxDto = array[0];
		for (IntegerDTO dto : array) {
			if (dto.getValue() > maxDto.getValue()) {
				maxDto = dto;
			}
		}
		System.out.println("Il valore massimo è: " + maxDto.getValue());
	}

	public void Esercizio10(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		int max = Integer.MAX_VALUE;
		int secondMax = Integer.MAX_VALUE;

		for (IntegerDTO dto : array) {
			int value = dto.getValue();
			if (value < max) {
				secondMax = max;
				max = value;
			} else if (value < secondMax && value != max) {
				secondMax = value;
			}
		}

		System.out.println("Il secondo massimo è:  " + secondMax);
	}

	public void Esercizio11(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		IntegerDTO minDto = array[0];
		for (IntegerDTO dto : array) {
			if (dto.getValue() < minDto.getValue()) {
				minDto = dto;
			}
		}
		System.out.println("Il valore minimo è: " + minDto.getValue());
	}

	public void Esercizio12(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		int small = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (IntegerDTO dto : array) {
			int value = dto.getValue();
			if (value < small) {
				smallest = small;
				small = value;
			} else if (value < smallest && value != small) {
				smallest = value;
			}
		}

		System.out.println("Il secondo minimo è:  " + smallest);
	}

	public void Esercizio13(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, int numberToControl) {
		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		int count = 0;

		for (IntegerDTO dto : array) {
			if (dto.getValue() == numberToControl) {
				count++;
			}
		}
		System.out.println("Il numero da controllare da te inserito è: " + numberToControl + " risulta " + count
				+ " volte all'interno dell'array.");

	}

	public void Esercizio14(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		IntegerDTO[] reversedArray = new IntegerDTO[array.length];
		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - 1 - i];
		}
		System.out.println("Array normale: ");
		for (IntegerDTO dto : array) {
			System.out.print(dto.getValue() + " ");

		}
		System.out.println();
		System.out.println("Array invertito:");
		for (IntegerDTO dto : reversedArray) {

			System.out.print(dto.getValue() + "  ");

		}
	}

	public void Esercizio15(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO[] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		IntegerDTO[] evenArray = new IntegerDTO[array.length];
		IntegerDTO[] oddArray = new IntegerDTO[array.length];
		int evenCount = 0;
		int oddCount = 0;

		for (IntegerDTO dto : array) {
			if (dto.getValue() % 2 == 0) {
				evenArray[evenCount++] = dto;
			} else {
				oddArray[oddCount++] = dto;
			}
		}

		System.out.print("Array pari: ");
		for (int i = 0; i < evenCount; i++) {
			System.out.print(evenArray[i].getValue() + " ");
		}
		System.out.println();

		System.out.print("Array dispari: ");
		for (int i = 0; i < oddCount; i++) {
			System.out.print(oddArray[i].getValue() + " ");
		}
		System.out.println();

		IntegerDTO[] unisciArray = new IntegerDTO[evenCount + oddCount];
		int index = 0;

		for (int i = 0; i < evenCount; i++) {
			unisciArray[index++] = evenArray[i];
		}

		for (int i = 0; i < oddCount; i++) {
			unisciArray[index++] = oddArray[i];
		}
		System.out.print("Array unito: ");
		for (IntegerDTO dto : unisciArray) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public void Esercizio16(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4, IntegerDTO dto5,
			IntegerDTO dto6) {
		IntegerDTO[] array1 = new IntegerDTO[3];
		array1[0] = dto1;
		array1[1] = dto2;
		array1[2] = dto3;

		IntegerDTO[] array2 = new IntegerDTO[3];
		array2[0] = dto4;
		array2[1] = dto5;
		array2[2] = dto6;

		IntegerDTO[] commonElements = new IntegerDTO[3];

		int index = 0;

		for (IntegerDTO element1 : array1) {
			for (IntegerDTO element2 : array2) {
				if (element1.getValue() == element2.getValue()) {

					commonElements[index++] = element1;
				}
			}
		}
		System.out.print("Numeri in comune: ");
		for (int i = 0; i < index; i++) {
			System.out.print(commonElements[i] + " ");
		}
	}

	public void Esercizio17(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4, IntegerDTO dto5,
			IntegerDTO dto6) {
		IntegerDTO[] array1 = new IntegerDTO[3];
		array1[0] = dto1;
		array1[1] = dto2;
		array1[2] = dto3;

		IntegerDTO[] array2 = new IntegerDTO[3];
		array2[0] = dto4;
		array2[1] = dto5;
		array2[2] = dto6;

		IntegerDTO[] notCommonElements = new IntegerDTO[6];

		int index = 0;

		for (int i = 0; i < array1.length; i++) {
			int count = 0;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i].getValue() == array2[j].getValue()) {
					count++;
				}
			}
			if (count == 0) {
				notCommonElements[index++] = array1[i];
			}
		}

		for (int i = 0; i < array2.length; i++) {
			int count = 0;
			for (int j = 0; j < array1.length; j++) {
				if (array2[i].getValue() == array1[j].getValue()) {
					count++;
				}
			}
			if (count == 0) {
				notCommonElements[index++] = array2[i];
			}
		}

		System.out.print("Elementi non comuni: ");
		for (int i = 0; i < index; i++) {
			System.out.print(notCommonElements[i].getValue() + " ");
		}
	}

	public void Esercizio18(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4, IntegerDTO dto5,
			IntegerDTO dto6) {
		IntegerDTO[] array1 = new IntegerDTO[3];
		array1[0] = dto1;
		array1[1] = dto2;
		array1[2] = dto3;

		IntegerDTO[] array2 = new IntegerDTO[3];
		array2[0] = dto4;
		array2[1] = dto5;
		array2[2] = dto6;

		int[] sumArray = new int[3];

		for (int i = 0; i < 3; i++) {
			sumArray[i] = array1[i].getValue() + array2[i].getValue();
		}

		System.out.print("Somma dell'array: ");
		for (int i = 0; i < 3; i++) {
			System.out.print(sumArray[i] + " ");
		}
	}

	public void Esercizio19(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4, IntegerDTO dto5) {
		IntegerDTO[] array = new IntegerDTO[5];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;
		array[3] = dto4;
		array[4] = dto5;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].getValue() > array[j + 1].getValue()) {
					IntegerDTO temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.print("Array con buble sort: ");
		for (IntegerDTO dto : array) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public void Esercizio20(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4, IntegerDTO dto5) {
		IntegerDTO[] array = new IntegerDTO[5];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;
		array[3] = dto4;
		array[4] = dto5;

		IntegerDTO sortedArray[] = new IntegerDTO[5];

		for (int i = 0; i < array.length; i++) {
			sortedArray[i] = array[i];
		}

		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = i + 1; j < sortedArray.length; j++) {
				if (sortedArray[i].getValue() > sortedArray[j].getValue()) {
					IntegerDTO temp = sortedArray[i];
					sortedArray[i] = sortedArray[j];
					sortedArray[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array di input:");
		for (IntegerDTO element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println("Array ordinato con bubble sort:");
		for (IntegerDTO element : sortedArray) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public void Esercizio21(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3, IntegerDTO dto4) {
		IntegerDTO[][] matrice = new IntegerDTO[3][3];

		matrice[0][0] = dto1;
		matrice[0][2] = dto2;
		matrice[2][0] = dto3;
		matrice[2][2] = dto4;


		matrice[1][1] = new IntegerDTO(0);

		matrice[0][1] = new IntegerDTO(-1);
		matrice[1][0] = new IntegerDTO(-1);
		matrice[1][2] = new IntegerDTO(-1);
		matrice[2][1] = new IntegerDTO(-1);

		System.out.println("Matrice:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrice[i][j].getValue() + " | ");
			}
			System.out.println();
		}
	}
}