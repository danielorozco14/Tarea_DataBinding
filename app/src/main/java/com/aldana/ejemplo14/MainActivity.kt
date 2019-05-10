package com.aldana.ejemplo14


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.aldana.ejemplo14.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var scoreViewModel: ScoreViewModel
    private lateinit var mainBinding: ActivityMainBinding
    lateinit var score: ScoreData


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //score= ScoreData()

        //scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel::class.java)

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainBinding.setLifecycleOwner(this)
        score = ScoreData(0,0)

        //displayScore(tv_score_team_a,scoreViewModel.scoreTeamA)

        // displayScore(tv_score_team_b,scoreViewModel.scoreTeamB)

        // TODO: El ViewModel es restaurado si ya existía, si no, se crea uno nuevo.
        // TODO: Recuerde que el ViewModel solo sobrevive a cambios de configuración y no a la destrucción de la aplicación

    }


    // TODO: Accediendo y modificando datos almacenados en el ViewModel según el método utilizado

    fun addOneTeamA(v: View) {
       // score.scoreTeamA++
        score=ScoreData(++score.scoreTeamA,score.scoreTeamB)
        mainBinding.setVariable(BR.ScoreXML,score)
        mainBinding.executePendingBindings()
        //displayScore(tv_score_team_a,++scoreViewModel.scoreTeamA)
      //  displayScoreA(score, activity)



    }

    fun addOneTeamB(v: View) {
        score=ScoreData(score.scoreTeamA,++score.scoreTeamB)
        mainBinding.setVariable(BR.ScoreXML,score)
        mainBinding.executePendingBindings()
        // displayScore(tv_score_team_b,++scoreViewModel.scoreTeamB)
    }

    fun addTwoTeamA(v: View) {
        score=ScoreData(2+score.scoreTeamA,score.scoreTeamB)
        mainBinding.setVariable(BR.ScoreXML,score)
        mainBinding.executePendingBindings()
        //scoreViewModel.scoreTeamA += 2
        //displayScore(tv_score_team_a,scoreViewModel.scoreTeamA)
    }

    fun addTwoTeamB(v: View) {
        score=ScoreData(score.scoreTeamA,2+score.scoreTeamB)
        mainBinding.setVariable(BR.ScoreXML, score)
        mainBinding.executePendingBindings()
        //scoreViewModel.scoreTeamB += 2
        //displayScore(tv_score_team_b,scoreViewModel.scoreTeamB)
    }

    fun addThreeTeamA(v: View) {
        score=ScoreData(3+score.scoreTeamA,score.scoreTeamB)
        mainBinding.setVariable(BR.ScoreXML,score)
        mainBinding.executePendingBindings()
        // scoreViewModel.scoreTeamA += 3
        // displayScore(tv_score_team_a,scoreViewModel.scoreTeamA)
    }

    fun addThreeTeamB(v: View) {
        score=ScoreData(score.scoreTeamA,3+score.scoreTeamB)
        mainBinding.setVariable(BR.ScoreXML,score)
        mainBinding.executePendingBindings()
        //scoreViewModel.scoreTeamB += 3
        //displayScore(tv_score_team_b,scoreViewModel.scoreTeamB)
    }

    fun resetScores(v: View) {
        score=ScoreData(0,0)
        mainBinding.setVariable(BR.ScoreXML,score)
        mainBinding.executePendingBindings()
        //scoreViewModel.scoreTeamA = 0
        // scoreViewModel.scoreTeamB = 0

        //displayScore(tv_score_team_a,scoreViewModel.scoreTeamA)

        // displayScore(tv_score_team_b,scoreViewModel.scoreTeamB)
    } // TODO: Limpiando datos

    fun displayScoreA(v: TextView, score: Int) {
        //v.text = score.toString()
       // activity.setVariable(BR.scoreTeamA, s)
        //activity.executePendingBindings()

    }


}
