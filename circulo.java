public class Circulo extends FormaGeometrica {
    
    private float raio;
    
    public float area(){
        if(raio > 0){return raio*raio*pi;}
        return 0;
    }
    public float perimetro(){
        if(raio > 0){return 2*raio*pi;}
        return 0;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    
    
}
