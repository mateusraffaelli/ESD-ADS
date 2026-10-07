package ads.esd;

public class Escalonador {
    private int numeroDeProcessos;
    private int instrucoesPorRodada;
    private FilaCircular<Processo> fila;
    Processo[] processos;

    public Escalonador(int numeroDeProcessos, int instrucoesPorRodada) {
        this.fila = new FilaCircular<>(numeroDeProcessos);
        this.numeroDeProcessos = numeroDeProcessos;
        this.instrucoesPorRodada = instrucoesPorRodada;

//        Processo p1 = new Processo("P1", 7, 0);
//        Processo p2 = new Processo("P2", 4, 0);
//        Processo p3 = new Processo("P3", 5, 1);
//        Processo p4 = new Processo("P4", 6, 2);
//        Processo p5 = new Processo("P5", 3, 4);
//
//
        this.processos = new Processo[5];
//        processos[0] = p1;
//        processos[1] = p2;
//        processos[2]= p3;
//        processos[3] = p4;
//        processos[4] = p5;
    }

    public void adicionarProcessos(Processo p1, Processo p2, Processo p3, Processo p4, Processo p5){
        processos[0] = p1;
        processos[1] = p2;
        processos[2]= p3;
        processos[3] = p4;
        processos[4] = p5;
    }

    private void adicionar(Processo processo){
        fila.enfileirar(processo);
        fila.getInicio().setStatus("PRONTO");
    }

    private void remover(){
        fila.desenfileirar();
    }

    public void incrementarProcessos(){
        int rodada = 0; // Tempo atual

        while (rodada < 14) {
            for (int i = 0; i < processos.length; i++) {
                if (processos[i].getTempoChegada() == rodada){
                    adicionar(processos[i]);
                    System.out.println("Tempo " + rodada + ": " + fila.getInicio().getNome() + " chegou e entrou na fila");
                }
            }

            // Coloca na fila
            System.out.println(fila.getInicio().getNome() + " executando...");
            System.out.println("(espera "+ instrucoesPorRodada +" segundos)");

            decrementarInstrucoes();


            rodada++;
        }
    }

    public void decrementarInstrucoes(){
        Processo processoInicio = fila.getInicio();

        for (int quantum = 0; quantum < instrucoesPorRodada; quantum++) {
            processoInicio.decrementarInstrucoes();
        }

        System.out.println(processoInicio.getNome() +" executou " + instrucoesPorRodada + ". Restam: " + processoInicio.getInstrucoesRestantes());

        if (processoInicio.getInstrucoesRestantes() == 0){
            System.out.println(processoInicio.getNome() + " terminou!");
            fila.getInicio().setStatus("TERMINADO");
            remover();
        }else{
            adicionar(processoInicio);
            remover();
        }
    }




}
