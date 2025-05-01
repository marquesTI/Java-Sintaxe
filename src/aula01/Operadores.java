package aula01;

public class Operadores {
	public static void main(String[] args) {
		int numero = 5;
		
		//numero = numero + 1;
		
		//System.out.println(numero++); Dessa forma a variável ainda não vai ser atualizada irá retornar 5 ainda, somente quando for chammado novamente;
		
		System.out.println(++ numero); // Utilizando o operador de incremento dessa forma ele irá mostrar a variável já atualizada | O mesmo funciona para decrementador (--)
		
		boolean variavel = true;
		
		System.out.println(!variavel); // O valor original da variável irá continuar sendo TRUE, para transformar em false deve reatribuir a variável
		
		variavel = !variavel;
		
		System.out.println(variavel);
	}
}
