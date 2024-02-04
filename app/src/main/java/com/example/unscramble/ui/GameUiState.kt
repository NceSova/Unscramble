package com.example.unscramble.ui

data class GameUiState(
    val isHintUsed: Boolean = false,
    val currentHint: String = "",
    val currentScrambledWord: String = "",
    val currentWordCount: Int = 1,
    val score: Int = 0,
    val isGuessedWordWrong: Boolean = false,
    val isGameOver: Boolean = false
)
