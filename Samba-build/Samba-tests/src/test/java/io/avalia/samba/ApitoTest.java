package io.avalia.samba;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ApitoTest {

    @Test
    public void thereShouldBeAnIInstrumentInterfaceAndAApitoClass() {
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
    public void aApitoShouldMakePee() {
        IInstrument apito = new Apito();
        String sound = apito.play();
        Assert.assertEquals("pee", sound);
    }

    @Test
    public void aApitoShouldBeMetallic() {
        IInstrument apito = new Apito();
        String color = apito.getColor();
        Assert.assertEquals("metallic", color);
    }
}
