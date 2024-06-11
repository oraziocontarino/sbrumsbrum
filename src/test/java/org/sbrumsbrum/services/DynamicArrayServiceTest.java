package org.sbrumsbrum.services;


import org.junit.jupiter.api.Test;
import org.sbrumsbrum.dto.IntegerDTO;

class DynamicArrayServiceTest {

	@Test
	void calcolo1() {
		DynamicArrayService service = new DynamicArrayService();
		IntegerDTO dto1 = new IntegerDTO(2);
		IntegerDTO dto2 = new IntegerDTO(3);
		IntegerDTO dto3 = new IntegerDTO(8);
		service.esercizio1Array(dto1, dto2, dto3);
	}

}
