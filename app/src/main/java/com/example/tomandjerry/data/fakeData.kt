package com.example.tomandjerry.data

import com.example.tomandjerry.R
import com.example.tomandjerry.model.TomAccountOption
import com.example.tomandjerry.model.TomModel

val tomList = listOf(
    TomModel("Sport Tom", "He runs 1 meter... trips over his boot.\n.", 3, R.drawable.tom_3),
    TomModel("Tom the lover", "He loves one-sidedly... and is beaten by the other side.", 5, R.drawable.tom_2),
    TomModel("Tom the bomb", "He blows himself up before Jerry can catch him.", 10, R.drawable.tom_1),
    TomModel("Spy Tom", "Disguises itself as a table.\n" +
            "\n", 12, R.drawable.tom_6),
    TomModel("Frozen Tom","He was chasing Jerry, he froze after the first look\n", 6, R.drawable.tom_5),
    TomModel("Sleeping Tom","He doesn't chase anyone, he just snores in stereo.\n", 4, R.drawable.tom_4)
)


val tomSettings = listOf(
    TomAccountOption(R.drawable.settings_icon_container_1, "Change sleeping place"),
    TomAccountOption(R.drawable.settings_icon_container_2, "Meow settings"),
    TomAccountOption(R.drawable.settings_icon_container_3, "Password to open the fridge"),
)

val favoriteFoods = listOf(
    TomAccountOption(R.drawable.favorite_food_icon_container_1, "Mouses"),
    TomAccountOption(R.drawable.favorite_food_icon_container_2, "Last stolen meal"),
    TomAccountOption(R.drawable.favorite_food_icon_container_3, "Change sleep mood"),
)
