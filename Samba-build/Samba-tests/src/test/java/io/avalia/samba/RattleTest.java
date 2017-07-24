package io.avalia.samba;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class RattleTest {

	@Test
	public void thereShouldBeAnIInstrumentInterfaceAndARattleClass() {
		IInstrument rattle = new Rattle();
		assertNotNull(rattle);
	}

	@Test
	public void aRattleShouldMakeChiqChiq() {
		IInstrument rattle = new Rattle();
		String sound = rattle.play();
		Assert.assertEquals("chiqchiq", sound);
	}

	@Test
	public void aRattleShouldBeBrown() {
		IInstrument rattle = new Rattle();
		String color = rattle.getColor();
		Assert.assertEquals("brown", color);
	}

}
