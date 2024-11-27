public class Main{

    public static void main( String[] args ){

        Hospede h1 = new Hospede(" ", " ", " ", " ", " ", " ", " ");
        h1.setNome ("Paulo");
        h1.setCPF ("649.359.532.10");
        h1.setRG ("999.999.999-00");
        h1.setEndereco ("AV.13 de maio");
        h1.setNacionalidade ("brasileiro");
        h1.setData_nascimento ("12/08/1995");
        h1.setNumero_celular ("(81) 99999-9999");

        Quartos q1 = new Quartos( 0, " ", 0, " ", " ");
        q1.setQuantidade_pessoas (5);
        q1.setTempo_estadia ("1 mês");
        q1.setNumq (19);
        q1.setHorario_saida ("8:00 AM");
        q1.setHorario_entrada ("17:00 PM");

        Reserva r1 = new Reserva( 0, " ", 0.0, " ", 0);
        r1.setCod_reserva (5264);
        r1.setData_reserva (01/01/2024);
        r1.setValor_diario (780,00f);
        r1.setForma_de_pagamento ("Cartão de crédito");
        r1.setId_emp (53862);
    }
}