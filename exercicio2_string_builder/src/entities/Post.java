package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	// static é pra que não tenha uma cópia do objeto sdf para cada post da minha aplicação. Tendo apenas uma cópia para a aplicação inteira
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();

	public Post() {
		
	}
	
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public List<Comment> getComments() {
		return comments;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	// Como podemos ver, o toString teria linhas demais
	// StringBuilder é importante pois é mais otimizada para esse tipo de operação a partir de vários strings pequenos
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); // Agora podemos concatenar strings com a função append
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for(Comment c : comments) { // Para cada Comment c na minha lista de comments eu vou:
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString(); // Assim, convertemos o StringBuilder para String
	}
	
}
