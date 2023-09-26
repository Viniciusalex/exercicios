package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date momento;
	private String titulo;
	private String content;
	private Integer likes;
	
	private List<Comemnt> comentarios = new ArrayList();
	
	public Post() {
		
	}

	public Post(Date momento, String titulo, String content, Integer likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.content = content;
		this.likes = likes;
	}
	
}
