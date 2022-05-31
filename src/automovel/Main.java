package automovel;

public class Main {

	public static void main(String[] args) {
		Esportivo esportivo = new Esportivo();
		System.out.println("Combustível do esportivo: " + esportivo.getCombustivel());
		
		Caminhao caminhao = new Caminhao();
		System.out.println("Combustível do caminhão: " +caminhao.getCombustivel());
		
		
	}

}
