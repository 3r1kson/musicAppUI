package com.example.musicappui.ui.theme

import androidx.annotation.DrawableRes
import com.example.musicappui.R

data class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_queue_music_24, "Playlist"),
    Lib(R.drawable.baseline_mic_external_on_24, "Artists"),
    Lib(R.drawable.baseline_album_24, "Album"),
    Lib(R.drawable.baseline_music_note_24, "Songs"),
    Lib(R.drawable.baseline_compare_arrows_24, "Genre"),
)