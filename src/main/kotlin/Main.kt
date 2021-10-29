import kotlin.random.Random

class Persona(val nombre: String, val edad: Byte, val peso: Int, val altura: Double) {
    val dni = generaDNI()
    private fun generaDNI(): String {
        val numDNI = Random.nextInt(0,99999999)
        val abc = arrayListOf<Char>('A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z')
        val letrasDNI = abc[Random.nextInt(0, 23)]
        return numDNI.toString() + letrasDNI
    }
}

fun main() {
    val persona1 = Persona("alex",18,75,1.8)
    println(persona1.dni)
}