package io.avalia.samba;

public class Afoxe implements IInstrument {

	@Override
	public String play() {
		return "xiq-xiq";
	}

	@Override
	public int getSoundVolume() {
		return 6;
	}

	@Override
	public String getColor() {
		return "Red and Green";
	}

}
