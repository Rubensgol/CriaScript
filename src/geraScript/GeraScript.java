package geraScript;

public class GeraScript {
	public static String geraOScript(String nomeCampo, Tipos tipo, boolean auto_increment, boolean notNulo) {
		String script="";
		script+="'"+nomeCampo+"'";
		script+=" "+tipo;
		if(notNulo)
			script+=" NOT NULL";
		if(auto_increment)
			script+=" AUTO_INCREMENT";
		script+=",";
		return script;
	}

}
