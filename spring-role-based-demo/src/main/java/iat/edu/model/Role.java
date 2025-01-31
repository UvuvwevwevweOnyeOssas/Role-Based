package iat.edu.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="roles")
public class Role {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column (name="role_id")
	private Integer roleId;
	
	@NotBlank(message="name is required")
	@Column(name="role_name")
	private String name;
	
	@Column(name="description")
	private String description;
	
@ManyToMany
@JoinTable(name="user_role",
 joinColumns = @JoinColumn (name="user_id"),
 inverseJoinColumns= @JoinColumn (name="role_id"))
 
private List<Role> myRoles;
}
