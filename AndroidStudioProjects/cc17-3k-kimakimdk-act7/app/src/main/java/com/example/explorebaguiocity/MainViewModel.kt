package com.example.explorebaguiocity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _places = MutableLiveData<List<Place>>()
    val places: LiveData<List<Place>> get() = _places

    private val placeData = mapOf(
        "Parks" to listOf(
            Place("Burnham Park", R.drawable.burnham, "Parks", "Burnham Park is an open green park at the heart of Baguio. The park's lush greenery and blossoming blooms make you forget you're in the heart of a densely populated metropolis. Burnham Park is easily accessible.", "Location: Jose Abad Santos Rd, Baguio City, Benguet"),
            Place("Wright Park", R.drawable.wright, "Parks", "Wright Park is a wooded area in Baguio which became known for its horseback riding services for tourists..", "Location: Pacdal, Baguio City, Benguet"),
            Place("Rizal Park", R.drawable.rizal, "Parks", "Rizal Park is a small city centre park in Baguio City squeezed inbetween two busy streets Benjamin R. Salvosa Drive and Fernando G. Bautista Drive.", "Location: CH7R+5X3, Baguio City, Benguet"),
            Place("Mines View Park", R.drawable.mines, "Parks", " Mines View Park is one of the famous tourist spots across Baguio, packed with shops selling snacks, trinkets, botanical items, and others. Picture-taking services with traditional Igorot clothes, horses, dogs, and more are also available in the lower half of the park", "Location: Mines View, Baguio City, Benguet"),

        ),

        "Popular Destinations" to listOf(
            Place("Wright Park", R.drawable.wright, "Popular Destinations", "Wright Park is a wooded area in Baguio which became known for its horseback riding services for tourists.", "Location: Pacdal, Baguio City"),
            Place("Mines View Park", R.drawable.mines, "Popular Destinations", "Mines View Park is one of the famous tourist spots across Baguio, packed with shops selling snacks, trinkets, botanical items, and others. Picture-taking services with traditional Igorot clothes, horses, dogs, and more are also available in the lower half of the park.", "Location: Mines View, Baguio City, Benguet"),
            Place("Burnham Park", R.drawable.burnham, "Popular Destinations", "Burnham Park is an open green park at the heart of Baguio. The park's lush greenery and blossoming blooms make you forget you're in the heart of a densely populated metropolis. Burnham Park is easily accessible.", "Location: Jose Abad Santos Dr, Baguio City, Benguet"),
            Place("Igorot Stone Kingdom", R.drawable.igorot, "Popular Destinations", "The Igorot Stone Kingdom is a 6000- square meter open complex that features a collection of ancient structures made entirely out of stones. ", "Location: Longlong Benguet Rd, Baguio City"),
            Place("Botanical Garden", R.drawable.botanical, "Popular Destinations", "A botanical garden or botanic garden is a garden with a documented collection of living plants for the purpose of scientific research, conservation, display, and education..", "Location: 37 Leonard Wood Rd, Baguio City, Benguet")
        ),

        "Outdoor Activities and Adventure" to listOf(
            Place("Camp John Hay", R.drawable.johnhay, "Outdoor Activities and Adventure", "Camp John Hay is a mixed-used development which serves as a tourist destination and forest watershed reservation", "Location: Loakan, Baguio City, Benguet"),
            Place("Tree Top Adventure", R.drawable.treetop, "Outdoor Activities and Adventure", "Adventure park offering zip-lining courses along with treetop climbs & cablecar rides.", "Location: Scout Hill Dr, Camp John Hay, Baguio City"),
            Place("Mt Yangbew", R.drawable.yangbew, "Outdoor Activities and Adventure", "Mt.Yangbew is among the mountain ranges surrounding La Trinidad located in Tawang. ", "Location: FJ34+HRV, Mt Jumbo Trail, La Trinidad, Benguet"),
            Place("Mt Kalugong", R.drawable.kalugong, "Outdoor Activities and Adventure", "High-altitude destination for short mountain hikes with scenic views, plus a coffee shop at the top.", "Location: Kalugong Rd, La Trinidad, Benguet"),

        ),


        "Market Places" to listOf(
            Place("SM Baguio", R.drawable.sm, "Market Places", "SM City Baguio is the 23rd largest shopping mall in the Philippines. At a floor area of 176,073 m², it is the largest shopping mall in the North Luzon Region", "Location: Luneta Hill Dr, 231, Baguio City, Benguet."),
            Place("Porta Vaga ", R.drawable.porta, "Market Places", " Compact mall complex with a variety of stores, a sizable eatery selection, a supermarket & services.", "Location: CH6X+Q9H, Session Rd, Baguio City, Benguet."),
            Place("Baguio Center Mall", R.drawable.centermall, "Market Places", "The mall has a range of stores, including local and international brands, selling clothing, accessories, electronics, and other goods.", "Location: 421 Magsaysay Ave, Baguio City, Benguet."),
            Place("Maharlika Center", R.drawable.maharlika, "Market Places", "The Maharlika Livelihood Center, often referred to as Maharlika Center, is a prominent shopping complex located in the heart of Baguio City, Philippines. ", "Location: Maharlika, Baguio City, Benguet.")
        ),


        "Historical and Cultural Sites" to listOf(
            Place("The Mansion", R.drawable.mansion, "Historical and Cultural Sites", "Originally built to be the seat of power of the American Governors–General during the summer months in the country, the Baguio Mansion House eventually became the official summer residence of the President of the Philippines since the Commonwealth period.", "Location: Pacdal, Baguio City, Benguet."),
            Place("Tam-awan Village", R.drawable.tamawan, "Historical and Cultural Sites", "Tam-awan Village uniquely blends indigenous aesthetics and exquisite Cordilleran craftsmanship with an artist's concept.", "Location: Pinsao Proper, Baguio City, Benguet."),
            Place("Diplomat Hotel", R.drawable.diplomat, "Historical and Cultural Sites", "The hotel is considered by paranormal believers to be haunted due to its brutal World War II history and is considered by these believers as a ghost magnet.", "Location: Dominican Hill, Baguio City, Benguet."),
            Place("Baguio Museum", R.drawable.museum, "Historical and Cultural Sites", "Small museum with displays & artifacts related to local indigenous groups & the history of the city..", "Location: Dot-PTA Complex, Gov. Pack Rd, Baguio City, Benguet."),

        )



    )


    fun loadPlaces(category: String) {
        _places.value = placeData[category] ?: emptyList()
    }
}