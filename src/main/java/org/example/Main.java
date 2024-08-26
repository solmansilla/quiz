package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        quiz quiz = new quiz();
        List<String> respuestas1 = new ArrayList<>();
        respuestas1.add("Negro");
        respuestas1.add("Verde");
        respuestas1.add("Blanco");
        respuestas1.add("Ninguno");
        Pregunta pregunta1 =
                new Pregunta ("De que color era el caballo  blanco de san martin?",
                        respuestas1, 3);
        quiz.agregarPregunta(pregunta1);

        pregunta1.mostarPreguntas();

    }
}