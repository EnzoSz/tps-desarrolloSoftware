package entidades;

import java.io.Serial;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Import Lombock
import lombok.*;

//Anotaciones Lombock
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder


//Anotaciones JPA
@Entity // Va a ser una entidad y se va a guardar en la db
@Table(name = "clientes")
public class Cliente implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "dni", unique = true)
    private int dni;



}
