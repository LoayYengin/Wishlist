package com.example.wishlist

class WishFetcher {
    companion object {
//        val name = listOf("Dahlia Cline", "Kevin Miranda")
        val name = listOf("Dahlia Cline", "Kevin Miranda", "Kaya Austin", "Laila Calderon", "Marquise Rhodes", "Fletcher Patel", "Luz Barron", "Kamren Dudley", "Jairo Foster", "Lilah Sandoval", "Ansley Blake", "Slade Sawyer", "Jaelyn Holmes", "Phoenix Bright", "Ernesto Gould")
//        val url = listOf("url1", "url2", "url3", "url4", "url5", "url6", "url7", "url8", "url9", "url1")
//        val price = listOf("1.00", "2.00", "3.00", "4.00", "5.00", "6.00", "7.00", "8.00", "9.00", "1.00" )

        val url = "url"
        val price = "123.00"

        val nameList = mutableListOf<String>()
        val urlList = mutableListOf<String>()
        val priceList = mutableListOf<String>()

        fun addWishes(name: String, url: String, price: String) {
            nameList.add(name)
            urlList.add(url)
            priceList.add(price)

        }

        // update for loop range
        fun getWishes(): MutableList<Wish> {
            var wishes : MutableList<Wish> = ArrayList()
            for (i in nameList.indices) {
                val wish = Wish(nameList[i], urlList[i], priceList[i])
                wishes.add(wish)
            }
            return wishes
        }

//        // update for loop range
//        fun getWishes(): MutableList<Wish> {
//            var wishes : MutableList<Wish> = ArrayList()
//            for (i in 0..wishCount) {
//                val wish = Wish(nameList[i], urlList[i], priceList[i])
//                wishes.add(wish)
//            }
//            return wishes
//        }
    }
}