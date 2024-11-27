public class Hospede extends Pessoa {
    protected String data_nascimento ;
    public String numero_celular;

    public Hospede(String nome, String cpf, String rg , String endereco, String nacionalidade, String data_nascimento, String numero_celular){
        super( nome, cpf, data_nascimento, endereco, nacionalidade)
        this.data_nascimento;
        this.numero_celular;
    }
}

protected void setData_nascimento( String data_nascimento ){
    this.data_nascimento=data_nascimento;
}
protected int getData_nascimento(){
    return this.data_nascimento;
}

public void setNumero_celular( String numero_celular){
    this.numero_celular=numero_celular;
}
public String getnacionalidade(){
    return this.numero_celular;
}