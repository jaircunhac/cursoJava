package javaCourse.section8.exercise3ver2.entities;

public class Student {
    public String nome;
    public int nota1Tri;
    public int nota2Tri;
    public int nota3Tri;
    public int media;
    public int missingPoints;

    public void calcMediaAluno(int nota1Tri, int nota2Tri, int nota3Tri){
        this.media = nota1Tri + nota2Tri + nota3Tri;
    }

    public void calcPontosFaltantes(){
        this.missingPoints = 60 - this.media;
    }
}
