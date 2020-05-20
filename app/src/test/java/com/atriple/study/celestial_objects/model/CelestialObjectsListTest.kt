package com.atriple.study.celestial_objects.model

import org.junit.Test

import org.junit.Assert.*

class CelestialObjectsListTest {
    private val listOfCelestialObject : List<CelestialObject> = generate()

    @Test
    fun generate_earthName() {
        assertEquals("Earth", listOfCelestialObject[0].name)
    }

    @Test
    fun generate_correctSize(){
        assertEquals(10, listOfCelestialObject.size)
    }
}