package io.avalia.samba;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class GanzaTest {

	@Test
	public void thereShouldBeAnIInstrumentInterfaceAndAGanzaClass() {
		IInstrument ganza = new Ganza();
		assertNotNull(ganza);
	}

	@Test
	public void aGanzaShouldMakeChukiChuki() {
		IInstrument ganza = new Ganza();
		String sound = ganza.play();
		Assert.assertEquals("chuki chuki chuki chuki", sound);
	}

	@Test
	public void aGanzaShouldBeLouderThanAPandeiro() {
		IInstrument ganza = new Ganza();
		IInstrument pandeiro = new Pandeiro();
		int ganzaVolume = ganza.getSoundVolume();
		int pandeiroVolume = pandeiro.getSoundVolume();
		Assert.assertTrue(ganzaVolume > pandeiroVolume);
	}

	@Test
	public void aGanzaShouldBeYellow() {
		IInstrument ganza = new Ganza();
		String color = ganza.getColor();
		Assert.assertEquals("yellow", color);
	}

}
