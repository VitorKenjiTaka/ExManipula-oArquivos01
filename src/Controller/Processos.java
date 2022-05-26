package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Processos {
	private String path;
	private String nome;
	
	public Processos(String path, String nome) {
		this.nome = nome;
		this.path = path;
	}
	

	public void scam() throws IOException{

		File arq = new File(path, nome);
		if(arq.exists()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader Buffer = new BufferedReader(leitor);
			String linha = Buffer.readLine();
			
			
			String[] header = linha.split(",");
			System.out.println(header[0] + " | \t" + header[1] + " | \t" + header[3]);
			while(linha != null) {
				String[] array = linha.split(",");
				if(array[2].contains("Fruits"))
					System.out.println(array[0] + "\t" + array[1] + "\t" + array[3]);
				linha = Buffer.readLine();
			}
			Buffer.close();
			leitor.close();
			fluxo.close();
		}else {
			throw new IOException("Aquivo inválido");
		}
		
	}

	
	
}
