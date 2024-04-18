package com.ltp.javagram.validation;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Date> {
    //ConstraintValidator<A,T>: A -> class, T-> field
    @Override
    public boolean isValid(Date value, ConstraintValidatorContext context) {
        long diff = new Date().getTime() - value.getTime();
        int age = (int) (TimeUnit.MILLISECONDS.toDays(diff) / 365);
        return age >= 18;
    }
}
