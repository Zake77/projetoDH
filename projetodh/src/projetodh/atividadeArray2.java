package projetodh;

public class atividadeArray2 {

	public static void main(String[] args) {
		
		String[] esportes = new String[3];
		
		esportes[0] = "Futebol";
		esportes[1] = "Nata��o";
		esportes[2] = "Basquete";
		
		for (int i = 0; i < esportes.length; i++) {
			System.out.println("Categoria: " + esportes[i] + " - Posi��o " + i);
			
		}

	}

}
