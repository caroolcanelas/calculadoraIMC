package tests;

import controler.CalculadoraIMC;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraIMCMeninoTest {

    CalculadoraIMC calculadoraImc;

    @Before
    public void setup(){
        calculadoraImc = new CalculadoraIMC();
    }

    /*
        **INTERVALO DE VALORES INFANTIL MASCULINO**
        - Baixo peso: Abaixo de 15,0:
        - Peso normal: Entre 15,0 e 18,2:
        - Sobrepeso: Entre 18,2 e 19,2:
        - Obesidade: Acima DE 19,2:
     */

    // IDADE = 2
    @Test
    public void testeBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(10, 1.0, 2, "m")); //10

    }
    @Test
    public void testePesoNormal2() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(15, 1.0, 2, "m")); //15

    }

    @Test
    public void testeSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(19, 1.0, 2, "m")); //19

    }

    @Test
    public void testeObesidade2() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(30, 1.0, 2, "m")); //30

    }


    //IDADE = 4
    @Test
    public void testeBaixoPeso4() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(12, 1.1, 4, "m")); //9,92

    }

    @Test
    public void testePesoNormal4() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(19, 1.1, 4, "m")); //15,70

    }

    @Test
    public void testeSobrepeso4() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(20, 1.1, 4, "m")); //16,53

    }

    @Test
    public void testeObesidade4() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(35, 1.1, 4, "m")); // 28,93

    }


    //IDADE = 6

    @Test
    public void testeBaixoPeso6() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(14, 1.2, 6, "m")); // 9,72

    }

    @Test
    public void testePesoNormal6() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(20, 1.2, 6, "m")); // 15,97

    }

    @Test
    public void testeSobrepeso6() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(27, 1.2, 6, "m")); // 18,75

    }

    @Test
    public void testeObesidade6() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(29, 1.2, 6, "m")); //20,14

    }

    //IDADE = 8

    @Test
    public void testeBaixoPeso8() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(16, 1.3, 8, "m"));//9,47

    }

    @Test
    public void testePesoNormal8() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(26, 1.3, 8, "m"));//15,38

    }

    @Test
    public void testeSobrepeso8() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(32, 1.3, 8, "m"));//18,93

    }

    @Test
    public void testeObesidade8() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(45, 1.3, 8, "m"));//26,63

    }

    //IDADE = 10

    @Test
    public void testeBaixoPeso10() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(20, 1.5, 10, "m"));//8,89

    }

    @Test
    public void testePesoNormal10() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(35, 1.5, 10, "m"));//15,56

    }

    @Test
    public void testeSobrepeso10() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(42, 1.5, 10, "m"));//18,67

    }

    @Test
    public void testeObesidade10() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(50, 1.5, 10, "m"));//

    }

    //IDADE = 12

    @Test
    public void testeBaixoPeso12() {
        Assert.assertEquals("Baixo peso", calculadoraImc.calcularImc(25, 1.7, 12, "m"));//8,65

    }

    @Test
    public void testePesoNormal12() {
        Assert.assertEquals("Peso Normal", calculadoraImc.calcularImc(28, 1.7, 12, "m"));//15,57

    }

    @Test
    public void testeSobrepeso12() {
        Assert.assertEquals("Sobrepeso", calculadoraImc.calcularImc(54, 1.7, 12, "m"));//18,69

    }

    @Test
    public void testeObesidade12() {
        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(55, 1.7, 12, "m"));//19,03

    }


























//MENINAS






//    @Test
//    public void testeAudltoBaixoPesoMuitoGrave(){
//        Assert.assertEquals("Baixo peso muito grave", calculadoraImc.calcularImc(48.0, 1.735, 20, "m"));
//    }
//
//    @Test
//    public void testeAdultoBaixoPesoGraveInferior() {
//        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(48.0, 1.73, 20, "f"));
//    }
//
//    @Test
//    public void testeAdultoBaixoPesoGraveSuperior() {
//        Assert.assertEquals("Baixo peso grave", calculadoraImc.calcularImc(50.0, 1.72, 65, "m"));
//    }
//
//    @Test
//    public void testeMenina4anosObesidade() {
//        Assert.assertEquals("Obesidade", calculadoraImc.calcularImc(50.0, 1.639, 4, "f"));
//    }

    //grafico das crianças: Setiver 2 anos, e estiver ente 14,6 e 14,8 vai ser baixo peso (descobri altura e peso que da nisso )
    //48 testes para crianças (6*4*2)
    //apenas 1 caso por cor. escolhe um ponto dentro de cada cor. esoclhe vaor de peso e altura que de 16

    //6 idades * 4 tipos de peso * 2 possibilidades de sexo


    // 14.8 IMC. qual a altura e peso que da esse imc ?
    // fazer para as 4 catergoria, dentro das 6 idades (2,4,6,8,10,12) e de cada sexo



}