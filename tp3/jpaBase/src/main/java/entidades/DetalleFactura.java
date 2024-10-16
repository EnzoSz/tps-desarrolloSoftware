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
@Table(name = "detalle_factura")

public class DetalleFactura implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "subtotal")
    private int subtotal;

}
