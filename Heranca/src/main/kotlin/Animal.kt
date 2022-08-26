
abstract class Animal(
   var nome: String,
   val idade: Int,
   var habitati: String
) {
    abstract fun correr()
    abstract fun exibirDados()
    abstract fun somAnimal()
}