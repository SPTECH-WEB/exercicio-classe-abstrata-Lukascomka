package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {

    private List<Figura> figuras;

    public Imagem() {
    }

    public Imagem(List<Figura> figuras) {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura){
        if(this.figuras != null){
            this.figuras.add(figura);
        }
    }

    public Double calcularSomaDasAreas(){
        double soma=0.0;
        for(Figura figura : this.figuras){
            soma+=figura.calcularArea();
        }

        return soma;
    }


    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figurasMaiores = new ArrayList<>();
        for(Figura figura : this.figuras){
            if(figura.calcularArea()>20){
                figurasMaiores.add(figura);
            }
        }
        return figurasMaiores;
    }


    public List<Figura> buscarQuadrados(){
        List<Figura> isSquare = new ArrayList<>();

        for(Figura figura : this.figuras){
            if(figura instanceof Quadrado){
                isSquare.add(figura);
            }
        }
        return isSquare;
    }


}
