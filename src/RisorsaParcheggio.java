public class RisorsaParcheggio {
    public static int totale_posti = 4;
    public int count_occupati = 0;
    public boolean parcheggio_esaurito = false;

    public void parcheggia(){
        String nome = Thread.currentThread().getName();
        try {
            while (parcheggio_esaurito){
                long tempo_attesa = (int) (Math.random() * 10000) + 1;
                System.out.println(nome + " aspetta per " + tempo_attesa + " millisecondi");
                wait(tempo_attesa);
            }
            count_occupati++;
            if(count_occupati >= totale_posti) {
                System.out.println("PARCHEGGIO COMPLETO");
                parcheggio_esaurito = true;
            }
            long tempo_parcheggio = (int) (Math.random() * 5000) + 1;
            System.out.println(nome + " sta parcheggiato per " + tempo_parcheggio + " millisecondi");
            Thread.sleep(tempo_parcheggio);
            count_occupati--;
            if(count_occupati < totale_posti) {
                parcheggio_esaurito = false;
            }
            notify();
        } catch (Exception e){}
    }
}