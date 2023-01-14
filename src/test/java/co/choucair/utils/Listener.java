package co.choucair.utils;

import org.junit.Test;
import org.junit.runner.notification.RunListener;
import org.junit.runner.Description;


public class Listener extends RunListener {

    @Override
    public void testFinished(Description description) {
        if (description.getAnnotation(Test.class) != null) {
            if (description.getAnnotation(Test.class).expected().equals(AssertionError.class)) {
                System.out.println("Test: " + description.getMethodName() + " [FAILED]");
            } else {
                System.out.println("Test: " + description.getMethodName() + " [PASSED]");
            }
        }
    }
}