package com.rakib.Composeui.model

import com.rakib.Composeui.R

object DataDummy {
    val product = Product(
        1,
        "Nike Air Max 100",
        240.00,
        110,
        R.drawable.shooe_tilt_1,
        "Trending Now"

    )

    val productList = listOf(
        product,
        product.copy(
            2,
            "Nike Air Max 97",
            240.00,
            100,
            R.drawable.shoe_tilt_2,
            "Trending Now"
        ),
        product.copy(
            3,
            "Nike Air Max 97",
            220.00,
            100,
            R.drawable.shoe_tilt_2,
            "Trending Now"
        )

    )
}