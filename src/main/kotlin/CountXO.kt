/**
 * Conta as quantidades de 'x' e 'o' em uma string (ignorando maiúsculas/minúsculas)
 * e retorna true se as quantidades forem iguais e diferentes de zero.
 */
fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return countO == countX && countO != 0

}

// Função usada apenas para testar o tratamento de exceções nos testes
fun testThrows() { throw Exception("testThrows deu ruim mane") }

