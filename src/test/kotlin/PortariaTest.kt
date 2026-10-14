import org.junit.jupiter.api.Assertions
import kotlin.test.Test


class PortariaTest {
    @Test
    fun invalidInviteTest() {
        Assertions.assertAll(
            {
                Assertions.assertEquals(
                    "Negado. Menores de idade não são permitidos.",
                    portaria(12, "invalid", "ahjs")
                )
            },
            {
                Assertions.assertEquals(
                    "Negado. Convite inválido.",
                    portaria(18, "fag", "ahjs")
                )
            },
            {
                Assertions.assertEquals(
                    "Negado. Convite inválido.",
                    portaria(18, "comum", "ahjs"))
            },
            {
                Assertions.assertEquals(
                    "Negado. Convite inválido.",
                    portaria(idade = 20, tipo = "premium", codigo = "ghj")
                )

            }
        )
    }
    @Test
    fun allyInviteTest(){
        Assertions.assertAll(
            {
                Assertions.assertEquals(
                    "Welcome :)",
                    portaria(34, "comum", "xt")
                )
            },
            {
                Assertions.assertEquals(
                    "Welcome :)",
                    portaria(18, "luxo", "xl")
                )
            })
    }
}