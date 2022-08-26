class Preguica (
    nome: String,
    idade: Int,
    habitati: String
    ): Animal(
    nome,
    idade,
    habitati
    ) {
        fun emitirSom() {
            println("uuaaaajj")
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
            println("uuaaauuu")
        }


    }