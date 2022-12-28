package com.sahil.snakegame

import android.app.Application
import com.sahil.snakegame.data.ScoreDatabase
import com.sahil.snakegame.data.ScoreRepository

class SnakeGameApplication : Application() {

    val dataBase by lazy { ScoreDatabase.getDatabase(this)}
    val repository by lazy { ScoreRepository(dataBase.scoreDao())}
}