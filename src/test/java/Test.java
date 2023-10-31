import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test {

    @org.junit.jupiter.api.Test
    void testMassive(){
        Massive mass1 = new Massive(5);

        assertThat(mass1.getArray()).isInstanceOf(ArrayList.class);
    }

    @org.junit.jupiter.api.Test
    void testLenthMassive(){
        Massive mass = new Massive(5);

        assertThat(mass.getArrayLenth()).isEqualTo(5);

    }

    @org.junit.jupiter.api.Test
    void testAveregeOfMassive(){
        Massive mass = mock(Massive.class);

        when(mass.getAverege()).thenReturn(2.5);

        assertThat(mass.getAverege()).isEqualTo(2.5);
    }

    @org.junit.jupiter.api.Test
    void testMassiveArrayClass(){
        Massive mass = new Massive(5);
        assertThat(mass.getArray()).isInstanceOf(ArrayList.class);

    }

    @org.junit.jupiter.api.Test
    void testGetAverege(){
        Massive mass = new Massive(5);
        mass.setArray(new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);

        }});
        assertThat(mass.getAverege()).isEqualTo(2);
    }



    @org.junit.jupiter.api.Test
    void testAverageEquals(){
        Massive mass1 = mock(Massive.class);
        Massive mass2 = mock(Massive.class);
        when(mass1.getAverege()).thenReturn(2.0);
        when(mass1.getAverege()).thenReturn(2.0);
        Averege aver = new Averege(mass1,mass2);


        assertThat(aver.compareAverage()).isEqualTo("Среднее арифметическое первого массива 2.0 равно среднему " +
                "арифметическому второго массива 2.0");

    }


    @org.junit.jupiter.api.Test
    void testAverageFirstMoreSecond(){
        Massive mass3 = mock(Massive.class);
        Massive mass4 = mock(Massive.class);
        when(mass3.getAverege()).thenReturn(3.0);
        when(mass4.getAverege()).thenReturn(2.0);
        Averege aver = new Averege(mass3,mass4);


        assertThat(aver.compareAverage()).isEqualTo("Среднее арифметическое первого массива 3.0 больше среднего " +
                "арифметического второго массива 2.0");

    }

}
