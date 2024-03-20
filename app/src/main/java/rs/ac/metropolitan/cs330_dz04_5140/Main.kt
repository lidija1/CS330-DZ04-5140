package rs.ac.metropolitan.cs330_dz04_5140
object Main {
    @JvmStatic
    fun main(args: Array<String>) {

        val predmeti = Predmeti()

        val predmet1 = Predmet("CS330", "Razvoj mobilnih aplikacija", 8, 4, true)
        val predmet2 = Predmet("IT355", "Veb sistemi 2", 6, 2, true)
        val predmet3 = Predmet("CS450", "Klaud kompjuting", 7, 6, false)

        val student1 = Student("1234", "Pera", "Peric", emptyList())
        val student2 = Student("5432", "Mika", "Mikic", emptyList())
        val student3 = Student("9876", "Zika", "Zikic", emptyList())

        predmeti.registrujStudenta(student1, predmet2)
        predmeti.registrujStudenta(student2, predmet3)
        predmeti.registrujStudenta(student3, predmet1)

        predmeti.odjaviStudenta(student1, predmet2)
        predmeti.odjaviStudenta(student2, predmet3)
        predmeti.odjaviStudenta(student3, predmet1)
    }
}
fun main() {
    Main.main(emptyArray())

}