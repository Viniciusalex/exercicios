package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entities.Comemnt;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/yyyy HH:mm:ss");
		
		Comemnt comentario01 = new Comemnt("Fazer boa viagem");
		Comemnt comentario02 = new Comemnt("uau, isso é incrível");
		Post post01 = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Viajar para a Nova Zelândia", 
				"Vou visitar esse país maravilhoso",
				12);
				
		post01.adicionandoComentarios(comentario01);
		post01.adicionandoComentarios(comentario02);
		
		
		System.out.println(post01);
		
	}

}
