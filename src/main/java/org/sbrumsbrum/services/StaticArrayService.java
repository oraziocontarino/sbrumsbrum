package org.sbrumsbrum.services;

import org.sbrumsbrum.dto.IntegerDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

public class StaticArrayService {

	public void esercizio1(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO [] array = new IntegerDTO [3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (IntegerDTO dto : array) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public void esercizio2(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO [] array = new IntegerDTO [3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (IntegerDTO dto : array) {
			if (((Number) dto.getValue()).intValue() % 2 == 0) {

				System.out.print(dto.getValue() + " ");
			}
		}
	}

	public void esercizio3(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO [] array = new IntegerDTO [3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (IntegerDTO dto : array) {
			if (dto.getValue() % 2 == 1) {

				System.out.print(dto.getValue() + " ");
			}
		}
	}

	public void esercizio4(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3,
			EvenOddEnum evenOdd) {

		IntegerDTO [] array = new IntegerDTO[3];
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

	public void esercizio5(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO [] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		IntegerDTO[] arrayEven = new IntegerDTO[3];
		IntegerDTO[] arrayOdd = new IntegerDTO[3];
		int evenIndex = 0;
		int oddIndex = 0;

		for (IntegerDTO dto : array) {
			if ( dto.getValue() % 2 == 0) {
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

	public void esercizio6(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

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

	public void esercizio7(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {

		IntegerDTO[] array = new IntegerDTO [3];
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

	public void esercizio8(IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
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
	
	public void esercizio9 (IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO [] array = new IntegerDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		IntegerDTO maxDto = array[0];
        for (IntegerDTO dto : array) {
            if (dto.getValue()>maxDto.getValue()) {
                maxDto = dto;
            }
        }
        System.out.println("Il valore massimo è: " + maxDto.getValue());
    }
	public void esercizio10 (IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO [] array = new IntegerDTO[3];
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
	
	public void esercizio11 (IntegerDTO dto1, IntegerDTO dto2, IntegerDTO dto3) {
		IntegerDTO [] array = new IntegerDTO [3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;
		
		int small = Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (IntegerDTO  dto : array) {
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
	
	
}
