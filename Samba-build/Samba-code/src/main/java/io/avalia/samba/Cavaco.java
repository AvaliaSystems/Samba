package io.avalia.samba;

public class Cavaco implements IInstrument {

	@Override
	public String play() {
		return "Mandei meu cavaco chorar";
	}

	@Override
	public int getSoundVolume() {
		return 6;
	}

	@Override
	public String getColor() {
		return "brown";
	}

}
