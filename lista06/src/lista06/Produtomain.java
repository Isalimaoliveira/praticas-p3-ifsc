package lista06;

import java.util.ArrayList;

public class Produtomain {

	public static void main(String[] args) {
		
		
		ArrayList<Desktop>desktops = new ArrayList<>();
		
		Desktop d1 = new Desktop();
		d1.setGamer(false);
		d1.setFabricante(null);
		d1.setGamer(false);
		
		ArrayList<String>pecas = new ArrayList<>();
		pecas.add("Mouse");
		pecas.add("Monitor LG");
		
		d1.setPecas(pecas);
		
		desktops.add(d1);
		
		//..............//
		
		Desktop d2 = new Desktop();
		d2.setCodBarras(10L);
		d2.setFabricante(null);
		d2.setGamer(false);
		
		ArrayList<String>pecas2 = new ArrayList<>();
		pecas2.add("Mouse");
		pecas2.add("Monitor LG");
		
		d2.setPecas(pecas2);
	
		desktops.add(d2);
		
		//..............//
		
		Desktop d3 = new Desktop();
		d3.setCodBarras(999);
		d3.setFabricante(null);
		d3.setGamer(false);
		
		ArrayList<String>pecas3 = new ArrayList<>();
		pecas3.add("Mouse");
		pecas3.add("Monitor LG");
		
		d3.setPecas(pecas3);
		
		for (Desktop obj : desktop) {
			
			System.out.println(obj.getFabricante());
			System.out.println(obj.getCodBarras());
			
			for (String peca : obj.getPecas()) {
				System.out.println(peca);
			}
			
		}
		
		desktops.add(d3);
		
		//..............//
		
		ArrayList<Smartphone>smatphones = new ArrayList<>();
		
		Smartphone s1 = new Smartphone();
		s1.setCodBarras(123);
		s1.setDimensoesTela("null");
		s1.setFabricante(null);
		
		ArrayList<String>smartphone = new ArrayList<>();
		smartphone.add("Mouse");
		smartphone.add("Monitor LG");
		
		
		smatphones.add(s1);
		
		////////////////////////
		
		Smartphone s2 = new Smartphone();
		s2.setCodBarras(123);
		s2.setDimensoesTela("null");
		s2.setFabricante(null);
		
		ArrayList<String>Smartphone = new ArrayList<>();
		smartphone.add("Mouse");
		smartphone.add("Monitor LG");
		
		
		smatphones.add(s2);
		
		//////////////////////////
		
		Smartphone s3 = new Smartphone();
		s3.setCodBarras(123);
		s3.setDimensoesTela("null");
		s3.setFabricante(null);
		
		smartphone.add("Mouse");
		smartphone.add("Monitor LG");
		
		smatphones.add(s3);
		
		/////////////////////////
		
       for (Smartphone obj2 : smartphone) {
			
			System.out.println(obj2.getFabricante());
			System.out.println(obj2.getCodBarras());
			System.out.println(obj2.getdimensoesTela());
			
			for (String smartphone : obje.getsmartphone()) {
				System.out.println(smartphone);
	}
}