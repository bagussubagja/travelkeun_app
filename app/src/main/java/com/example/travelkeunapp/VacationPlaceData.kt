package com.example.travelkeunapp

object VacationPlaceData {
    private val placeName = arrayOf("Barusen Hill", "Grojogan Sewu Tawangwangun", "Gunung Bromo", "Kawah Putih", "Kota Lama Semarang", "Pantai Balekembang", "Pantai Sendang Biru", "Pulau Panjang", "Pura Uluwatu", "Safari Park", "Sawah Tegalalang", "Tebing Keraton")

    private val placeDesc = arrayOf(
        "An entertainment destination at the foot of the hill with an aquatic center and gardens amidst beautiful mountain views. South Bandung with its cool and cold atmosphere is always an option for a vacation. One of them is Barusen Hills Ciwidey. Tourist attractions located in Ciwidey are visited by many tourists. Barusen Hills focuses on tourism with beautiful, cool views, and places to take selfies. The concept of an all-love park combined with a water park is suitable to be used as a vacation spot with loved ones. It is located quite far from the city so that the beauty of this tourism location is guaranteed.",
        "Grojogan Sewu is a waterfall in Central Java Province. It is located in Tawangmangu District, Karanganyar Regency, Central Java. Grojogan Sewu Waterfall is located on the slopes of Mount Lawu. Grojogan Sewu is located about 27 km east of Karanganyar City. The foot of Mount Lawu is indeed enchanting, there are several views and beauty that are mandatory to be enjoyed. In fact, the exotic has become a myth for lovers who come to this place. It's not the waterfall, which is a thousand in fact. However, the number of steps that are here. it is said that there are 1200 stairs that must be stepped while you are here. You can already imagine how difficult it is to get to this point.",
        "Mount Bromo or in the Tenggerese spelled \"Brama\", also called the Tengger Caldera, is an active volcano in East Java, Indonesia. According to history, Mount Bromo is closely related to Hindus. It is said that based on the story there had been a war during the Majapahit kingdom and finally the natives fled to find a new place to live, partly to the island of Bali and partly to Mount Bromo. The name Bromo itself is taken from the Sanskrit \"Brahma\" which means the main god of Hinduism. Therefore, Mount Bromo / Brahma is believed to be a sacred mountain by the Tengger tribe.",
        "Kawah Putih is a tourist spot in West Java which is located in Alam Endah Village, Rancabali District, Bandung Regency, West Java, which is located at the foot of Mount Patuha. Kawah Putih is a lake formed from the eruption of Mount Patuha. As the name implies, the soil in this area is white from a mixture of sulfur elements. In addition to the white soil, the lake water in the white crater area of Bandung also has a greenish-white color and can change color based on the sulfur content it contains.",
        "The Old City of Semarang is an area in Semarang which became a trading center in the 19-20 centuries. At that time, to secure the residents and their territory, the fort was built, which was named Vijfhoek fort. To speed up the route of communication between the three gates of the fort, transportation roads were made, with the main road named Heerenstraat.",
        "Balekambang Beach is a beach on the south coast which is located on the edge of the Indonesian Ocean. Administratively, it belongs to the Hamlet of SumberJambe, Srigonco Village, Bantur District, Malang Regency, East Java and is one of the attractions in Malang Regency since 1985 until now. Balekambang Beach is one of the beautiful beaches that must be visited in Malang, East Java. The charm is no less interesting than the beaches in Bali.",
        "Sendang Biru Beach is a beach on the south coast located on the edge of the Indonesian Ocean. Administratively, it is located in Sendang Biru Hamlet, Tambakrejo Village, Sumbermanjing Wetan District, Malang Regency, East Java. At this Sendang Biru Beach tourist location, visitors can see a stretch of clean white sand and views of fishing boats that are neatly arranged along the shoreline or in the middle of the ocean.",
        "Panjang Island is a small island 2.4 km from Kartini Beach, Jepara Regency. The island has a lighthouse located in the west and populated areas such as the pier and mosque in the east, while the center is tropical forest. Administratively, this island is in the district of Jepara. But according to the Jepara Regency Tourism and Culture Office, this island has been contracted to the private sector for more than 30 years starting from 1987,",
        "Pura Luhur Uluwatu or Uluwatu Temple is a temple located in the Pecatu Traditional Village area, South Kuta District, Badung Regency. The location of the temple is located on a coral hill with a height of about 97 meters above sea level. Because the location of the temple is on a rock cliff, this temple is named Uluwatu, which in Sanskrit means the peak of the rock. The location of the establishment of the Luhur Uluwatu temple building, makes tourists who come to visit, not only can enjoy a sacred and religious atmosphere, but also beautiful and unique views.",
        "Home to over a thousand amazing animals - Bali Safari Park is your destination for an adventurous, fun, educational experience more than just a safari. Our park represents more than 120 species, including rare & endangered species - the Komodo Dragon, Orangutan, and the Bali Starling bird. Bali Safari Park is at the frontline of wildlife conservation in Indonesia. We are actively involved in ensuring the future survival and wellbeing of many Indonesian animal species.",
        "The beauty of Ubud is reflected in its lush forests, beautiful hills, and of course a very neat expanse of rice fields called Tegalalang Rice Terrace. This super instagrammable rice field is a rice terrace arranged according to the traditional Balinese irrigation system called \"subak.\". Not only is it a beautiful stretch of terraced rice fields, but there are also views from Pejeng Village and Campuhan Hill which combine to create an instagramable terraced landscape.",
        "Tebing Keraton can be simply interpreted as “The Royal (Palace) Cliff”. The name perfectly illustrates the majestic vista of north Bandung’s fascinating natural landscapes as one stands on the cliff. At 1,200 meters above sea level, Tebing Keraton is located within the Ir H Juanda Forest Park, at Ciburial Village, Cimenyan sub-district, in the Bandung Regency. At the main area, there is a rock that bulges over the edge of the cliff which makes it a perfect place to observe over the incredible natural surroundings.\n" )

    private val placeImages = intArrayOf(R.drawable.barusen_hill_jabar, R.drawable.grojogan_sewu_tawangwangun_jateng, R.drawable.gunung_bromo_jatim, R.drawable.kawah_putih_jabar, R.drawable.kota_lama_jateng, R.drawable.pantai_balekembang_jatim, R.drawable.pantai_sendang_biru_jatim, R.drawable.pulau_panjang_jateng, R.drawable.pura_uluwatu_bali, R.drawable.safari_park_bali, R.drawable.sawah_tegalalang_bali, R.drawable.tebing_keraton_jabar)

    val listData: ArrayList<Vacation>
    get() {
        val list = arrayListOf<Vacation>()
        for (position in placeName.indices) {
            val vacation = Vacation()
            vacation.name = placeName[position]
            vacation.description = placeDesc[position]
            vacation.image = placeImages[position]
            list.add(vacation)
        }
        return list
    }
}