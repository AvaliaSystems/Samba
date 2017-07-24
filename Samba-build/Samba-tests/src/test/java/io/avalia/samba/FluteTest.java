package io.avalia.samba;

import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;


public class FluteTest {
    
    @Test public void
    the_volume_should_be_3() {

        IInstrument flute = new Flute();
        int volume = flute.getSoundVolume();
        Assert.assertEquals(3, volume);
    }
}
