package com.example.a30joursderecettes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30joursderecettes.R

data class Recipe(
    val day : Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val duree : String,
    @StringRes val ingredients : Int

)
val recipes = listOf(
    Recipe(1, R.drawable.chakchouka, R.string.recette_1, "25 min", R.string.description_1),
    Recipe(2, R.drawable.couscous, R.string.recette_2, "1 h 15", R.string.description_2),
    Recipe(3, R.drawable.brik, R.string.recette_3, "20 min", R.string.description_3),
    Recipe(4, R.drawable.pates, R.string.recette_4, "30 min", R.string.description_4),
    Recipe(5, R.drawable.salade_tunisienne, R.string.recette_5, "15 min", R.string.description_5),
    Recipe(6, R.drawable.lablabi, R.string.recette_6, "40 min", R.string.description_6),
    Recipe(7, R.drawable.ojja, R.string.recette_7, "30 min", R.string.description_7),
    Recipe(8, R.drawable.riz, R.string.recette_8, "35 min", R.string.description_8),
    Recipe(9, R.drawable.gratin, R.string.recette_9, "45 min", R.string.description_9),
    Recipe(10, R.drawable.pizza, R.string.recette_10, "40 min", R.string.description_10),
    Recipe(11, R.drawable.soupe, R.string.recette_11, "30 min", R.string.description_11),
    Recipe(12, R.drawable.sandwich, R.string.recette_12, "15 min", R.string.description_12),
    Recipe(13, R.drawable.poulet, R.string.recette_13, "50 min", R.string.description_13),
    Recipe(14, R.drawable.poisson, R.string.recette_14, "35 min", R.string.description_14),
    Recipe(15, R.drawable.makrouna, R.string.recette_15, "40 min", R.string.description_15),
    Recipe(16, R.drawable.mloukhia, R.string.recette_16, "2 h", R.string.description_16),
    Recipe(17, R.drawable.kafteji, R.string.recette_17, "35 min", R.string.description_17),
    Recipe(18, R.drawable.fricasse, R.string.recette_18, "45 min", R.string.description_18),
    Recipe(19, R.drawable.tajine_tunisien, R.string.recette_19, "40 min", R.string.description_19),
    Recipe(20, R.drawable.pommes_four, R.string.recette_20, "35 min", R.string.description_20),
    Recipe(21, R.drawable.crepes, R.string.recette_21, "20 min", R.string.description_21),
    Recipe(22, R.drawable.gateau, R.string.recette_22, "50 min", R.string.description_22),
    Recipe(23, R.drawable.muffins, R.string.recette_23, "30 min", R.string.description_23),
    Recipe(24, R.drawable.cookies, R.string.recette_24, "25 min", R.string.description_24),
    Recipe(25, R.drawable.creme_caramel, R.string.recette_25, "45 min", R.string.description_25),
    Recipe(26, R.drawable.salade_fruits, R.string.recette_26, "15 min", R.string.description_26),
    Recipe(27, R.drawable.smoothie, R.string.recette_27, "10 min", R.string.description_27),
    Recipe(28, R.drawable.tarte, R.string.recette_28, "50 min", R.string.description_28),
    Recipe(29, R.drawable.pancakes, R.string.recette_29, "20 min", R.string.description_29),
    Recipe(30, R.drawable.biscuits, R.string.recette_30, "30 min", R.string.description_30)
)