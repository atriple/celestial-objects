package com.atriple.study.celestial_objects.model

import com.atriple.study.celestial_objects.R


fun generate() : List<CelestialObject>{
    return listOf(
        CelestialObject(
            "Mercury",
            "Planet",
            "The Swiftest Planet",
            "Solar System",
            """
                Mercury is the smallest and innermost planet in the Solar System. 
                Its orbit around the Sun takes 87.97 days, the shortest of all the planets in the Solar System. 
                It is named after the Roman deity Mercury, the messenger of the gods.
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Terrestrial
                • Radius: 2439,7 kilometers
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Mercury_(planet)",
            R.drawable.img_mercury
        ),
        CelestialObject(
            "Venus",
            "Planet",
            "Planetary Hot Spot",
            "Solar System",
            """
                Venus is the second planet from the Sun and our closest planetary neighbor. 
                Similar in structure and size to Earth, Venus spins slowly in the opposite direction from most planets. 
                Its thick atmosphere traps heat in a runaway greenhouse effect, making it the hottest planet 
                in our solar system with surface temperatures hot enough to melt lead. Glimpses below 
                the clouds reveal volcanoes and deformed mountains.

                Venus is named for the ancient Roman goddess of love and beauty, who was known as Aphrodite to the Ancient Greeks.
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Terrestrial
                • Radius: 6,052 kilometers
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Venus",
            R.drawable.img_venus
        ),
        CelestialObject(
            "Earth",
            "Planet",
            "The Home Planet",
            "Solar System",
            """
                Earth is the third planet from the Sun and the only astronomical object known to harbor life. 
                According to radiometric dating estimation and other evidence, Earth formed over 
                4.5 billion years ago. Earth's gravity interacts with other objects in space, 
                especially the Sun and the Moon, which is Earth's only natural satellite. 
                Earth orbits around the Sun in 365.256 solar days, a period known as an Earth sidereal year. 
                During this time, Earth rotates about its axis 366.256 times, that is, a sidereal year has 366.256 sidereal days
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Terrestrial
                • Radius: 6731 kilometers
                • Number of moons : 1
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Earth",
            R.drawable.img_earth
        ),
        CelestialObject(
            "Mars",
            "Planet",
            "The Red Planet",
            "Solar System",
            """
                Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System after Mercury.
                In English, Mars carries the name of the Roman god of war and is often referred to as the 'Red Planet'.
                The latter refers to the effect of the iron oxide prevalent on Mars' surface, which gives it a reddish-
                appearance distinctive among the astronomical bodies visible to the naked eye. Mars is a terrestrial-
                planet with a thin atmosphere, having surface features reminiscent both of the impact craters of the Moon-
                and the valleys, deserts, and polar ice caps
                of Earth.
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Terrestrial
                • Radius: 3390 kilometers
                • Number of moons : 2
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Mars",
            R.drawable.img_mars
        ),
        CelestialObject(
            "Jupiter",
            "Planet",
            "The Grandest Planet",
            "Solar System",
            """
                Jupiter is the fifth planet from our Sun and is, by far, the largest planet in the solar 
                system – more than twice as massive as all the other planets combined. Jupiter's stripes 
                and swirls are actually cold, windy clouds of ammonia and water, floating in an atmosphere 
                of hydrogen and helium. Jupiter’s iconic Great Red Spot is a giant storm bigger than Earth 
                that has raged for hundreds of years.
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Gas Giant
                • Radius: 142984 kilometers
                • Number of moons : 79
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Jupiter",
            R.drawable.img_jupiter
        ),
        CelestialObject(
            "Saturn",
            "Planet",
            "The Ringed Planet",
            "Solar System",
            """
Saturn is the sixth planet from the Sun and the second largest planet in our solar system. Adorned with a dazzling system of icy rings, Saturn is unique among the planets. It is not the only planet to have rings, but none are as spectacular or as complex as Saturn's. Like fellow gas giant Jupiter, Saturn is a massive ball made mostly of hydrogen and helium.

Surrounded by more than 60 known moons, Saturn is home to some of the most fascinating landscapes in our solar system. From the jets of water that spray from Enceladus to the methane lakes on smoggy Titan, the Saturn system is a rich source of scientific discovery and still holds many mysteries.

The farthest planet from Earth discovered by the unaided human eye, Saturn has been known since ancient times. The planet is named for the Roman god of agriculture and wealth, who was also the father of Jupiter.
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Gas Giant
                • Radius: 58232 kilometers
                • Number of moons : 82
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Saturn",
            R.drawable.img_saturn
        ),
        CelestialObject(
            "Uranus",
            "Planet",
            "The Sideways Planet",
            "Solar System",
            """
The seventh planet from the Sun with the third largest diameter in our solar system, Uranus is very cold and windy. The ice giant is surrounded by 13 faint rings and 27 small moons as it rotates at a nearly 90-degree angle from the plane of its orbit. This unique tilt makes Uranus appear to spin on its side, orbiting the Sun like a rolling ball.

The first planet found with the aid of a telescope, Uranus was discovered in 1781 by astronomer William Herschel, although he originally thought it was either a comet or a star. It was two years later that the object was universally accepted as a new planet, in part because of observations by astronomer Johann Elert Bode.

William Herschel tried unsuccessfully to name his discovery Georgium Sidus after King George III. Instead the planet was named for Uranus, the Greek god of the sky, as suggested by Johann Bode.
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Ice Giant
                • Radius: 25362 kilometers
                • Number of moons : 27
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Uranus",
            R.drawable.img_uranus
        ),
        CelestialObject(
            "Neptune",
            "Planet",
            "The Windiest Planet",
            "Solar System",
            """
                Jupiter is the fifth planet from our Sun and is, by far, the largest planet in the solar 
                system – more than twice as massive as all the other planets combined. Jupiter's stripes 
                and swirls are actually cold, windy clouds of ammonia and water, floating in an atmosphere 
                of hydrogen and helium. Jupiter’s iconic Great Red Spot is a giant storm bigger than Earth 
                that has raged for hundreds of years.
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Gas Giant
                • Radius: 142984 kilometers
                • Number of moons : 79
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Jupiter",
            R.drawable.img_jupiter
        ),
        CelestialObject(
            "Neptune",
            "Planet",
            "The Windiest Planet",
            "Solar System",
            """
Dark, cold and whipped by supersonic winds, ice giant Neptune is the eighth and most distant planet in our solar system. More than 30 times as far from the Sun as Earth, Neptune is the only planet in our solar system not visible to the naked eye. In 2011 Neptune completed its first 165-year orbit since its discovery in 1846.

Neptune is so far from the Sun that high noon on the big blue planet would seem like dim twilight to us. The warm light we see here on our home planet is roughly 900 times as bright as sunlight on Neptune.

The ice giant Neptune was the first planet located through mathematical calculations. Using predictions made by Urbain Le Verrier, Johann Galle discovered the planet in 1846. The planet is named after the Roman god of the sea, as suggested by Le Verrier
With a radius of 15,299.4 miles (24,622 kilometers), Neptune is about four times wider than Earth. If Earth were the size of a nickel, Neptune would be about as big as a baseball.

From an average distance of 2.8 billion miles (4.5 billion kilometers), Neptune is 30 astronomical units away from the Sun. One astronomical unit (abbreviated as AU), is the distance from the Sun to Earth. From this distance, it takes sunlight 4 hours to travel from the Sun to Neptune.
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Ice Giant
                • Radius: 24622 kilometers
                • Number of moons : 14
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Neptune",
            R.drawable.img_neptune
        ),
        CelestialObject(
            "Pluto",
            "Dwarf Planet",
            "Dwarf Planet",
            "Solar System",
            """
Pluto is a complex and mysterious world with mountains, valleys, plains, craters, and maybe glaciers. Discovered in 1930, Pluto was long considered our solar system's ninth planet. But after the discovery of similar intriguing worlds deeper in the distant Kuiper Belt, icy Pluto was reclassified as a dwarf planet.

Pluto is orbited by five known moons, the largest of which is Charon. Charon is about half the size of Pluto itself, making it the largest satellite relative to the planet it orbits in our solar system. Pluto and Charon are often referred to as a "double planet."

Pluto is named after the Roman god of the underworld.
            """.trimIndent().replace("\n", " "),
            """
                • Planet type: Dwarf
                • Radius: 1151 kilometers
                • Number of moons : 5
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Pluto",
            R.drawable.img_pluto
        ),
        CelestialObject(
            "Sun",
            "Star",
            "Our Star",
            "Solar System",
            """
                The Sun is a yellow dwarf star, a hot ball of glowing gases at the heart of our solar system.
                Its gravity holds the solar system together, keeping everything – from the biggest planets
                to the smallest particles of debris – in its orbit. The connection and interactions between
                the Sun and Earth drive the seasons, ocean currents, weather, climate, radiation belts and auroras.
                Though it is special to us, there are billions of stars like our Sun scattered across the Milky Way galaxy.
            """.trimIndent().replace("\n", " "),
            """
                • Star type: Yellow dwarf
                • Radius: 695508 kilometers
            """.trimIndent(),
            "https://en.wikipedia.org/wiki/Sun",
            R.drawable.img_sun
        )
    )
}