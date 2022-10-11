package comunicacion;

public class Alfabeto extends Pictograma {

	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	
	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public int cantidadLetras() {
		return letras.length;
	}
	
	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String x="";
		for(String letra:letras) {
			x=letra+", ";
		}
		return x.substring(0, x.length()-2);
	}

}
