package entities;

import java.util.Date;

public class Factura {
	
	private Long id;
	private Long numeroFactura;
	private Float monto;
	private Date fechaCreacion;
	private Date fechaEliminaci�n;
	private Tarjeta tarjeta;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(Long numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaEliminacion() {
		return fechaEliminaci�n;
	}
	public void setFechaEliminacion(Date fechaEliminaci�n) {
		this.fechaEliminaci�n = fechaEliminaci�n;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	

}
