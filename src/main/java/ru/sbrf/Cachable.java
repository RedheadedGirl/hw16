package ru.sbrf;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Cachable {
//    Class<? extends Source> value() ;
}
