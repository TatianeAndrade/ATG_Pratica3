
public class Incidentes {
	private Ocorrencia ocorrencia;
	private FatorContribuinte fator;
	private Recomendacao recomendacao;
	private Aeronaves aeronaves;
	
	public Incidentes(String codigo, String totalaeros, String fabricante){
		ocorrencia = new Ocorrencia(totalaeros, codigo);
		aeronaves = new Aeronaves(fabricante);
	}
	
	public String getFabricante() {
		return aeronaves.getFabricante();
	}
	
	public String getCodigo() {
		return ocorrencia.getCodigo();
	}
	
	public String getTotalAeros() {
		return ocorrencia.getTotalAero();
	}
}
