package TREINANDO;

	public class Pessoa {
		private String nome;
		private String endereco;
		private String telefone;
		
		public Pessoa (String nome2, String endereco2, String telefone2) {
			
			nome = nome2;
			endereco = endereco2;
			telefone = telefone2;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public void imprimirInfo() {
			System.out.println("NOME: "+nome+"\nENDEREÇO: "+endereco+"\nTELEFONE: "+telefone);
		}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	