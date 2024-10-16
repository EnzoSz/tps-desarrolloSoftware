package entidades;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "articulos")

public class Articulo implements Serializable {

    @Serial
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "nombre")
    private String denominacion;

    @Column(name = "precio")
    private int precio;

}
