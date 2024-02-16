
fun imprimirNumeros(numeros: List<Int>): String {
    var numerosAImprimir = ""
    for ((index, numero) in numeros.withIndex()) {
        // Adiciona o número à string
        numerosAImprimir += "$numero"
        // Se não for o último número, adiciona uma vírgula e um espaço
        if (index < numeros.size - 1) {
            numerosAImprimir += ", "
        }
    }
    return numerosAImprimir
}

fun imprimirNumerosPares(numeros: List<Int>): String{
    var numerosaimprimir = ""
    for ((index, numero) in numeros.withIndex()){
        if (numero % 2 == 0){
            numerosaimprimir += "$numero"
        }
        if (index < numeros.size - 1 && numero % 2 == 0){
            numerosaimprimir += ", "
        }
    }
    return numerosaimprimir
}

fun cumprimentar(nome: String): String{
    return "Olá $nome, tudo bem?"
}
fun cumprimentarVariosColegas(nomes: List<String>): String{
    var result = ""
    for (name in nomes){
        result += cumprimentar(name)
        result += "\n"
    }
    return result;
}

fun cumprimentarVariosColegasEanonimos(nomes: List<String?>): String {
    var result = ""
    for ((indice, nome) in nomes.withIndex()) {
        if (nome == null) {
            result += "$indice: " + cumprimentar("Anônimo")
        } else {
            if(nome.length > 4) {
                result += "$indice: " + cumprimentar(nome)
            }
        }
        result += "\n"
    }
    return result
}

fun main() {
    println("Computação Móvel, Aula 1, Exercícios parte 1!")
    println("*********************************************")
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val nomes = listOf<String>("Ana","Fábio","Felipe","Luíza","Wisley")
    val nomes1 = listOf<String?>("Ana","Fábio",null,"Felipe","Luíza","Wisley",null)
    // Imprimir todos os números pares
    println(imprimirNumerosPares(numeros))
    println("*********************************************")
    // cumprimentar várias pessoas e anonimos
    println(cumprimentarVariosColegasEanonimos(nomes1))

}