package io.avalia.samba;


public class Mandolin  implements IInstrument {

    public String play() {
        return "Pirilim";
    }

    public int getSoundVolume() {
        return 15;
    }

    public String getColor() {
        return "brown";
    }
}