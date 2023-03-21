package tn.iset.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity@Data@AllArgsConstructor@NoArgsConstructor
public class UserInformations implements Serializable{
    public int idInformations;
    public String address;
    public String city;
    public String email;
    public String phoneNumber;
}
