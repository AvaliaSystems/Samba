package io.avalia.samba;

public class BahianGuitar implements IInstrument {

	@Override
	public String play() {
		return "oh meu rei";
	}

	@Override
	public int getSoundVolume() {
		return 0;
	}

	@Override
	public String getColor() {
		return null;
	}

}
