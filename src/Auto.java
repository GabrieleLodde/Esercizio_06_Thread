public class Auto extends Thread{
    public RisorsaParcheggio r;
    
    public Auto(String nome, RisorsaParcheggio r){
        super(nome);
        this.r = r;
    }

    @Override
    public void run(){
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " arriva");
        r.parcheggia();
        System.out.println(nome + " esce dal parcheggio");
    }
}