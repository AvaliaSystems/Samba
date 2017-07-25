package io.avalia.samba;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class AfoxeTest {

	  @Test
	  public void thereShouldBeAnIInstrumentInterfaceAndAAfoxeClass() {
	    IInstrument afoxe = new Afoxe();
	    assertNotNull(afoxe);
	  }
	  
	  @Test
	  public void itShouldBePossibleToPlayAnInstrument() {
	    IInstrument afoxe = new Afoxe();
	    String sound = afoxe.play();
	    assertNotNull(sound);
	  }
	  
	  @Test
	  public void aAfoxeShouldMakePamPam() {
	    IInstrument afoxe = new Afoxe();
	    String sound = afoxe.play();
	    Assert.assertEquals("xiq-xiq", sound);
	  }

	  @Test
	  public void aAfoxeShouldBeRedAndGreen() {
	    IInstrument afoxe = new Afoxe();
	    String color = afoxe.getColor();
	    Assert.assertEquals("Red and Green", color);
	  }
	
}
