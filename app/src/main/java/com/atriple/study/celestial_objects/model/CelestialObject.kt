package com.atriple.study.celestial_objects.model

import androidx.annotation.DrawableRes

data class CelestialObject(
    val name: String,
    val type: String,
    val location: String,
    val description: String,
    @DrawableRes val image: Int
)