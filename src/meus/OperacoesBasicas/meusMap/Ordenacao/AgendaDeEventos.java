package meus.OperacoesBasicas.meusMap.Ordenacao;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaDeEventos {

    Map<LocalDate,Evento> eventoMap ;

    public AgendaDeEventos() {
        this.eventoMap = new HashMap<>();
    }


    public void adicionarEvento(LocalDate data, String name,String atracao){
        eventoMap.put(data,new Evento(name,atracao));
    }

    public Map<LocalDate,Evento> exibirEmOrdem(){
        Map<LocalDate,Evento> mapOrdenado = new TreeMap<>(eventoMap);
        return mapOrdenado;
    }

    public Evento obterProximoEvento(){
        Evento proxEvento = null;
        LocalDate dataAtual = LocalDate.MAX;
        for( LocalDate l: eventoMap.keySet()){
            if(l.isBefore(dataAtual)){
                dataAtual = l;
                proxEvento = eventoMap.get(l);

            }
        }
        return proxEvento;
    }

    public static void main(String[] args) {
        AgendaDeEventos agenda1 = new AgendaDeEventos();

        agenda1.adicionarEvento(LocalDate.of(2005,6,2),"ribamar","teatro");
        agenda1.adicionarEvento(LocalDate.of(2003,3,3),"pai","obra");
        agenda1.adicionarEvento(LocalDate.of(2002,2,4),"deus","santuário");

        System.out.println("proximo evento");
        System.out.println(agenda1.obterProximoEvento());
        System.out.println("exibir em ordem");
        System.out.println( agenda1.exibirEmOrdem());
    }


}
