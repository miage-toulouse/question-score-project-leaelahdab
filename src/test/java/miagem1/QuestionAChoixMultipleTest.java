package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {
    // On souhaite tester la classe QuestionAChoixMultiple
    private QuestionAChoixMultiple qM;

    @Before
    public void setUp() throws Exception{
        // Une instance de question à choix multiple
        ArrayList<Integer> reponses = new ArrayList<>();
        reponses.add(1);
        reponses.add(4);
        qM = new QuestionAChoixMultiple("", reponses);
    }


    @Test
    public void getEnonce() {
        /* Before */
        String qenonce = qM.getEnonce();
        assertEquals("", qenonce);
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
        // Vérifier si dans la liste, on retrouve la liste
        float score = qM.getScoreForIndice(reponses.get(0));
        score += qM.getScoreForIndice(reponses.get(1));
        /* Then */
        // Le score obtenu est 100
        assertEquals(100f, score, 0.01f);
    }

    @Test
    public void testGetScoreForIndiceMauvaisesReponses() {
        //When : on demande l'indice de la réponse
        List<Integer> reponses = new ArrayList<>();
        reponses.add(2);
        reponses.add(3);
        //And : on demande le score de l'indice à la question
        float score = qM.getScoreForIndice(reponses.get(0));
        score += qM.getScoreForIndice(reponses.get(1));
        //Then : le score obtenu est 0
        assertEquals(0f, score, 0.01f);
    }
}