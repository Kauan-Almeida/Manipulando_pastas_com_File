package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine(); // Onde vai ficar o aquivo.
		
		File path =  new File(strPath); // Caminho do arquivo recebendo o "strPath" como argumento.
		
		File[] folders = path.listFiles(File::isDirectory); // Vetor para lista dos folders(pastas). isDirectory = especifica p/ listar so diretorios(pastas). 
		System.out.println("Folders:");
		for (File folder : folders) { // Para cada pasta do vetor folders, imprimir uma lista com cada pasta.
			System.out.println(folder);
		}
		System.out.println("---------------------------------------------------");
		File[] files = path.listFiles(File::isFile); // Vetor para lista dos files(arquivos). isFile = especificar p/ listar so arquivos.
		System.out.println("Files:");
		for(File file : files) { // Para cada arquivo do vetor files, imprimir uma lista com cda arquivo.
			System.out.println(file);
		}
		boolean success = new File(strPath + "\\subdir").mkdir(); // Cria uma sub pasta a partir do strPath.
		System.out.println("Diretory created successfully: " + success); // Informa se foi criada com sucesso.
		
		sc.close();
	}
}