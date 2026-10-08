import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class countXOTest {

    @Test
    @DisplayName("Testa a quantidade de X + O")
    fun testCountXO() {
        Assertions.assertAll({ //Assegura que todos os testes sejam execultados
            //independentemente de caso haja erro no anterior
            Assertions.assertTrue(countXO("xxxooo"))
        },{
            Assertions.assertFalse(countXO("xxooo"))
        }, {
            Assertions.assertTrue(countXO("xxxxxxoooooo"))
        })
//        Assertions.assertTrue(countXO("xxxooo"))
    }

    @Test
    @Disabled
    fun notImplemented () {
        //A implementar um teste qualquer aquiiiiiii
    }

    //OOOOOOOOOOOOOUUUUUUUUUUU outra abordagem é fazer o teste falhar parta lembrar
    //implementar

//    fun fail (){
//        fail()
//    }
    @Test
    fun condicionalWorking(){
    Assumptions.assumeTrue(countXO("xxxxxxoooooo"))
    //todos os testes abaixop só vão rodar caso a condição assima seja verdadeira

    Assertions.assertEquals(false, countXO("xxxxxxxxooooooo"))
    }
}