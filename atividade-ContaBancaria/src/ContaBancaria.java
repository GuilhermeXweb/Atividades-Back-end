public class ContaBancaria {
  String nomeTitular ;
  Double saldo ;
 

    public ContaBancaria(String nomeTitular,Double saldo) {
    this.nomeTitular = nomeTitular;
    this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void exibirTitular() {
        System.out.println("\n=== Dados do Titular ===");
        System.out.println("Nome: " + nomeTitular);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (saldo < valor) {
            System.out.println("Seu saldo e insuficiente!!");  
        }
        else{
            saldo -= valor;
            System.out.println("Seu saldo atual e: " + saldo);
        }
    }
}
