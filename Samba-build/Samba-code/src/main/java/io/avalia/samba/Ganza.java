package io.avalia.samba;

public class Ganza implements IInstrument {

	@Override
	public String play() {
		return "chuki chuki chuki chuki";
	}

	@Override
	public int getSoundVolume() {
		return 7;
	}

	@Override
	public String getColor() {
		return "yellow";
	}

}
