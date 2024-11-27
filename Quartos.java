public class Quartos{

    public int quantidade_pessoas;
    public String tempo_estadia;
    protected int numq; //numero do quarto
    protected String horario_entrada;
    protected String horario_saida;

    public Quartos (int quantidade_pessoas, String tempo_estadia, int numq, String horario_entrada, String horario_saida){
        this.quantidade_pessoas = quantidade_pessoas;
        this.tempo_estadia = tempo_estadia;
        this.numq = numq;
        this.horario_entrada = horario_entrada;
        this.horario_saida = horario_saida;
    }
    
    public Quartos(){

    }

    
    public Quartos (int quantidade_pessoas, String tempo_estadia, int numq){
        this.quantidade_pessoas = quantidade_pessoas;
        this.tempo_estadia = tempo_estadia;
        this.numq = numq;
    }
    
    
        public void setQuantidade_pessoas( int quantidade_pessoas){
            this.quantidade_pessoas=quantidade_pessoas;
        }
        public int getQuantidade_pessoas(){
            return this.quantidade_pessoas;
        }

        public void setTempo_estadia( String tempo_estadia){
            this.tempo_estadia=tempo_estadia;
        }
        public String getTempo_estadia(){
            return this.tempo_estadia;
        }
        
        protected void setNumq( int numq){
            this.numq=numq;
        }
        protected int getNumq(){
            return this.numq;
        }
        protected void setHorario_entrada( String horario_entrada){
            this.horario_entrada=horario_entrada;
        }
        protected String getHorario_entrada(){
            return this.horario_entrada;
        }
        protected void setHorario_saida( String horario_saida){
            this.horario_saida=horario_saida;
        }
        protected String getHorario_saida(){
            return this.horario_saida;
        }
}