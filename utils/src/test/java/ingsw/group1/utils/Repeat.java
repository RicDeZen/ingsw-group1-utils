package ingsw.group1.utils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Class defining an Annotation to by {@link RepeatRule} containing the number of times a Test
 * should be run.
 * Based on: https://gist.github.com/fappel/8bcb2aea4b39ff9cfb6e
 *
 * @author Riccardo De Zen
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Repeat {
    int times() default 1;
}
