package org.sbrumsbrum;

import org.sbrumsbrum.dto.InputDTO;
import org.sbrumsbrum.enums.EvenOddEnum;
import org.sbrumsbrum.services.DynamicArrayService;
import org.sbrumsbrum.services.StaticArrayService;

public class Main {
	public static <T> void main(String[] args) {
		System.out.println("Esercizio 1 Array");

		InputDTO<String> dto1 = new InputDTO<String>("Ciao");
		InputDTO<String> dto2 = new InputDTO<String>("come");
		InputDTO<String> dto3 = new InputDTO<String>("stai?");

		StaticArrayService<Object> prova1 = new StaticArrayService<Object>();
		prova1.esercizio1(dto1, dto2, dto3);

		System.out.println();
		System.out.println("Esercizio 1 ArrayList");

		InputDTO<String> dto4 = new InputDTO<String>("Io");
		InputDTO<String> dto5 = new InputDTO<String>("tutto");
		InputDTO<String> dto6 = new InputDTO<String>("bene");

		DynamicArrayService prova2 = new DynamicArrayService();
		prova2.esercizio1Array(dto4, dto5, dto6);

		System.out.println();
		System.out.println("Esercizio 2 Array");

		InputDTO<Integer> dto7 = new InputDTO<Integer>(8);
		InputDTO<Integer> dto8 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto9 = new InputDTO<Integer>(24);

		StaticArrayService<Object> prova3 = new StaticArrayService<Object>();
		prova3.esercizio2(dto7, dto8, dto9);
		;

		System.out.println();
		System.out.println("Esercizio 2 ArrayList");

		InputDTO<Integer> dto10 = new InputDTO<Integer>(8);
		InputDTO<Integer> dto11 = new InputDTO<Integer>(12);
		InputDTO<Integer> dto12 = new InputDTO<Integer>(15);

		DynamicArrayService prova4 = new DynamicArrayService();
		prova4.esercizio2Array(dto10, dto11, dto12);

		System.out.println();
		System.out.println("Esercizio 3 Array");

		InputDTO<Integer> dto13 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto14 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto15 = new InputDTO<Integer>(24);

		StaticArrayService<Object> prova5 = new StaticArrayService<Object>();
		prova5.esercizio3(dto13, dto14, dto15);
		;

		System.out.println();
		System.out.println("Esercizio 3 ArrayList");

		InputDTO<Integer> dto16 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto17 = new InputDTO<Integer>(8);
		InputDTO<Integer> dto18 = new InputDTO<Integer>(9);

		DynamicArrayService prova6 = new DynamicArrayService();
		prova6.esercizio3Array(dto16, dto17, dto18);

		System.out.println();
		System.out.println("Esercizio 4 Array");

		InputDTO<Integer> dto19 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto20 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto21 = new InputDTO<Integer>(24);

		StaticArrayService<Object> prova7 = new StaticArrayService<Object>();
		prova7.esercizio4(dto19, dto20, dto21, EvenOddEnum.EVEN);

		System.out.println();
		System.out.println("Esercizio 4 ArrayList");

		InputDTO<Integer> dto22 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto23 = new InputDTO<Integer>(8);
		InputDTO<Integer> dto24 = new InputDTO<Integer>(9);

		DynamicArrayService prova8 = new DynamicArrayService();
		prova8.esercizio4Array(dto22, dto23, dto24, EvenOddEnum.ODD);

		System.out.println();
		System.out.println("Esercizio 5 Array");

		InputDTO<Integer> dto25 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto26 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto27 = new InputDTO<Integer>(24);

		StaticArrayService<Object> prova9 = new StaticArrayService<Object>();
		prova9.esercizio5(dto25, dto26, dto27);

		System.out.println();
		System.out.println("Esercizio 5 ArrayList");

		InputDTO<Integer> dto28 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto29 = new InputDTO<Integer>(8);
		InputDTO<Integer> dto30 = new InputDTO<Integer>(9);

		DynamicArrayService prova10 = new DynamicArrayService();
		prova10.esercizio5Array(dto28, dto29, dto30);

		System.out.println();
		System.out.println("Esercizio 6 Array");

		InputDTO<Integer> dto31 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto32 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto33 = new InputDTO<Integer>(6);

		StaticArrayService<Object> prova11 = new StaticArrayService<Object>();
		prova11.esercizio6(dto31, dto32, dto33);

		System.out.println();
		System.out.println("Esercizio 6 ArrayList");

		InputDTO<Integer> dto34 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto35 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto36 = new InputDTO<Integer>(6);

		DynamicArrayService prova12 = new DynamicArrayService();
		prova12.esercizio6(dto34, dto35, dto36);

		System.out.println();
		System.out.println("Esercizio 7 Array");

		InputDTO<Integer> dto37 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto38 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto39 = new InputDTO<Integer>(6);

		StaticArrayService<Object> prova13 = new StaticArrayService<Object>();
		prova13.esercizio7(dto37, dto38, dto39);

		System.out.println();
		System.out.println("Esercizio 7 ArrayList");

		InputDTO<Integer> dto40 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto41 = new InputDTO<Integer>(5);
		InputDTO<Integer> dto42 = new InputDTO<Integer>(6);

		DynamicArrayService prova14 = new DynamicArrayService();
		prova14.esercizio7(dto40, dto41, dto42);

		System.out.println();
		System.out.println("Esercizio 8 Array");

		InputDTO<Integer> dto43 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto44 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto45 = new InputDTO<Integer>(2);
		StaticArrayService<Object> prova15 = new StaticArrayService<Object>();
		prova15.esercizio8(dto43, dto44, dto45);

		System.out.println();
		System.out.println("Esercizio 8 ArrayList");

		InputDTO<Integer> dto46 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto47 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto48 = new InputDTO<Integer>(2);
		StaticArrayService<Object> prova16 = new StaticArrayService<Object>();
		prova16.esercizio8(dto46, dto47, dto48);

		System.out.println();
		System.out.println("Esercizio 9 Array");

		InputDTO<Integer> dto49 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto50 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto51 = new InputDTO<Integer>(2);
		StaticArrayService<Object> prova17 = new StaticArrayService<Object>();
		prova17.esercizio9(dto49, dto50, dto51);

		System.out.println();
		System.out.println("Esercizio 9 ArrayList");

		InputDTO<Integer> dto52 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto53 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto54 = new InputDTO<Integer>(2);
		StaticArrayService<Object> prova18 = new StaticArrayService<Object>();
		prova18.esercizio9(dto52, dto53, dto54);
		
		System.out.println();
		System.out.println("Esercizio 10 Array");

		InputDTO<Integer> dto55 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto56 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto57 = new InputDTO<Integer>(2);
		StaticArrayService<Object> prova19 = new StaticArrayService<Object>();
		prova19.esercizio10(dto55, dto56, dto57);

		System.out.println();
		System.out.println("Esercizio 10 ArrayList");

		InputDTO<Integer> dto58 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto59 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto60 = new InputDTO<Integer>(2);
		StaticArrayService<Object> prova20 = new StaticArrayService<Object>();
		prova20.esercizio10(dto58, dto59, dto60);
		
		System.out.println();
		System.out.println("Esercizio 11 Array");

		InputDTO<Integer> dto61 = new InputDTO<Integer>(7);
		InputDTO<Integer> dto62 = new InputDTO<Integer>(3);
		InputDTO<Integer> dto63 = new InputDTO<Integer>(2);
		StaticArrayService<Object> prova21 = new StaticArrayService<Object>();
		prova21.esercizio11(dto61, dto62, dto63);
	}

}
