package secao_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramTypeList {

	public static void run() {

		// O tipo List é uma interface e não pode ser instânciada.
		// Devemos instânciar outra classe que implementa a interface List:
		// Ex.: ArrayList, LinkedList, etc.

		// ERRADO!!!
		// List x = new List();

		/*
		 * O tipo List não aceita tipos primitivos, somente Wrapper Class: Ex.: Integer,
		 * String, Boolean, etc.. Escolhemos a classe ArrayList pois ela é um tipo mais
		 * otimizado, Pois uma lista não é otimizada sempre temos que percorrer toda a
		 * lista para pegarmos um valor, o ArrayList é uma mistura de lista com vetor, e
		 * por isso é mais otimizado e por isso escolhemos esta classe.
		 */
		List<String> list = new ArrayList<>(); // A lista começa vazia.

		// Adicionando valores sobre demanda
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		show(list);

		// Adicionando valor em uma posição específica da lista
		list.add(2, "Marco");
		System.out.println("Marco --> foi adicionado a lista na posição 2");

		show(list);

		// Obtendo o tamanho da lista (no vetor é o length)
		System.out.println("Tamanho da lista: " + list.size());

		System.out.println();
		// Removendo elementos pelo valor
		list.remove("Anna");
		System.out.println("Anna --> foi removida da lista");

		show(list);

		System.out.println("Removendo elementos usando predicado");
		System.out.println("Vamos remover todos os elementos que comece com a letra \"M\":");
		list.removeIf(str -> str.charAt(0) == 'M'); // Função Lambda

		show(list);

		System.out.println("Pegando indice de um elemento pelo valor");
		System.out.print("Indice do Bob: " + list.indexOf("Bob"));
		System.out.println("Tentando buscar por um elemento que não existe na lista");
		System.out.print("Indice do Marco: " + list.indexOf("Marco")); // -1
		System.out.println("\n");
		
		// Adicionando valor em uma posição específica da lista
		list.add("Anna");
		System.out.println("Anna --> foi adicionado a lista");

		System.out.println();
		System.out.println("Filtrando por elementos que comecem com a letra \"A\":");
		List<String> filteredList = list.stream().filter(str -> str.charAt(0) == 'A').collect(Collectors.toList());
		
		show(filteredList);
		
		System.out.println("\nBuscando o PRIMEIRO elemento que atenda ao predicado:");
		System.out.println("Buscando o primeiro elemento que começa com a letra \"A\"");
		String name = list.stream().filter(str -> str.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
		show(list);

	}

	private static void show(List<String> l) {
		System.out.println("-------------------");
		System.out.println("IMPRIMINDO A LISTA:");
		for (String x : l) {
			System.out.println(x);
		}
		System.out.println("-------------------");
	}
}
