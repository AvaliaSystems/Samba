package io.avalia.samba;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class CaxirolaTest {

	@Test
	public void thereShouldBeAnIInstrumentInterfaceAndACaxirolaClass() {
		IInstrument caxirola = new Caxirola();
		assertNotNull(caxirola);
	}

	@Test
	public void aCaxirolaShouldMakeTchukiTchuki() {
		IInstrument caxirola = new Caxirola();
		String sound = caxirola.play();
		Assert.assertEquals("tchuki tchuki tchuki tchuki", sound);
	}

	@Test
	public void aPandeiroShouldBeLouderThanAPandeiro() {
		IInstrument caxirola = new Caxirola();
		IInstrument pandeiro = new Pandeiro();
		int caxirolaVolume = caxirola.getSoundVolume();
		int pandeiroVolume = pandeiro.getSoundVolume();
		Assert.assertTrue(caxirolaVolume > pandeiroVolume);
	}

	@Test
	public void aPandeiroShouldBeRed() {
		IInstrument caxirola = new Caxirola();
		String color = caxirola.getColor();
		Assert.assertEquals("red", color);
	}

}
