package avaliaçaoq1;
import java.util.Date;
import java.util.Objects;

public class Exame {
	String identificaçao;
	Date data;
	String descriçao;
	
	public Exame(String identificaçao, String descriçao) {
		this.identificaçao = identificaçao;
		this.descriçao = descriçao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, identificaçao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exame other = (Exame) obj;
		return Objects.equals(data, other.data) && Objects.equals(identificaçao, other.identificaçao);
	}

	@Override
	public String toString() {
		return "Exame [identificaçao=" + identificaçao + "]";
	} 
}