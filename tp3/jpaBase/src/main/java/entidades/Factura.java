package entidades;
import javax.persistence.*;
import java.io.Serializable;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "facturas")
public class Factura implements Serializable {

    private static final long serialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name= "fecha")
    private String fecha;
    @Column(name= "numero")
    private int numero;
    @Column(name="total")
    private int total;

}
