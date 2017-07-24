package io.avalia.samba;

public class Trumpet implements IInstrument {

    public String play() {
        return "pouet";
    }

    public int getSoundVolume() {
        return 10;
    }

    public String getColor() {
        return "golden";
    }
}