package ClassesObjetos;

public class infocliente {

		public static void main(String[] args) {
				
			cliente = new cliente("Maria Joana da Silva",57,"ela/dela");
			cliente1.imprimirInfoCliente();
			System.out.println("\n***Alteração no Nome Completo***");
			cliente1.setNomeCompleto("Maria Joana da Silva Pereira");
			cliente1.imprimirInfoCliente();
			
			cliente cliente2 = new cliente("Joey Almeida Pascoal",27,"elu/delu");
			cliente2.imprimirInfoCliente();
			System.out.println("\n***Correção idade do cliente***");
			cliente2.setIdade(23);
			cliente2.imprimirInfoCliente();
			
		}

	}
