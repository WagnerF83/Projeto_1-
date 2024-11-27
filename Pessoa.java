public class Pessoa{
   //Declaração de atributos
    public String nome;
    private String cpf;
    public String rg;
    protected String endereco;
    protected String nacionalidade;
   //Construtor com paradigmas
    public Pessoa (String nome, String cpf, String rg, String endereco, String nacionalidade){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
    }

    //Construtor Vazio
     public Pessoa (){

     }
    //Uso padrão do construtor  
     public Pessoa(String nome, String cpf, String numero_celular){
      this.nome = nome;
      this.cpf = cpf;
      this.nacionalidade = nacionalidade;
     }
     
     //Gets e Sets
        public void setNome(String nome){
            this.nome=nome;
        }
         public String getNome(){
            return this.nome;
         }

         private void setCPF (String cpf){
            this.cpf=cpf;
         }
         private String getCPF(){
            return this.cpf;
         }

         public void setRG( String rg){
            this.rg=rg;
         }
         public String getRG(){
            return this.rg;
         }

         protected void setEndereco( String endereco){
            this.endereco=endereco;
         }
         protected String getEndereco(){
            return this.endereco;
         }

         protected void setNumero_celular( String nacionalidade){
            this.nacionalidade=nacionalidade;
         }
         protected String getNumero_celular(){
            return this.nacionalidade;
         }
} 

        