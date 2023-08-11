public class Quadrado extends FormaGeometrica {
    private float lado;
    
    public float area(){
        if(lado > 0){return lado*lado;}
        return 0;
    }
    public float perimetro(){
        if(lado > 0){return 4*lado;}
        return 0;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    
}
