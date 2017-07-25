package io.avalia.samba;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

public class CavacoTest {

	  @Test
	  public void thereShouldBeAnIInstrumentInterfaceAndATrumpetClass() {
	    IInstrument cavaco = new Cavaco();
	    assertNotNull(cavaco);
	  }
	  
	  @Test
	  public void itShouldBePossibleToPlayAnInstrument() {
	    IInstrument cavaco = new Cavaco();
	    String sound = cavaco.play();
	    assertNotNull(sound);
	  }
	  
	  @Test
	  public void aCavacoShouldMakePamPam() {
	    IInstrument cavaco = new Cavaco();
	    String sound = cavaco.play();
	    Assert.assertEquals("Mandei meu cavaco chorar", sound);
	  }

	  @Test
	  public void aCavacoShouldBeBrown() {
	    IInstrument cavaco = new Cavaco();
	    String color = cavaco.getColor();
	    Assert.assertEquals("brown", color);
	  }
	
}
