public class Reserva{

    public int cod_reserva; //codigo da reserva
    public String data_reserva;
    public float valor_diario;
    public String forma_pagamento;
    protected int id_emp; //ID da empresa

    public Reserva(int cod_reserva, String data_reserva, float valor_diario, String forma_pagamento, int id_emp){
        this.cod_reserva = cod_reserva;
        this.data_reserva = data_reserva;
        this.valor_diario = valor_diario;
        this.forma_pagamento = forma_pagamento;
        this.id_emp = id_emp;
    }

    public Reserva(){

    }

    public Reserva(int cod_reserva, float valor_diario, String forma_pagamento){
        this.cod_reserva = cod_empresa;
        this.valor_diario = valor_diario;
        this.forma_pagamento = forma_pagamento;
    }

    public void setCod_reserva( int codigo_reserva){
        this.cod_reserva=codigo_reserva;
    }
    public int getCod_reserva(){
        return this.cod_reserva;
    }

    public void setData_reserva( String data_reserva){
        this.data_reserva=data_reserva;
    }
    public String getData_reserva(){
        return this.data_reserva;
    }

    public void setValor_diario( float valor_diario){
        this.valor_diario=valor_diario;
    }
    public float getValor_diario(){
        return this.valor_diario;
    }
    public void setForma_pagamento( String forma_pagamento){
        this.forma_pagamento=forma_pagamento;
    }
    public String getForma_pagamento(){
        return this.forma_pagamento;
    }
    protected void setId_emp( int id_emp){
        this.id_emp=id_emp;
    }
    protected int getId_emp(){
        return this.id_emp;
    }
}