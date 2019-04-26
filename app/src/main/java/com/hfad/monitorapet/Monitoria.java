package com.hfad.monitorapet;

import android.provider.Telephony;

import java.util.HashMap;

public class Monitoria {
    private static HashMap<String, String> monitores = new HashMap<>();
    private static String monitor = "";

    // Primeira opção
    public static final int ATIVIDADE = 0;
    public static final int REFEICOES = 1;

    private static final String [] credItens =
            {"Atividade", "Refeições"};

    private static int credenciar = -1;

    // Atividades
    public static final int ATV_ED_ED = 0;
    public static final int ATV_MESA_1 = 1;
    public static final int ATV_MESA_2 = 2;
    public static final int ATV_EA_EIMCLAA = 3;

    private static final String [] atvItens =
            {"ED / ED", "MESA REDONDA 1", "MESA REDONDA 2", "EA / EIMCLAA"};

    private static int atividade = -1;

    //Refeições
    public static final int REF_2_4_CAFE = 0;
    public static final int REF_2_4_ALMOCO = 1;
    public static final int REF_2_4_JANTAR = 2;
    public static final int REF_3_4_CAFE = 3;
    public static final int REF_3_4_ALMOCO = 4;
    public static final int REF_3_4_JANTAR = 5;
    public static final int REF_4_4_CAFE = 6;
    public static final int REF_4_4_ALMOCO = 7;
    public static final int REF_4_4_JANTAR = 8;

    private static final String [] refItens =
            {   "02/04 - Café da manhã", "02/04 - Almoço", "02/04 - Jantar",
                "03/04 - Café da manhã", "03/04 - Almoço", "03/04 - Jantar",
                "04/04 - Café da manhã", "04/04 - Almoço", "04/04 - Jantar" };

    private static int refeicao = -1;

    // Participantes
    private static HashMap<String, String> participantes = new HashMap<>();
    private static String participanteCPF;

    public static void Inicializar() {
        // Insere os dados dos monitores
        monitores.put("11166295699", "RODRIGO ALVES CALDEIRA");
        monitores.put("06068661164", "MARIA GABRIELA FERREIRA PEREIRA");
        monitores.put("01840210141", "ANA PAULA DE ALMEIDA OLIVEIRA");
        monitores.put("70128303107", "LIANDRA GOMES FERREIRA");
        monitores.put("70604996101", "LETÍCIA ASSIS");
        monitores.put("02228144207", "LAIR TÂNIA FERNANDA DE JESUS");
        monitores.put("03804299180", "GLEICE MAGALHÃES DE OLIVEIRA");
        monitores.put("04334269184", "MARIA CRISTINA ARANTES DA SILVA");
        monitores.put("61860421385", "IVANO IMPAMI");
        monitores.put("05241397175", "ANAIELY SANTANA MORAES");
        monitores.put("05241410104", "LEIDIELY GOMES MORAES");
        monitores.put("70919608159", "ISSUFI BADJI");
        monitores.put("62166010326", "NILS MENDES TAVARES");

        // Insere os dados dos participantes
        participantes.put("05543271123", "Herbert de Souza Andrade");
    }

    public static boolean validarMonitor(String cpf) {
        return monitores.containsKey(cpf);
    }

    public static void setCredenciar(int credenciar) {
        Monitoria.credenciar = credenciar;
    }

    public static int getCredenciar() {
        return Monitoria.credenciar;
    }

    public static String[] getCredItens() {
        return Monitoria.credItens;
    }

    public static void setAtividade(int atividade) {
        Monitoria.atividade = atividade;
        Monitoria.refeicao = -1;
    }

    public static int getAtividade() {
        return Monitoria.atividade;
    }

    public static String[] getAtvItens() {
        return Monitoria.atvItens;
    }

    public static void setRefeicoes(int refeicao) {
        Monitoria.refeicao = refeicao;
        Monitoria.atividade = -1;
    }

    public static int getRefeicoes() {
        return Monitoria.refeicao;
    }

    public static String[] getRefItens() {
        return Monitoria.refItens;
    }

    public static void setParticipanteCPF(String cpf){
        participanteCPF = cpf;
    }

    public static String getParticipanteCPF() {
        return participanteCPF;
    }

    public static String getParticipanteNome() {
        return Monitoria.participantes.get(Monitoria.participanteCPF);
    }

    public static boolean validarParticipante() {
        return participantes.containsKey(participanteCPF);
    }

    public static void setMonitor(String cpf) {
        Monitoria.monitor = cpf;
    }

    public static String getMonitor() {
        return Monitoria.monitor;
    }
}
