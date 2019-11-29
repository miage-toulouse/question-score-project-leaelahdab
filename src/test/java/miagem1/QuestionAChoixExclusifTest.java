package miagem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {
    // On cherche à tester la classe QuestionAChoixExclusif
    private QuestionAChoixExclusif qE;

    @Before
    public void setUp() throws Exception {
        /* Given */
        // Une instance de question à choix exclusif
        qE = new QuestionAChoixExclusif("Quelle est la couleur du ciel?", 2);
    }

    @Test
    public void testGetEnonce() {
        /* When */
        // On demande son énoncé à la question
        String qenonce = qE.getEnonce();

        /* Then */
        // L'énoncé retourné est l'énoncé fourni à la construction de la question
        assertEquals("Quelle est la couleur du ciel?", qE);
    }

    @Test
    public void testGetScoreForIndiceBonneReponse() {
        /* When */
        // On demande l'indice de la réponse
        int ind = 2;

        /* And */
        // On demande le score de l'indice à la question
        float score = qE.getScoreForIndice(ind);

        /* Then */
        // Le score obtenu est 100
        assertEquals(100f, score, 0.01f);
    }

    @Test
    public void testGetScoreForIndiceMauvaiseReponse() {
        //When : on demande l'indice de la réponse
        int indiceEtu = 1;
        //And : on demande le score de l'indice à la question
        float resScore = qE.getScoreForIndice(indiceEtu);
        //Then : le score obtenu est 0
        assertEquals(0f, resScore, 0.01f);
    }
}