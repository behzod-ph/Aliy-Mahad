package uz.aliymahad.aliymahad.annotation.validation.phone_number;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {

    String message;

    private final static Pattern phoneNumberPattern = Pattern.compile("\"^\\\\+(?:[0-9] ?){6,14}[0-9]$\"");


    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        boolean isValid = (s != null) && phoneNumberPattern.matcher(s).matches();
        if(!isValid){
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(message);
        }

        return isValid;
    }
}
