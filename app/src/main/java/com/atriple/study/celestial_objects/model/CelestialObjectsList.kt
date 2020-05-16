package com.atriple.study.celestial_objects.model

import com.atriple.study.celestial_objects.R


fun generate() : List<CelestialObject>{
    return listOf(
        CelestialObject(
            "Earth",
            "planet",
            "Lorem Ipsum",
            R.drawable.img_earth
        ),
        CelestialObject(
            "Mars",
            "Planet",
            """
                Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System after Mercury. 
                In English, Mars carries the name of the Roman god of war and is often referred to as the 'Red Planet'. 
                The latter refers to the effect of the iron oxide prevalent on Mars' surface, which gives it a reddish- 
                appearance distinctive among the astronomical bodies visible to the naked eye. Mars is a terrestrial- 
                planet with a thin atmosphere, having surface features reminiscent both of the impact craters of the Moon-
                 and the valleys, deserts, and polar ice caps 
                of Earth.
            """.trimIndent(),
            R.drawable.img_earth
        ),
        CelestialObject(
            "Mercury",
            "Planet",
            """
                Mercury is the smallest and innermost planet in the Solar System. 
                Its orbit around the Sun takes 87.97 days, the shortest of all the planets in the Solar System. 
                It is named after the Roman deity Mercury, the messenger of the gods.
            """.trimIndent(),
            R.drawable.img_earth
        )
    )
}