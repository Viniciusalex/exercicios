package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	
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

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comemnt> getComentarios() {
		return comentarios;
	}
	
	public void adicionandoComentarios(Comemnt comentario) {
		comentarios.add(comentario);
	}
	
	public void removendoComentario(Comemnt comentario) {
		comentarios.remove(comentario);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(content + "\n");
		sb.append("Comentarios:" + "\n");
		for(Comemnt c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
	
	
		
}
