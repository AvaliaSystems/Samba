package io.avalia.samba;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class FluteTest {

    @Test public void
    it_should_emit_wiwi() {

        IInstrument flute = new Flute();
        String sound = flute.play();
        Assert.assertEquals("wiwi", sound);

    }

    @Test public void
    it_should_be_white() {

        IInstrument flute = new Flute();
        String color = flute.getColor();
        Assert.assertEquals("white", color);
    }

    @Test public void
    the_volume_should_be_5() {

        IInstrument flute = new Flute();
        int volume = flute.getSoundVolume();
        Assert.assertEquals(5, volume);
    }
}