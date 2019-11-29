package miagem1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {
    // On souhaite tester la classe QuestionAChoixMultiple
    private QuestionAChoixMultiple qM;
    @Test
    public void getEnonce() {
        /* Before */
        // Une instance de question à choix multiple
        List<Integer> reponses = new ArrayList<>();
        reponses.add(1);
        reponses.add(4);
        qM = new QuestionAChoixMultiple("", reponses);
    }

    @Test
    public void testGetScoreForIndiceBonnesReponses() {
    /* When */
    // On demande les indices des bonnes réponses
    List<Integer> reponses = new ArrayList<>();
    reponses.add(1);
    reponses.add(4);

    /* And */
    // On demande le score de l'indice à la question
    float score = 0;
    for (int i : reponses){
        score += qM.getScoreForIndice(i);
    }

    /* Then */
    // Le score obtenu est 100
    assertEquals(100f, score, 0.01f);
}

    @Test
    public void testGetScoreForIndiceMauvaiseReponse() {
        //When : on demande l'indice de la réponse
        int indiceEtu = 1;
        //And : on demande le score de l'indice à la question
        float resScore = qM.getScoreForIndice(indiceEtu);
        //Then : le score obtenu est 0
        assertEquals(0f, resScore, 0.01f);
    }
}