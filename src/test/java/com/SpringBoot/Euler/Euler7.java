package com.SpringBoot.Euler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class Euler7 {
    private final MathHelper mathHelper;

//    public Euler7(MathHelper mathHelper) {
//        this.mathHelper = mathHelper;
//    }

    /**asks for any number "i" if it is a primenumber. i
     *
     * @return
     */
    public int primenumber(int searchedPrimenumber){
        //MathHelper mathHelper = new MathHelper();
        int i = 1;
        int primenumberNumber = 0;
        while (true){
            i+=1;
            if (mathHelper.isPrimenumber(i)){
                primenumberNumber += 1;
                System.out.println(i);
                if (primenumberNumber == searchedPrimenumber){
                    return i;
                }

            }

        }
    }
}
