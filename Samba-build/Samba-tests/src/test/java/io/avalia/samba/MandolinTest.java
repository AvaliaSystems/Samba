package io.avalia.samba;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class MandolinTest {

    @Test public void
    it_should_be_possible_to_play_the_mandolin() {
        
        IInstrument mandolin = new Mandolin();
        String sound = mandolin.play();
        assertNotNull(sound);

    }

    @Test public void
    it_should_emit_the_sound_pirilim() {

        IInstrument mandolin = new Mandolin();
        String sound = mandolin.play();
        Assert.assertEquals("Pirilim", sound);
    }

    @Test public void
    it_should_be_color_brown() {

        IInstrument mandolin = new Mandolin();
        String color = mandolin.getColor();
        Assert.assertEquals("brown", color);
    }

    @Test public void 
    volume_should_be_15() {

        IInstrument mandolin = new Mandolin();
        int volume = mandolin.getSoundVolume();
        Assert.assertEquals(15, volume);
    }

}