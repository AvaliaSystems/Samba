package io.avalia.samba;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class BanjoTest {

  @Test
  public void thereShouldBeAnIInstrumentInterfaceAndABanjoClass() {
    IInstrument banjo = new Banjo();
    assertNotNull(banjo);
  }
  
  @Test
  public void itShouldBePossibleToPlayAnInstrument() {
    IInstrument banjo = new Banjo();
    String sound = banjo.play();
    assertNotNull(sound);
  }
  
  @Test
  public void aBanjoShouldMakePouet() {
    IInstrument banjo = new Banjo();
    String sound = banjo.play();
    Assert.assertEquals("dumdum", sound);
  }

  @Test
  public void shouldHaveAMediumSoundVolume() {
    IInstrument banjo = new Banjo();
    int soundVolume = banjo.getSoundVolume();
    Assert.assertEquals(500, soundVolume);
  }
  
    @Test
  public void shouldHaveWhiteColor() {
    IInstrument banjo = new Banjo();
    String color = banjo.getColor();
    Assert.assertEquals("white", color);
  }
  
  
}
