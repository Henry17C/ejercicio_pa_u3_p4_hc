package com.example.demo.farmacia.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_det")
	@SequenceGenerator(name = "seq_det", sequenceName = "seq_det", allocationSize = 1)
	@Column (name = "det_id")
	private Integer catidad;
	
	@Column (name = "det_precio_unitario")
	private BigDecimal precioUnitario;
	
	@Column (name = "det_subtotal")
	private BigDecimal subtotal;
	
	@ManyToOne
	@JoinColumn(name = "det_id_factura")
	private Factura factura;
	
	@ManyToOne
	@JoinColumn(name = "det_id_producto")
	private Producto producto;

	@Override
	public String toString() {
		return "DetalleFactura [catidad=" + catidad + ", precioUnitario=" + precioUnitario + ", subtotal=" + subtotal
				+ ", factura=" + factura + ", producto=" + producto + "]";
	}

	public Integer getCatidad() {
		return catidad;
	}

	public void setCatidad(Integer catidad) {
		this.catidad = catidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	

	
	
	

}
