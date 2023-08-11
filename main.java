import java.util.HashSet;

public class main {

    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo();
        t1.setLado1(3);
        t1.setLado2(4);
        t1.setLado3(5);
        System.out.println(t1.perimetro());
        System.out.println(t1.area());
        
        Circulo c1 = new Circulo();
        c1.setRaio(10);
        System.out.println(c1.area()+" "+ c1.perimetro());
        
        
        Quadrado q1 = new Quadrado();
        q1.setLado(5);
        System.out.println(q1.area()+" "+ q1.perimetro());
    }
}
