package entities;

import java.util.Objects;

public class Client {

	// HashCode e Equals personalizados

	private String name;
	private String email;
	
	public Client(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
	/*
	 * Como comparar se um cliente é igual ao outro?
	 * 1) Por nome
	 * 2) Por email
	 * 3) Pode querer comparar se o nome e o email são iguais
	 * Depende da regra de negócio.
	 * 
	 * Para fins didáticos, basear-nos-emos de que a regra de comparação será apenas por name
	 * */
	
	// @Override pois são operações da classe Object, então estamos as sobreescrevendo
	
	//	@Override
	//	public int hashCode() {
	//		return Objects.hash(name);
	//	}
	//
	//	@Override
	//	public boolean equals(Object obj) {
	//		if (this == obj)
	//			return true;
	//		if (obj == null)
	//			return false;
	//		if (getClass() != obj.getClass())
	//			return false;
	//		Client other = (Client) obj;
	//		return Objects.equals(name, other.name);
	//	}
	
	// Ok, mas e se quisermos comparar tanto name como email?
	
	@Override
	public int hashCode() {
		return Objects.hash(email, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}
	
	
}
