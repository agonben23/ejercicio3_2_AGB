import kotlin.random.Random

class Persona(val nombre: String, val edad: Byte,var sexo : Char, val peso: Int, val altura: Double) {
    init {
        comprobarSexo()
    }

    val dni = generaDNI()
    private fun comprobarSexo(){
        if (sexo != 'H' && sexo != 'M'){
            sexo = 'H'
        }
    }
    fun calcularIMC() {
        val imc = (peso/(altura * altura))

    }
    private fun generaDNI(): String {
        val numDNI = Random.nextInt(0,99999999)
        val abc = arrayListOf<Char>('A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z')
        val letraDNI = abc[Random.nextInt(0, 23)]
        return numDNI.toString() + letraDNI
    }

    override fun toString(): String {
        return ("Esta persona tiene dni ${dni}, se llama $nombre, tiene $edad años, es , pesa $peso kg y mide $altura m")
    }
}

fun main() {
    val persona1 = Persona("alex",18,'H',75,1.8)
    println(persona1.toString())
}