package school.cesar.aula11.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class NumberUtilTest {

    private NumberUtil numberUtil;

    @BeforeEach
    public void setup(){
        numberUtil = new NumberUtil();
    }

    @Test
    public void deveRetornarTrueQuandoNumeroFor1(){
        Assertions.assertTrue(numberUtil.isNumeroPositivo(10));
    }

    @Test
    public void deveRetornarTrueQuandoNumeroFor0(){
        Assertions.assertTrue(numberUtil.isNumeroPositivo(0));
    }
}
