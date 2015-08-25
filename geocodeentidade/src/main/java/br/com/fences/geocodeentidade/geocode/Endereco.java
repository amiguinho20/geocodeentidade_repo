package br.com.fences.geocodeentidade.geocode;

import java.io.Serializable;

import br.com.fences.geocodeentidade.geocode.geojson.Point;

public class Endereco implements Serializable{

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	private String geocodeStatus;
	private String ultimaAtualizacao;
	private Point geometry = new Point();
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getGeocodeStatus() {
		return geocodeStatus;
	}
	public void setGeocodeStatus(String geocodeStatus) {
		this.geocodeStatus = geocodeStatus;
	}
	public String getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}
	public void setUltimaAtualizacao(String ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}
	public Point getGeometry() {
		return geometry;
	}
	public void setGeometry(Point geometry) {
		this.geometry = geometry;
	}
}
