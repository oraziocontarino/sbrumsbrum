package org.sbrumsbrum.services;

import org.sbrumsbrum.dto.InputDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

public class StaticArrayService<T> {

	public <T> void esercizio1(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {

		InputDTO[] array = new InputDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (InputDTO<T> dto : array) {
			System.out.print(dto.getValue() + " ");
		}
	}

	public <T extends Number> void esercizio2(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {

		InputDTO[] array = new InputDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (InputDTO<T> dto : array) {
			if (dto.getValue().intValue() % 2 == 0) {

				System.out.print(dto.getValue() + " ");
			}
		}
	}

	public <T extends Number> void esercizio3(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {

		InputDTO[] array = new InputDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (InputDTO<T> dto : array) {
			if (dto.getValue().intValue() % 2 == 1) {

				System.out.print(dto.getValue() + " ");
			}
		}
	}

	public <T extends Number> void esercizio4(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3,
			EvenOddEnum evenOdd) {

		InputDTO[] array = new InputDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		for (InputDTO<T> dto : array) {
			int temp = dto.getValue().intValue();
			if (evenOdd == EvenOddEnum.EVEN && temp % 2 == 0) {
				System.out.println(temp + ": è un numero pari");
			} else if (evenOdd == EvenOddEnum.ODD && temp % 2 != 0) {
				System.out.println(temp + ": è un numero dispari");
			}
		}
	}

	// TODO : ESERCIZIO 5
	public <T extends Number> void esercizio6(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {

		InputDTO<T>[] array = new InputDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		double sum = 0;
		for (InputDTO<T> dto : array) {
			sum += dto.getValue().doubleValue();
		}
		System.out.println("La somma è: " + sum);
	}

	public <T extends Number> void esercizio7(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {

		InputDTO<T>[] array = new InputDTO[3];
		array[0] = dto1;
		array[1] = dto2;
		array[2] = dto3;

		double sum = 0;
		for (InputDTO<T> dto : array) {
			sum += dto.getValue().doubleValue();
		}
		double average = sum / array.length;
		System.out.println("La media è: " + average);
	}

}
