package aula01;

public class MinhaClasse {
    public static void main(String[] args) {
    	String primeiroNome = "Gustavo";
    	String segundoNome = "Pika de Ferro";
    	String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    	int idade = 18;
    	
    	System.out.println(idade);
    	
    	idade = 19;
    	
    	System.out.println(idade);
    }
    
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
