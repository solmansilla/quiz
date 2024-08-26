package org.example;

import java.util.ArrayList;
import java.util.List;

public class quiz {
    private List<Pregunta> preguntas;
    private int puntaje;

    public quiz() {
        preguntas = new ArrayList<Pregunta>();
        puntaje = 0;
    }

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }
    public void evaluarPregunta(int indicepregunta, int respuestaUsuario) {
        if(preguntas.get(indicepregunta).getrespuestaCorrecta() == respuestaUsuario);
        puntaje++;

    }

    public void mostrarPuntaje() {
        System.out.println("Su puntaje es: " + puntaje);
    }
}

