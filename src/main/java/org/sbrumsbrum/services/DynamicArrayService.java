package org.sbrumsbrum.services;

import java.util.ArrayList;
import java.util.List;
import org.sbrumsbrum.dto.InputDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

public class DynamicArrayService {

	public <T> void esercizio1Array(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		for (InputDTO<T> dto : list) {

			System.out.print(dto.getValue() + " ");

		}
	}

	public <T extends Number> void esercizio2Array(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		for (InputDTO<T> dto : list) {
			if (dto.getValue().intValue() % 2 == 0) {
				System.out.print(dto.getValue() + " ");
			}
		}

	}

	public <T extends Number> void esercizio3Array(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		for (InputDTO<T> dto : list) {
			if (dto.getValue().intValue() % 2 == 1) {
				System.out.print(dto.getValue() + " ");
			}

		}
	}
	
	public <T extends Number> void esercizio4Array(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3, EvenOddEnum evenOdd) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		for (InputDTO<T> dto : list) {
			int temp = dto.getValue().intValue();
			if (evenOdd == EvenOddEnum.EVEN && temp % 2 == 0) {
				System.out.println(temp + ": è un numero pari");
			} else if (evenOdd == EvenOddEnum.ODD && temp % 2 != 0) {
				System.out.println(temp + ": è un numero dispari");
			}
		}
	}
	//TODO: esercizio 5
	
	public <T extends Number> void esercizio6 (InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		double sum = 0;
		for (InputDTO<T> dto : list) {
			sum = sum+ dto.getValue().doubleValue();
		}
		System.out.println("La somma è: "+ sum);
	}
	
	public <T extends Number> void esercizio7 (InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		double sum = 0;
		for (InputDTO<T> dto : list) {
			sum = sum+ dto.getValue().doubleValue();
		}
		double avg = sum / list.size();
		System.out.println("La media è: "+ avg);
	}
}