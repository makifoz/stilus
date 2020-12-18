package com.example.stilus;

import com.example.stilus.ws.CPComputeSoap;
import com.example.stilus.ws.models.GetComputeRequest;
import com.example.stilus.ws.models.Islem;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ComputeSoapTest {

    @Test
    public void testComputeToplama(){
        CPComputeSoap cp = new CPComputeSoap();

        assertEquals(-25, cp.compute(new GetComputeRequest((float)-12,(float)-13,Islem.TOPLAMA)).getComputeResponse().getResult(), "-12 + (-13) must be -25");
        assertEquals(1,cp.compute(new GetComputeRequest((float)-2,(float)3,Islem.TOPLAMA)).getComputeResponse().getResult(), "-2 + 3 must be 1");
        assertEquals(-2, cp.compute(new GetComputeRequest((float)1,(float)-3,Islem.TOPLAMA)).getComputeResponse().getResult(), "1 + (-3) must be -2");
        assertEquals(10, cp.compute(new GetComputeRequest((float)7,(float)3,Islem.TOPLAMA)).getComputeResponse().getResult(), "7 + 3 must be 10");


    }

    @Test
    public void testComputeCikarma(){
        CPComputeSoap cp = new CPComputeSoap();

        assertEquals(1, cp.compute(new GetComputeRequest((float)-12,(float)-13,Islem.CIKARMA)).getComputeResponse().getResult(), "-12 - (-13) must be 1");
        assertEquals(-5,cp.compute(new GetComputeRequest((float)-2,(float)3,Islem.CIKARMA)).getComputeResponse().getResult(), "-2 - 3 must be -5");
        assertEquals(4, cp.compute(new GetComputeRequest((float)1,(float)-3,Islem.CIKARMA)).getComputeResponse().getResult(), "1 - (-3) must be 4");
        assertEquals(4, cp.compute(new GetComputeRequest((float)7,(float)3,Islem.CIKARMA)).getComputeResponse().getResult(), "7 - 3 must be 4");


    }


}
