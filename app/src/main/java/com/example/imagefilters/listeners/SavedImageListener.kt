package com.example.imagefilters.listeners

import java.io.File

interface SavedImageListener {
    fun onImageClicked(file: File)
}