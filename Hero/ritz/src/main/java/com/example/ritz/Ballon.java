package com.example.ritz;

import android.util.Log;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Ballon {

    @Before("execution(* com.example.hero.Cheese.sayChop(..))")
    public void bulbsd() {
        System.out.println("Please work");
        Log.w("Birthday", "Happy Happy Happy");
    }
}
