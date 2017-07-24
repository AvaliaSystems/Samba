package io.avalia.samba;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class ApitoTest {

  @Test
  public void thereShouldBeAnIInstrumentInterfaceAndApitoClass() {
    IInstrument apito = new Apito();
    assertNotNull(apito);
  }
  
  @Test
  public void itShouldBePossibleToPlayAnInstrument() {
    IInstrument apito = new Apito();
    String sound = apito.play();
    assertNotNull(sound);
  }
  
  @Test
  public void aApitoShouldMake_piiiiiiii() {
    IInstrument apito = new Apito();
    String sound = apito.play();
    Assert.assertEquals("piiiiiiii", sound);
  }
 
}
