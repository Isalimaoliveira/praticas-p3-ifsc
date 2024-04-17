package lista06;

import java.util.ArrayList;

public class Desktop extends Produto{

	private boolean Gamer;
	private ArrayList<String> Pecas;
	
	public boolean isGamer() {
		return Gamer;
	}
	public void setGamer(boolean gamer) {
		Gamer = gamer;
	}
	public ArrayList<String> getPecas() {
		return Pecas;
	}
	public void setPecas(ArrayList<String> pecas) {
		Pecas = pecas;
	}
	

	
	
}