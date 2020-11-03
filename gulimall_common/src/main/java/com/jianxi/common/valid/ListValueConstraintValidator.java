package com.jianxi.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {

    /**
     * set 里面就是使用注解时规定的值, 例如: @ListValue(vals = {0,1})  set= {0,1}
     */
    private Set<Integer> set = new HashSet<>();


    @Override
    public void initialize(ListValue constraintAnnotation) {
        for (int val : constraintAnnotation.vals()) {
            set.add(val);
        }
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(integer);
    }
}
