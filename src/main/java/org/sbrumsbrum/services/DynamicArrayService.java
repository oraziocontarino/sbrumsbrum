package org.sbrumsbrum.services;

import java.util.ArrayList;
import java.util.List;
import org.sbrumsbrum.dto.InputDTO;
import org.sbrumsbrum.enums.EvenOddEnum;

public class DynamicArrayService  {

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

	public <T extends Number> void esercizio4Array(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3,
			EvenOddEnum evenOdd) {
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

	public <T extends Number> void esercizio5Array(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		List<InputDTO<T>> evenList = new ArrayList<>();
		List<InputDTO<T>> oddList = new ArrayList<>();

		for (InputDTO<T> dto : list) {
			if (dto.getValue().intValue() % 2 == 0) {
				evenList.add(dto);
			} else {
				oddList.add(dto);
			}
		}
		System.out.println("Array iniziale: ");
		for (InputDTO<T> dto : list) {
			System.out.println(dto.getValue());
		}
		System.out.println("Array pari: ");
		for (InputDTO<T> dto : evenList) {
			System.out.println(dto.getValue());
		}
		System.out.println("Array dispari: ");
		for (InputDTO<T> dto : oddList) {
			System.out.println(dto.getValue());
		}
	}

	public <T extends Number> void esercizio6(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		double sum = 0;
		for (InputDTO<T> dto : list) {
			sum = sum + dto.getValue().doubleValue();
		}
		System.out.println("La somma è: " + sum);
	}

	public <T extends Number> void esercizio7(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		double sum = 0;
		for (InputDTO<T> dto : list) {
			sum = sum + dto.getValue().doubleValue();
		}
		double avg = sum / list.size();
		System.out.println("La media è: " + avg);
	}

	public <T extends Number> void esercizio8(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		double sommaDeiNumeri = 0;
		int totaleDeiPesi = 0;

		for (InputDTO<?> dto : list) {
			int valore = (int) dto.getValue();
			int peso = (valore % 2 == 0) ? 10 : 5;
			sommaDeiNumeri += valore * peso;
			totaleDeiPesi += peso;
		}
		double mediaPesata = sommaDeiNumeri / totaleDeiPesi;

		System.out.println("La media pesata è: " + mediaPesata);
	}

	public <T extends Number> void esercizio9(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		Integer maxDto = (Integer) list.get(0).getValue();
		for (InputDTO<T> dto : list) {
			if ((int)dto.getValue() > maxDto) {
				maxDto = (Integer) dto.getValue();
			}
		}
		System.out.println("Il valore massimo è: " + maxDto);
	}
	public <T extends Number> void esercizio10(InputDTO<T> dto1, InputDTO<T> dto2, InputDTO<T> dto3) {
		List<InputDTO<T>> list = new ArrayList<>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);

		Integer minDto = (Integer) list.get(0).getValue();
		for (InputDTO<T> dto : list) {
			if ((int)dto.getValue() < minDto) {
				minDto = (Integer) dto.getValue();
			}
		}
		System.out.println("Il valore minimo è: " + minDto);
	}
}