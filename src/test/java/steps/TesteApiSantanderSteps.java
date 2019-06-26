package steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import cucumber.api.java.pt.Quando;
import support.JsonSuporte;

public class TesteApiSantanderSteps extends JsonSuporte {
	
	Map<String, Object> parameters = new HashMap<String, Object>();
	Map<String, Object> objDados = new HashMap<String, Object>();
	List<Map<String, Object>> listObjDados = new ArrayList<Map<String, Object>>();
	
	
	
	@Quando("^adiciono o campo \"([^\"]*)\" com o valor \"([^\"]*)\" no objeto parameters$")
	public void adicionoOCampoComOValorNoObjetoParameters(String key, String value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    parameters.put(key, value);
	}

	@Quando("^adiciono o campo \"([^\"]*)\" com o valor \"([^\"]*)\" no objeto objDados$")
	public void adicionoOCampoComOValorNoObjetoObjDados(String key, String value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    objDados.put(key, value);
	}

	@Quando("^adiciono o objeto objDados na lista listObjDados$")
	public void adicionoOObjetoObjDadosNaListaListObjDados() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    listObjDados.add(objDados);
	}

	@Quando("^adiciono o campo \"([^\"]*)\" com a lista listObjDados no objeto parameters$")
	public void adicionoOCampoComAListaListObjDadosNoObjetoParameters(String key) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    parameters.put(key, listObjDados);
	}

	@Quando("^adiciono o campo \"([^\"]*)\" com o objeto parameters no objeto json$")
	public void adicionoOCampoComOObjetoParametersNoObjetoJson(String key) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    json.put(key, parameters);
	}

}
