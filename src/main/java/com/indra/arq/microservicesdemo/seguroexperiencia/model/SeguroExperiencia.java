package com.indra.arq.microservicesdemo.seguroexperiencia.model;

import java.util.ArrayList;
import java.util.List;

//@Document(collection="segurosexperiencia")
public class SeguroExperiencia {
	
	//@Id
    private String id;

	private String tipoSeguro;
	private int amigos;
	private String descuento;
	private List<String> experiencias = new ArrayList<String>();
	private List<String> coberturas = new ArrayList<String>();

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTipoSeguro() {
		return tipoSeguro;
	}
	public void setTipoSeguro(String tipoSeguro) {
		this.tipoSeguro = tipoSeguro;
	}
	public int getAmigos() {
		return amigos;
	}
	public void setAmigos(int amigos) {
		this.amigos = amigos;
	}
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	public List<String> getExperiencias() {
		return experiencias;
	}
	public void setExperiencias(List<String> experiencias) {
		this.experiencias = experiencias;
	}
	public List<String> getCoberturas() {
		return coberturas;
	}
	public void setCoberturas(List<String> coberturas) {
		this.coberturas = coberturas;
	}
	@Override
	public String toString() {
		return String.format("SeguroExperiencia [id=%s, tipoSeguro=%s, amigos=%s, descuento=%s, experiencias=%s, coberturas=%s]",
						id, tipoSeguro, amigos, descuento, experiencias, coberturas);
	}
	
}
