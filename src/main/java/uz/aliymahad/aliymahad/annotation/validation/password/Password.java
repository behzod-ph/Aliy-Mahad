package uz.aliymahad.aliymahad.annotation.validation.password;


import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import uz.aliymahad.aliymahad.annotation.validation.phone_number.PhoneNumberValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target(value = {FIELD,ANNOTATION_TYPE})
@Retention(RUNTIME)
public @interface Password {
    String message() default "Weak password. Password must contain at least 8 characters , one lowercase and uppercase letter and any special character.";

    Class[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
