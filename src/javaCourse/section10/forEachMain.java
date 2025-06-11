package javaCourse.section10;

public class forEachMain {
    public static void main(String[] args) {
        String[] vetorNomes = new String[]{"Jair", "Petros", "Arrys"};

        // It does his job but can be better
        for (int i = 0; i < vetorNomes.length; i++){
            System.out.println(vetorNomes[i]);
        }

        System.out.println("-------------------------");

        // It is better
        for (String nome : vetorNomes){
            System.out.println(nome);
        }
    }
}
