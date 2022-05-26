package View;

import java.io.IOException;

import Controller.Processos;

public class Principal {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\User\\Desktop";
		String nome = "generic_food.csv";
		
		Processos pro = new Processos(path, nome);
		
		try {
			pro.scam();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
