package pe.com.cibertec.Lp2_spring.model.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
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

@Entity
@Table(name="tb_producto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name="producto_id", nullable = false)
	private Integer productoId;
	
	@Column(name="nombre_producto", nullable = false)
	private String nombreProducto;
	
	@Column(name="precio", nullable = false)
	private Double precio;
	
	@Column(name="cantidad", nullable = false)
	private Integer cantidad;
	
	@Column(name = "fecha_vencimiento", nullable = false)
	@DateTimeFormat(pattern ="yyyy-mm-dd")
	private LocalDate fechaVencimiento; //LocalDate yyyy-mm-dd || LocalDateTime yyyy-mm-dd hh:mm:ss
	
	@ManyToOne
	@JoinColumn(name = "fk_categoria", nullable = false)
	private CategoriaEntity categoriaEntity;

}
