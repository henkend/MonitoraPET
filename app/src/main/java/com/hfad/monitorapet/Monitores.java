package com.hfad.monitorapet;

import java.util.HashMap;

public class Monitores {
    private static HashMap<String, String> monitores = new HashMap<>();

    public static void Inicializar() {
        // Insere os dados dos monitores
        monitores.put("06068661164", "MARIA GABRIELA FERREIRA PEREIRA");
        monitores.put("01840210141", "ANA PAULA DE ALMEIDA OLIVEIRA");
    }

    public static boolean validarMonitor(String cpf) {
        return monitores.containsKey(cpf);
    }
}
