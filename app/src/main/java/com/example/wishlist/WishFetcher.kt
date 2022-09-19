package com.example.wishlist

class WishFetcher {
    companion object {
        val name = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
        val url = "Welcome to Kotlin!"
        val price = "123.00"

        fun getWishes(): MutableList<Wish> {
            var wishes : MutableList<Wish> = ArrayList()
            for (i in 0..9) {
                val wish = Wish(name[i], url, price)
                wishes.add(wish)
            }
            return wishes
        }

    }
}