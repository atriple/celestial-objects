package com.atriple.study.celestial_objects.model

import androidx.annotation.DrawableRes

data class CelestialObject(
    val name: String,
    val type: String,
    val title: String,
    val location: String,
    val description: String,
    val facts: String,
    val source: String,
    @DrawableRes val image: Int
)