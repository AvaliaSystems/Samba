package io.avalia.samba;

public class Caxirola implements IInstrument {

	@Override
	public String play() {
		return "tchuki tchuki tchuki tchuki";
	}

	@Override
	public int getSoundVolume() {
		return 8;
	}

	@Override
	public String getColor() {
		return "red";
	}

}
