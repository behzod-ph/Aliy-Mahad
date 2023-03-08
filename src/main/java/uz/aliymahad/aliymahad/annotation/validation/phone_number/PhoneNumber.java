package uz.aliymahad.aliymahad.annotation.validation.phone_number;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * Thanks to the international phone numbering plan (ITU-T E. 164),
 * phone numbers cannot contain more than 15 digits.
 * The shortest international phone numbers in use contain seven digits.
 * */
@Documented
@Constraint(validatedBy = PhoneNumberValidator.class)
@Target(value = {FIELD,ANNOTATION_TYPE})
@Retention(RUNTIME)
public @interface PhoneNumber {
    String message() default "Invalid phone number format.";

    Class[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
