package io.avalia.samba;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class PandeiroTest {

	  @Test
	  public void thereShouldBeAnIInstrumentInterfaceAndATrumpetClass() {
	    IInstrument pandeiro = new Pandeiro();
	    assertNotNull(pandeiro);
	  }
	  
	  @Test
	  public void itShouldBePossibleToPlayAnInstrument() {
	    IInstrument pandeiro = new Pandeiro();
	    String sound = pandeiro.play();
	    assertNotNull(sound);
	  }
	  
	  @Test
	  public void aPandeiroShouldMakePamPam() {
	    IInstrument pandeiro = new Pandeiro();
	    String sound = pandeiro.play();
	    Assert.assertEquals("pampam", sound);
	  }
	  
	  @Test
	  public void aPandeiroShouldBeLouderThanAFlute() {
	    IInstrument pandeiro = new Pandeiro();
	    IInstrument flute = new Flute();
	    int pandeiroVolume = pandeiro.getSoundVolume();
	    int fluteVolume = flute.getSoundVolume();
	    Assert.assertTrue(pandeiroVolume > fluteVolume);
	  }

	  @Test
	  public void aPandeiroShouldBeWhite() {
	    IInstrument pandeiro = new Pandeiro();
	    String color = pandeiro.getColor();
	    Assert.assertEquals("white", color);
	  }
	
}
