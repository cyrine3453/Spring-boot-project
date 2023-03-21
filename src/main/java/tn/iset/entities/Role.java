package tn.iset.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@Data@AllArgsConstructor@NoArgsConstructor
public class Role implements Serializable{
    public int idRole;
    public String RoleName;
}
