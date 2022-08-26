class Cachoro(
    nome: String,
    idade: Int,
    habitati: String
): Animal(
    nome,
    idade,
    habitati
) {
    fun emitirSom() {
        println("auauuuuuuuuuuuuuuuuuuuuuuuuuuu")
    }

    override fun correr() {
        println("esta andando")
    }

    override fun exibirDados() {
        println("Nome do animal e: $nome \n " + "Idadde e $idade \n" + "habitati e $habitati")
        correr()
        somAnimal()
        emitirSom()
    }

    override fun somAnimal() {
        println("auauauauauauauuuuuuuuuuuu")
    }


}