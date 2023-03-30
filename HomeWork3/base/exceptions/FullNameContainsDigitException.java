package dz_copy.HomeWork3.base.exceptions;

public class FullNameContainsDigitException extends RuntimeException{
    public FullNameContainsDigitException() {
        super("One or more symbol in full name's values are digits!!!");
    }
}
