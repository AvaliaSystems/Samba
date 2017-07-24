package io.avalia.samba;

public class Trumpet implements IInstrument{

	@Override
	public String play() {
		return "pouet";
	}

	@Override
	public int getSoundVolume() {
		return 10;
	}

	@Override
	public String getColor() {
		return "golden";
	}

}
