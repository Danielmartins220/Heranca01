class Cavalo(
    nome: String,
    idade: Int,
    habitati: String
): Animal(
    nome,
    idade,
    habitati
) {
    fun emitirSom() {
        println("riiimmmmmmm")
    }

    override fun correr() {
        println("esta correndo")
    }

    override fun exibirDados() {
        println("Nome do animal e: $nome \n " + "Idadde e $idade \n" + "habitati e $habitati")
        correr()
        somAnimal()
        emitirSom()
    }

    override fun somAnimal() {
        println("riiririiiiimmmmm")
    }


}