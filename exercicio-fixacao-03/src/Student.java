public class Student {
    private String nome;
    private double n1;
    private double n2;
    private double n3;

    public Student(String nome, double n1, double n2, double n3) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void situacaoAluno(){
        double notaFinal = (this.n1 + this.n2 + this.n3 );

        System.out.printf("Nota final: %.2f %n", notaFinal);

        if (notaFinal >= 60){
            System.out.println("Passou");
        }
        else {
            System.out.println("Falhou");
            System.out.printf("Precisava de mais %.2f pontos", 60 - notaFinal);
        }

    }
}
