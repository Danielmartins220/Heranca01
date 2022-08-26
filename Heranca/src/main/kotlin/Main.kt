fun main() {
    var cachoro = Cachoro("Rury", 5, "domestico")
    var cavalo = Cavalo("Trovão", 30 , "domestico")
    var preguica = Preguica("Zumbi", 15, "selvagem")

    println("1-cachoro")
    println("2-cavalo")
    println("3-prequica")
    println("selesone uma as alternativa:")
    when(readln().toInt()){
        1-> cachoro.exibirDados()
        2-> cavalo.exibirDados()
        3-> preguica.exibirDados()
        else-> println("Opção ínvalida")

    }
}