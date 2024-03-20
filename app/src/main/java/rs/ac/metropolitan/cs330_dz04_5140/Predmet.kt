package rs.ac.metropolitan.cs330_dz04_5140

data class Predmet(

    val sifraPredmeta: String,
    val nazivPredmeta: String,
    val brojEspbPoena: Int,
    val semestar: Int,
    val obavezan: Boolean
) {
    override fun toString(): String {
        val tip = if (obavezan) "obavezan" else "izborni"
        return "$nazivPredmeta ESP:$brojEspbPoena semestar:$semestar ($tip)"
    }
}
