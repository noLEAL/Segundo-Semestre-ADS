public class Veiculo {
    String placa, modelo;
    Pessoa dono;

    Veiculo (Pessoa dono, String placa, String modelo){
        this.dono = dono;
        this.modelo = modelo;
        this.placa = placa;
    }

    Veiculo (String placa, String modelo){
        this.dono = null;
        this.modelo = modelo;
        this.placa = placa;
    }

    public void Info(){
        System.out.println("Infomacoes do Veiculo");
        System.out.println("Modelo/Placa: " + this.modelo +"/"+this.placa);
        if(this.dono != null) {
            this.dono.Info();
        }else{
            System.out.println("Nao possui dono cadastrado");
        }
    }

    public void novoDono(Morador novoDono){
        this.dono = novoDono;
    }
}
