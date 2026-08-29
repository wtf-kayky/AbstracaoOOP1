package ExecercioAbs;

public class conta {

    private String usuario;
    private String senha;
    private double saldo;


    public conta(String usuario,String senha) {
        this.usuario = usuario;

        this.senha = senha;
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


    public void setSenha(String senha) {
        int minimo =4;
        if (senha.length() >= minimo ) {
            this.senha = senha;
            System.out.println("Senha aceita " + this.senha);
        } else {
            System.out.println(" A senha deve conter 4 caracteres ");
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        if (valor <= 0 ){
            System.out.println("Saldo inválido");
        }else{
            this.saldo = saldo + valor;
            System.out.println(" Seu saldo é de " + this.saldo);
        }
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
    public void mostrarSaldo(){
        System.out.println("Usuario " + usuario + "\n" + "Possui um saldo de " + saldo);
    }
}


