public class Remedio {

    private String nomeRemedio, tarja, laboratorio;
    private double valor;
    private int estoque;

    Remedio(String nomeRemedio, String tarja, String laboratorio, double valor, int estoque){

        this.nomeRemedio = nomeRemedio;
        this.tarja = tarja;
        this.laboratorio = laboratorio;
        this.valor = valor;
        this.estoque = estoque;

    }

    // faz com que o objeto valor receba um novo valor
    public void setValor(double valor){this.valor = valor;}

    public void setEstoque(int estoque){this.estoque = estoque;}

    public void incrementaEstoque(int estoque){

        this.estoque = this.estoque + estoque;

    }

    public void decrementarEstoque(int estoque){

        this.estoque = this.estoque - estoque;

    }

    public void info(){
        System.out.printf("====================================================================================%n");
        System.out.printf("Nome do remedio:" + this.nomeRemedio + "%n");
        System.out.printf("Tarja do medicamento:" + this.tarja + "%n");
        System.out.printf("Laboratorio:" + this.laboratorio + "%n");
        System.out.printf("Valor do remedio:" + this.valor + " reais %n");
        System.out.printf("Contém em estoque:" + this.estoque + " unidades%n");
        
        
    }
        


}
