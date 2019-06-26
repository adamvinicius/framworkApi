package steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import support.JsonSuporte;
import support.RESTSupport;

public class JsonPlaceHolder extends JsonSuporte {
	
	List<Object> listClientes = new ArrayList<Object>();
	Map<String, Object> clienteUm = new HashMap<String, Object>();
	Map<String, Object> clienteDois = new HashMap<String, Object>();
	String endpoint = new String();
	
	@Dado("^que adiciono o endpoint \"([^\"]*)\"$")
	public void que_adiciono_o_endpoint(String endpoint) throws Throwable {
	    this.endpoint = endpoint;
	}
	
	@Dado("^que adiciono o campo \"([^\"]*)\" com o valor \"([^\"]*)\" no objeto header$")
	public void que_adiciono_o_campo_com_o_valor_no_objeto_header(String campo, String valor) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		header.put(campo, valor);
	}
	@Quando("^adiciono o campo \"([^\"]*)\" com o valor \"([^\"]*)\" no objeto json$")
	public void adiciono_o_campo_com_o_valor_no_objeto_json(String campo, String valor) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		json.put(campo, valor);
	}
	
	@Quando("^adiciono o campo \"([^\"]*)\" com o valor \"([^\"]*)\" no objeto clienteUm$")
	public void adiciono_o_campo_com_o_valor_no_objeto_clienteUm(String campo, String valor) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.clienteUm.put(campo, valor);
	}

	@Quando("^adiciono o campo \"([^\"]*)\" com o valor \"([^\"]*)\" no objeto clienteDois$")
	public void adiciono_o_campo_com_o_valor_no_objeto_clienteDois(String campo, String valor) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.clienteDois.put(campo, valor);
	}

	@Quando("^adiciono o objeto clienteUm na lista clientes$")
	public void adiciono_o_objeto_clienteUm_na_lista_clientes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.listClientes.add(clienteUm);
	}

	@Quando("^adiciono o objeto clienteDois na lista clientes$")
	public void adiciono_o_objeto_clienteDois_na_lista_clientes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.listClientes.add(clienteDois);
	}

	@Quando("^adiciono o campo \"([^\"]*)\" com a lista clientes no objeto json$")
	public void adiciono_o_campo_com_a_lista_clientes_no_objeto_json(String campo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		json.put(campo, listClientes);
	}
	
	@Entao("^recebo o objeto json$")
	public void recebo_o_objeto_json() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.err.println(json.toString());
		RESTSupport.executePost(endpoint, json, header);
	}

}
