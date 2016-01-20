package br.com.fences.sigmafrontend.modulo.deic.divecar.roubocarga.ocorrencia.pesquisa;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
//@javax.faces.view.ViewScoped
@SessionScoped
public class FiltroMapa implements Serializable{

	private static final long serialVersionUID = -882301340484453507L;

	private boolean exibirRoubo = true;
	private boolean exibirReceptacao = true;
	private boolean exibirComplementar = true;
	private boolean exibirApenasLinhas = false;
	private boolean exibirJanelaFilha = false;
	
	private boolean exibirAvulsoMercado = false;
	private boolean exibirAvulsoGalpao = false;
	private boolean exibirAvulsoDeposito = false;
	private boolean exibirAvulsoDesmanche = false;
	private boolean exibirAvulsoCentroDeDistribuicao = false;
	
	public void limpar()
	{
		exibirRoubo = true;
		exibirReceptacao = true;
		exibirComplementar = true;
		exibirApenasLinhas = false;
		
		//exibirJanelaFilha = false;// nao deve ser limpo, pois deve ser mantido
		
		exibirAvulsoMercado = false;
		exibirAvulsoGalpao = false;
		exibirAvulsoDeposito = false;
		exibirAvulsoDesmanche = false;
		exibirAvulsoCentroDeDistribuicao = false;
	}
	
	
	public boolean isExibirRoubo() {
		return exibirRoubo;
	}
	public void setExibirRoubo(boolean exibirRoubo) {
		this.exibirRoubo = exibirRoubo;
	}
	public boolean isExibirReceptacao() {
		return exibirReceptacao;
	}
	public void setExibirReceptacao(boolean exibirReceptacao) {
		this.exibirReceptacao = exibirReceptacao;
	}
	public boolean isExibirComplementar() {
		return exibirComplementar;
	}
	public void setExibirComplementar(boolean exibirComplementar) {
		this.exibirComplementar = exibirComplementar;
	}
	public boolean isExibirApenasLinhas() {
		return exibirApenasLinhas;
	}
	public void setExibirApenasLinhas(boolean exibirApenasLinhas) {
		this.exibirApenasLinhas = exibirApenasLinhas;
	}
	public boolean isExibirAvulsoMercado() {
		return exibirAvulsoMercado;
	}
	public void setExibirAvulsoMercado(boolean exibirAvulsoMercado) {
		this.exibirAvulsoMercado = exibirAvulsoMercado;
	}
	public boolean isExibirAvulsoGalpao() {
		return exibirAvulsoGalpao;
	}
	public void setExibirAvulsoGalpao(boolean exibirAvulsoGalpao) {
		this.exibirAvulsoGalpao = exibirAvulsoGalpao;
	}
	public boolean isExibirAvulsoDeposito() {
		return exibirAvulsoDeposito;
	}
	public void setExibirAvulsoDeposito(boolean exibirAvulsoDeposito) {
		this.exibirAvulsoDeposito = exibirAvulsoDeposito;
	}
	public boolean isExibirAvulsoDesmanche() {
		return exibirAvulsoDesmanche;
	}
	public void setExibirAvulsoDesmanche(boolean exibirAvulsoDesmanche) {
		this.exibirAvulsoDesmanche = exibirAvulsoDesmanche;
	}
	public boolean isExibirJanelaFilha() {
		return exibirJanelaFilha;
	}
	public void setExibirJanelaFilha(boolean exibirJanelaFilha) {
		this.exibirJanelaFilha = exibirJanelaFilha;
	}


	public boolean isExibirAvulsoCentroDeDistribuicao() {
		return exibirAvulsoCentroDeDistribuicao;
	}


	public void setExibirAvulsoCentroDeDistribuicao(boolean exibirAvulsoCentroDeDistribuicao) {
		this.exibirAvulsoCentroDeDistribuicao = exibirAvulsoCentroDeDistribuicao;
	}
	
	
	
}
