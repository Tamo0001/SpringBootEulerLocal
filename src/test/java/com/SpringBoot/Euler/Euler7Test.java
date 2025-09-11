package com.SpringBoot.Euler;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class Euler7Test {

    @InjectMocks
    private MathHelper mathHelper= new MathHelper();
    private Euler7 euler7 = new Euler7(mathHelper);


    @Test
    void checkNPrimenumbers() {
        int result = euler7.getNthPrimeNumber(10001);
        assertEquals(104743,result);
    }
}