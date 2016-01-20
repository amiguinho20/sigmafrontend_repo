package br.com.fences.sigmafrontend.config.mb;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class NavegacaoMB {

	private static final String HOME = "/privado/home/home.xhtml";
	private static final String LOGIN = "/login.xhtml";
	private static final String CADASTRAR_USUARIO = "/publico/cadastrousuario/cadastrarusuario.xhtml";
	private static final String CADASTRAR_USUARIO_SUCESSO = "/publico/cadastrousuario/sucesso.xhtml";

	private static final String DEIC_DIVECAR_ROUBOCARGA_ENDERECOAVULSO = "/modulo/deic/divecar/roubocarga/enderecoavulso/enderecoAvulso.xhtml";
	private static final String DEIC_DIVECAR_ROUBOCARGA_ENDERECOAVULSO_DETALHE = "/modulo/deic/divecar/roubocarga/enderecoavulso/enderecoAvulsoDetalhe.xhtml";

	private static final String DEIC_DIVECAR_ROUBOCARGA_INDICIADO = "/modulo/deic/divecar/roubocarga/indiciado/indiciado.xhtml";

	private static final String DEIC_DIVECAR_ROUBOCARGA_OCORRENCIA_DETALHE = "/modulo/deic/divecar/roubocarga/ocorrencia/detalhe/ocorrenciadetalhe.xhtml";
	private static final String DEIC_DIVECAR_ROUBOCARGA_OCORRENCIA_PESQUISA = "/modulo/deic/divecar/roubocarga/ocorrencia/pesquisa/pesquisa.xhtml";

	private static final String DEIC_DIVECAR_ROUBOCARGA_OCORRENCIA_PESQUISA_MAPA = "/modulo/deic/divecar/roubocarga/ocorrencia/pesquisa/mapa.xhtml";
	private static final String DEIC_DIVECAR_ROUBOCARGA_OCORRENCIA_PESQUISA_MAPASOZINHO = "/modulo/deic/divecar/roubocarga/ocorrencia/pesquisa/mapaSozinho.xhtml";

	
	public static String getHome() {
		return HOME;
	}
	public static String getLogin() {
		return LOGIN;
	}
	public static String getCadastrarUsuario() {
		return CADASTRAR_USUARIO;
	}
	public static String getCadastrarUsuarioSucesso() {
		return CADASTRAR_USUARIO_SUCESSO;
	}
	public static String getDeicDivecarRoubocargaEnderecoavulso() {
		return DEIC_DIVECAR_ROUBOCARGA_ENDERECOAVULSO;
	}
	public static String getDeicDivecarRoubocargaEnderecoavulsoDetalhe() {
		return DEIC_DIVECAR_ROUBOCARGA_ENDERECOAVULSO_DETALHE;
	}
	public static String getDeicDivecarRoubocargaIndiciado() {
		return DEIC_DIVECAR_ROUBOCARGA_INDICIADO;
	}
	public static String getDeicDivecarRoubocargaOcorrenciaDetalhe() {
		return DEIC_DIVECAR_ROUBOCARGA_OCORRENCIA_DETALHE;
	}
	public static String getDeicDivecarRoubocargaOcorrenciaPesquisa() {
		return DEIC_DIVECAR_ROUBOCARGA_OCORRENCIA_PESQUISA;
	}
	public static String getDeicDivecarRoubocargaOcorrenciaPesquisaMapa() {
		return DEIC_DIVECAR_ROUBOCARGA_OCORRENCIA_PESQUISA_MAPA;
	}
	public static String getDeicDivecarRoubocargaOcorrenciaPesquisaMapasozinho() {
		return DEIC_DIVECAR_ROUBOCARGA_OCORRENCIA_PESQUISA_MAPASOZINHO;
	}


}
