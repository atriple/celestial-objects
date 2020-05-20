package com.atriple.study.celestial_objects.model

import org.junit.Test

import org.junit.Assert.*

class CelestialObjectsListTest {

    @Test
    fun generate_earthName() {
        val listOfCelestialObject : List<CelestialObject> = generate()
        assertEquals("Earth", listOfCelestialObject[0].name)
    }
}