import java.io.BufferedReader;
import java.io.Console;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Principal {
	static Parse p;
	static BufferedReader arquivo;
	
	static void lerCaminho(){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  	
		String file = "";
		try{
			do{
				String caminho = "C:\\Users\\netto\\git\\Compilador\\src\\tabuada.L";
				System.out.print("Compilando... ");
				file = caminho;
			
				
			}while(file.length() == 0);
			
			arquivo = new BufferedReader(new FileReader(file));
		}catch (Exception e) {
			System.err.println("Arquivo n�o encontrado \n");
			lerCaminho();
		}
	}
	void compilar() {
		
		try{
			lerCaminho();
			p = new Parse(arquivo);
			p.S();
			System.out.println("Finalizado - sem erros. \n");
		}catch (Exception e) {
			System.err.println("Erro: \n" + e.getMessage());
			
		}
	}
	public static void main(String[] args) throws Exception{
		try{
			lerCaminho();
			p = new Parse(arquivo);
			p.S();
			System.out.println("Finalizado - sem erros. \n");
		}catch (Exception e) {
			System.err.println("Erro: \n" + e.getMessage());
			
		}
	}
	
	
}
