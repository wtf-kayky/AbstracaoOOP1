package PACKAGE_NAME;

public class ContaAbs {
}
package ExecercioAbs;

public abstract  class ContaAbs {

    private String usuario;
    private double saldo;

    public ContaAbs(String usuario ) {
        this.usuario = usuario;

    }

    public String getUsuario() {

        return usuario;
    }

    public void setUsuario(String usuario) {
        if (usuario == null || usuario.equals("")) {
            System.out.println(" Usuario inesxistente ");
        } else {

            this.usuario = usuario;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void aplicarbeneficios();

    public void mostrarSaldo() {
        System.out.println("Saldo" + this.saldo + "\n" + "Usuario" + this.usuario);
    }
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println(" valor inválido ");
        } else if (saldo <= 0) {
            System.out.println(" Nao ha valor para sacar");

        } else if (valor > saldo) {
            System.out.println(" Valor de saque superior ao saldo ");

        } else {
            this.saldo = saldo - valor;
            System.out.println(" Seu saldo atual e´de " + saldo);
        }
    }
    public void depositar(double valor){
        if (valor <= 0 ){
            System.out.println("Saldo inválido");
        }else{
            this.saldo = saldo + valor;
            System.out.println(" Seu saldo é de " + this.saldo);
        }
    }
}



