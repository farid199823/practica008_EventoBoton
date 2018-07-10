package Layout;

public class pregunta {
    private String pregunta;
    private String[] respuestas;
    private int indiceCorrecto;

    public pregunta (String pregunta,String[] respuestas, int indiceCorrecto){

        this.pregunta = pregunta;
        this.respuestas = respuestas.clone();
        this.indiceCorrecto = indiceCorrecto;
    }

    public String  getPregunta() {
        return this.pregunta;
    }
    public int getIndiceCorrecto() {
        return indiceCorrecto;
    }
    public String[] getRespuestas(){
        return respuestas;
    }

}
