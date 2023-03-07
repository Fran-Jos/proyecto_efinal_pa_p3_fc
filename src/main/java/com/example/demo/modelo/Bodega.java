package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name= "bodega")
public class Bodega {

//	información:
//		• Nombre
//		• Número (no es la clave la primaria)
//		• Dirección
//		• Teléfono
//
	
	@Id
	@SequenceGenerator(name="seq_bode", sequenceName = "seq_bode", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_bode")
	@Column(name = "bode_id")
    private Integer id;
	@Column(name = "bode_nombre")
	private String nombre;
	@Column(name = "bode_numero")
	private Integer numero;	
	@Column(name = "bode_direccion")
	private String direccion;
	@Column(name = "bode_telefono")
	private String telefono;
	
	@OneToMany(mappedBy = "bodega")
	private List<Inventario>inventario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Inventario> getInventario() {
		return inventario;
	}

	public void setInventario(List<Inventario> inventario) {
		this.inventario = inventario;
	}

	@Override
	public String toString() {
		return "Bodega [id=" + id + ", nombre=" + nombre + ", numero=" + numero + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", inventario=" + inventario + "]";
	}
	
	
}
