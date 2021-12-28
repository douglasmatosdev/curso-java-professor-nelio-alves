package secao_03.triangle; // pacote da classe

/**
 * 
 * @author douglas
 *
 *	Discussão
 *
 *	Quais são os benefícios de se calcular a área de um triângulo 
 *	por meio de um MÉTODO dentro da CLASSE Triangle?
 *
 *	1) Reaproveitamento de código: nós eliminamos o código repetido
 *	(cálculo das áreas dos triângulos x e y) no programa principal.
 *
 *	2) Delegação de responsabilidades: quem deve ser responsável por
 *	saber como calcular a área de um triângulo é o próprio triângulo.
 *	A lógica do cálculo da área não deve estar em outro lugar.
 *
 */

public class Triangle {

	/*
	 * Nota 1.1 : O prefixo "public" indica que o atributo ou método pode ser usado
	 * em outros arquivos
	 */

	/**
	 * Nota 2.1 : Tipo do dado que o método retorna (se o método não retorna nada
	 * usa-se a palavra "void")
	 */

	// Nota 2.2 : Nome do método

	// Nota 2.3 : Lista de parâmetros do método

	public /* Nota 1.1 */ double a; // atributos da classe
	public /* Nota 1.1 */ double b; // atributos da classe
	public /* Nota 1.1 */ double c; // atributos da classe

	public /* Nota 1.1 */ double /* Nota 2.1 */ area/* Nota 2.2 */()/* Nota 2.3 */ {
		// Corpo do método
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
