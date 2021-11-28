package ClassesObjeto3;

public class TesteProduto {
	
		public static void main(String[] args) {
				
			ProdutoEletronico[] produtos = new ProdutoEletronico[3];
			
			produtos[0] = new ProdutoEletronico(1900,"Iphone 7");
			produtos[1] = new ProdutoEletronico(3700,"Nintendo Switch");
			produtos[2] = new ProdutoEletronico(2800,"TV Smart");
			
			for(ProdutoEletronico roda : produtos) {
				roda.ImprimirInfo();
			}
			
			System.out.println("*************************************************************************");
			
			for(ProdutoEletronico roda:produtos) {
				roda.desconto(10);
				roda.ImprimirInfo();
			}
		}
	}