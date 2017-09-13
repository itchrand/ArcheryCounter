package it.seahawk.archerycounter
/*
 ArcheryCounter: 0.1.0
 author: ac
 */
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var scoreArcherA: Int = 0
    var scoreArcherB: Int = 0
    var countXArcherA: Int = 0
    var countXArcherB: Int = 0
    var countArrowsArcherA: Int = 0
    var countArrowsArcherB: Int = 0
    var lastScoresA: IntArray = intArrayOf(0, 0, 0)
    var lastScoresB: IntArray = intArrayOf(0, 0, 0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * Displays the given score for Archer A.
     */
    fun displayScoresForArcherA() {
        var toUpdateView = findViewById(R.id.archer_a_score) as TextView
        toUpdateView.text = scoreArcherA.toString()
        toUpdateView = findViewById(R.id.archer_a_x_count) as TextView
        toUpdateView.text = countXArcherA.toString()
        toUpdateView = findViewById(R.id.archer_a_count) as TextView
        toUpdateView.text = countArrowsArcherA.toString()
        toUpdateView = findViewById(R.id.archer_a_last_score_1) as TextView
        toUpdateView.text = lastScoresA[0].toString()
        toUpdateView = findViewById(R.id.archer_a_last_score_2) as TextView
        toUpdateView.text = lastScoresA[1].toString()
        toUpdateView = findViewById(R.id.archer_a_last_score_3) as TextView
        toUpdateView.text = lastScoresA[2].toString()
    }

    /**
     * Displays the given score for Archer B.
     */
    fun displayScoresForArcherB() {
        var toUpdateView = findViewById(R.id.archer_b_score) as TextView
        toUpdateView.text = scoreArcherB.toString()
        toUpdateView = findViewById(R.id.archer_b_x_count) as TextView
        toUpdateView.text = countXArcherB.toString()
        toUpdateView = findViewById(R.id.archer_b_count) as TextView
        toUpdateView.text = countArrowsArcherB.toString()
        toUpdateView = findViewById(R.id.archer_b_last_score_1) as TextView
        toUpdateView.text = lastScoresB[0].toString()
        toUpdateView = findViewById(R.id.archer_b_last_score_2) as TextView
        toUpdateView.text = lastScoresB[1].toString()
        toUpdateView = findViewById(R.id.archer_b_last_score_3) as TextView
        toUpdateView.text = lastScoresB[2].toString()
    }

    /**
     * Update last scores of Archer A.
     */
    fun updateScoresA(score: Int) {
        scoreArcherA = scoreArcherA + score
        countArrowsArcherA = countArrowsArcherA + 1
        when (countArrowsArcherA) {
            1 -> lastScoresA[0] = score
            2 -> lastScoresA[1] = score
            3 -> lastScoresA[2] = score
            else -> {
                lastScoresA[0] = lastScoresA[1]
                lastScoresA[1] = lastScoresA[2]
                lastScoresA[2] = score
            }
        }
    }

    /**
     * Update last scores of Archer B.
     */
    fun updateScoresB(score: Int) {
        scoreArcherB = scoreArcherB + score
        countArrowsArcherB = countArrowsArcherB + 1
        when (countArrowsArcherB) {
            1 -> lastScoresB[0] = score
            2 -> lastScoresB[1] = score
            3 -> lastScoresB[2] = score
            else -> {
                lastScoresB[0] = lastScoresB[1]
                lastScoresB[1] = lastScoresB[2]
                lastScoresB[2] = score
            }
        }
    }

    /**
     * Add 10 points + X to score of Archer A.
     */
    fun scoreTenX(view: View) {
        updateScoresA(10)
        countXArcherA = countXArcherA + 1
        displayScoresForArcherA()
    }

    /**
     * Add 10 points to score of Archer A.
     */
    fun scoreTen(view: View) {
        updateScoresA(10)
        displayScoresForArcherA()
    }

    /**
     * Add 9 points to score of Archer A.
     */
    fun scoreNine(view: View) {
        updateScoresA(9)
        displayScoresForArcherA()
    }

    /**
     * Add 8 points to score of Archer A.
     */
    fun scoreEight(view: View) {
        updateScoresA(8)
        displayScoresForArcherA()
    }

    /**
     * Add 7 points to score of Archer A.
     */
    fun scoreSeven(view: View) {
        updateScoresA(7)
        displayScoresForArcherA()
    }

    /**
     * Add 6 points to score of Archer A.
     */
    fun scoreSix(view: View) {
        updateScoresA(6)
        displayScoresForArcherA()
    }

    /**
     * Add 5 points to score of Archer A.
     */
    fun scoreFive(view: View) {
        updateScoresA(5)
        displayScoresForArcherA()
    }

    /**
     * Add 4 points to score of Archer A.
     */
    fun scoreFour(view: View) {
        updateScoresA(4)
        displayScoresForArcherA()
    }

    /**
     * Add 3 points to score of Archer A.
     */
    fun scoreThree(view: View) {
        updateScoresA(3)
        displayScoresForArcherA()
    }

    /**
     * Add 2 points to score of Archer A.
     */
    fun scoreTwo(view: View) {
        updateScoresA(2)
        displayScoresForArcherA()
    }

    /**
     * Add 1 point to score of Archer A.
     */
    fun scoreOne(view: View) {
        updateScoresA(1)
        displayScoresForArcherA()
    }

    /**
     * Add 0 points to score of Archer A.
     */
    fun scoreMiss(view: View) {
        updateScoresA(0)
        displayScoresForArcherA()
    }


    /**
     * Add 10 points + X to score of Archer B.
     */
    fun scoreTenX_b(view: View) {
        updateScoresB(10)
        countXArcherB = countXArcherB + 1
        displayScoresForArcherB()
    }

    /**
     * Add 10 points to score of Archer B.
     */
    fun scoreTen_b(view: View) {
        updateScoresB(10)
        displayScoresForArcherB()
    }

    /**
     * Add 9 points to score of Archer B.
     */
    fun scoreNine_b(view: View) {
        updateScoresB(9)
        displayScoresForArcherB()
    }

    /**
     * Add 8 points to score of Archer B.
     */
    fun scoreEight_b(view: View) {
        updateScoresB(8)
        displayScoresForArcherB()
    }

    /**
     * Add 7 points to score of Archer B.
     */
    fun scoreSeven_b(view: View) {
        updateScoresB(7)
        displayScoresForArcherB()
    }

    /**
     * Add 6 points to score of Archer B.
     */
    fun scoreSix_b(view: View) {
        updateScoresB(6)
        displayScoresForArcherB()
    }

    /**
     * Add 5 points to score of Archer B.
     */
    fun scoreFive_b(view: View) {
        updateScoresB(5)
        displayScoresForArcherB()
    }

    /**
     * Add 4 points to score of Archer B.
     */
    fun scoreFour_b(view: View) {
        updateScoresB(4)
        displayScoresForArcherB()
    }

    /**
     * Add 3 points to score of Archer B.
     */
    fun scoreThree_b(view: View) {
        updateScoresB(3)
        displayScoresForArcherB()
    }

    /**
     * Add 2 points to score of Archer B.
     */
    fun scoreTwo_b(view: View) {
        updateScoresB(2)
        displayScoresForArcherB()
    }

    /**
     * Add 1 point to score of Archer B.
     */
    fun scoreOne_b(view: View) {
        updateScoresB(1)
        displayScoresForArcherB()
    }

    /**
     * Add 0 points to score of Archer B.
     */
    fun scoreMiss_b(view: View) {
        updateScoresB(0)
        displayScoresForArcherB()
    }

    /**
     * Reset scores for Archer A and Archer B.
     */
    fun resetScores(view: View) {
        scoreArcherA = 0
        scoreArcherB = 0
        countXArcherA = 0
        countXArcherB = 0
        countArrowsArcherA = 0
        countArrowsArcherB = 0
        for (i in lastScoresA.indices)
            lastScoresA[i] = 0
        for (i in lastScoresB.indices)
            lastScoresB[i] = 0

        displayScoresForArcherA()
        displayScoresForArcherB()
    }
}
