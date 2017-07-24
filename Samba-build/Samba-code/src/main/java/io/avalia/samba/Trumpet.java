package io.avalia.samba;

public class Trumpet implements IInstrument {

  public String play() {
    return "pouet";
  }
  
  public String getColor() {
	return "golden";
  }
  
  public int getSoundVolume() {
	return 1000;
  }
}