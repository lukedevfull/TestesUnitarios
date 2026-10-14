/**
 * Controla o acesso à portaria:
 * - Recusa menores de 18 anos.
 * - O tipo do convite deve ser "comum", "premium" ou "luxo".
 * - Códigos iniciados com "xt" são aceitos para o tipo "comum".
 * - Itens "luxo" ou "premium" exigem o prefixo "xl" no código.
 */
fun portaria(idade: Int, tipo: String, codigo: String): String {
    if (idade < 18) {
        return "Negado. Menores de idade não são permitidos."
    }

    val tiposValidos = arrayOf("comum", "premium", "luxo")

    if (tipo !in tiposValidos) {
        return "Negado. Convite inválido."
    }

    return if (tipo == "comum" && codigo.startsWith("xt")) {
        "Welcome :)"
    } else if (codigo.startsWith("xl")) {
        "Welcome :)"
    } else {
        "Negado. Convite inválido."
    }
}
