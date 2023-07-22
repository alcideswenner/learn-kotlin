fun main() {

    verificarParOuImpar(8585)

    println(somarLista(listOf(1, 37, 37, 49, 73, 3838)))

    val listaString = listOf("Kotlin", "Java", "Python", "C#", "JavaScript")
    val stringsFiltradas = filtrarStringsPorTamanho(listaString)
    println("Strings com mais de 5 caracteres $stringsFiltradas")

    val pessoas = listOf(Pessoa("Wenner", 25), Pessoa("Jacqueline", 25))

    pessoas.forEach { p -> println(p.nome) }

    val retangulo = Retangulo(10.0, 50.0)
    println(retangulo.calcularArea())

    println("Escolha: Pedra, Papel ou Tesoura")
    val escolhaUsuario = readLine() ?: ""
    val resultado = jogarPedraPapelTesoura(escolhaUsuario)
    println(resultado)
}

fun verificarParOuImpar(num: Int) {
    if (num % 2 == 0) {
        println("Par")
    } else {
        println("Impar")
    }
}

fun somarLista(lista: List<Int>): Int {
    return lista.sum()
}

fun filtrarStringsPorTamanho(strings: List<String>): List<String> {
    return strings.filter { it.length > 5 }
}

class Pessoa(val nome: String, val idade: Int)

class Retangulo(val altura: Double, val largura: Double) {
    fun calcularArea(): Double {
        return altura * largura
    }
}

fun jogarPedraPapelTesoura(escolhaUsuario: String): String {
    val opcoes = listOf("Pedra", "Papel", "Tesoura")
    val escolhaComputador = opcoes.random()

    println("Computador escolheu $escolhaComputador")

    return when {
        escolhaUsuario == escolhaComputador -> "Empatou"
        (escolhaUsuario == "Pedra" && escolhaComputador == "Tesoura") ||
                (escolhaUsuario == "Papel" && escolhaComputador == "Pedra") ||
                (escolhaUsuario == "Tesoura" && escolhaComputador == "Papel") -> "Você Ganhou"
        else -> "Você Perdeu"
    }
}
