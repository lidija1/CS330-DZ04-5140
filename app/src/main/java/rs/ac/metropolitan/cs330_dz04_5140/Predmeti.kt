package rs.ac.metropolitan.cs330_dz04_5140

class Predmeti : RegistrovanjePredmeta {
    private val listaPredmeta = mutableListOf<Predmet>()

    override fun registrujStudenta(student: Student, predmet: Predmet) {
        student.predmeti += predmet
        println("Student ${student.ime} ${student.prezime} je uspesno prijavljen na predmet ${predmet.nazivPredmeta}")
    }

    override fun odjaviStudenta(student: Student, predmet: Predmet) {
        student.predmeti -= predmet
        println("Student ${student.ime} ${student.prezime} je uspesno odjavljen sa predmeta ${predmet.nazivPredmeta}")
    }
}