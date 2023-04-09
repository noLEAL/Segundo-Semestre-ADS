public class Remedio {

    String nomeRemedio, tarja, laboratorio;
    double valor;
    int estoque;

    Remedio(String nomeRemedio, String tarja, String laboratorio, double valor, int estoque){

        this.nomeRemedio = nomeRemedio;
        this.tarja = tarja;
        this.laboratorio = laboratorio;
        this.valor = valor;
        this.estoque = estoque;

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
