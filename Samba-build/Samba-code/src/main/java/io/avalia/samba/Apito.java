package io.avalia.samba;

public class Apito implements IInstrument {

    @Override
    public String play() {
        return "pee";
    }

    @Override
    public int getSoundVolume() {
        return 5555;
    }

    @Override
    public String getColor() {
        return "metallic";
    }
}
