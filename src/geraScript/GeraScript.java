package geraScript;

public class GeraScript {
	private String nomeCampo;
	private Tipos tipo;
	
	private boolean nulo;
	private boolean auto_increment;
	public GeraScript(String nomeCampo, Tipos tipo) {
		this.nomeCampo=nomeCampo;
		this.tipo=tipo;
	}
	public GeraScript autoIncrementa(boolean autoIncrement) {
		this.auto_increment=autoIncrement;
		return this;
	}
	public GeraScript eNulo(boolean isnulo) {
		this.nulo=isnulo;
		return this;
	}
	public String getNomeCapo() {
		return nomeCampo;
	}
	public void setNomeCapo(String nomeCapo) {
		this.nomeCampo = nomeCapo;
	}
	public boolean isNulo() {
		return nulo;
	}
	public void setNulo(boolean nulo) {
		this.nulo = nulo;
	}
	public boolean isAuto_increment() {
		return auto_increment;
	}
	public void setAuto_increment(boolean auto_increment) {
		this.auto_increment = auto_increment;
	}
	public Tipos getTipo() {
		return tipo;
	}
	public void setTipo(Tipos tipo) {
		this.tipo = tipo;
	}

}
