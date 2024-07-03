package ifsc;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Tutor Dani = new Tutor();
		Dani.setNomeCompleto("Daniela");
		
		Gato Lua = new Gato();
		Lua.setApelido("Lu");
		Lua.setClasse("Mamífero");
		Lua.setNomeCientifico("felis catus");
		Lua.setPedigree("SRD");
		Dani.setGato("Lua");
		
		
		Tutor Isa = new Tutor();
		Isa.setNomeCompleto("Isabelle");
		
		Gato Milk = new Gato();
		Milk.setApelido("Mil");
		Milk.setClasse("Mamífero");
		Milk.setNomeCientifico("felis catus");
		Milk.setPedigree("SRD");
		Isa.setGato("Milk");
		
		
		Tutor Davi = new Tutor();
		Davi.setNomeCompleto("Davi");
		
		Gato Arya = new Gato();
	    Arya.setApelido("Ary");
		Arya.setClasse("Mamífero");
		Arya.setNomeCientifico("felis catus");
		Arya.setPedigree("SRD");
		Davi.setGato("Arya");
		
		ArrayList<Tutor> tutores = new ArrayList<>();
		tutores.add(Dani);
		tutores.add(Isa);
		tutores.add(Davi);
		
		
		for (Tutor tutor : tutores ) {
			System.out.println(tutor.getNomeCompleto());
			System.out.println(tutor.getapelido());
			System.out.println(tutor.getClass());
			System.out.println(tutor.getpedrigree());
			
		}
	}
}
