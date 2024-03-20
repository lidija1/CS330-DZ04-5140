package rs.ac.metropolitan.cs330_dz04_5140

data class Student(
    val index: String,
    val ime: String,
    val prezime: String,
    var predmeti: List<Predmet>
) {
    override fun toString(): String {
        return "$index $ime $prezime"
    }
}
