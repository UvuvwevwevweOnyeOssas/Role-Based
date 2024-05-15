package iat.edu.model;

 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_role")
public class UserRole {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	 Integer id;
	@ManyToOne
	@JoinColumn(name="user_id") User user;
	
	@ManyToOne
	@JoinColumn(name="role_id") Role role;
	
	
}
