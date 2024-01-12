public class Cliente {
    private String primeiroNome;
    private String sobrenome;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Cliente(String primeiroNome, String sobrenome) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
    }
}
