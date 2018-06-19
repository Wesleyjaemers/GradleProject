package java_packages.Theorie.Annotation;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// @Retention(RetentionPolicy.CLASS)       //een annotation op een andere annotation
public @interface CustomAnnotation {  //@interface voor een custom annotation te maken
        String reason();
}
