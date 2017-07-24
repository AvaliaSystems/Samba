package io.avalia.samba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BahianGuitarTest {

	@Test
	public void thereShouldBeAnIInstrumentInterfaceAndABahianGuitarClass() {
		IInstrument bahianGuitar = new BahianGuitar();
		assertNotNull(bahianGuitar);
	}
	
	@Test
	public void itShouldBePossibleToPlayABahianGuitar() {
		IInstrument bahianGuitar = new BahianGuitar();
		String sound = bahianGuitar.play();
		assertNotNull(sound);
	}
	
	@Test 
	public void aBahianGuitarShouldMakeOhMeuRei(){
		IInstrument bahianGuitar = new BahianGuitar();
		String sound = bahianGuitar.play();
		assertEquals("oh meu rei", sound);
	}
}
