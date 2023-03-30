package dz_copy.HomeWork3.base.exceptions;

public class FullNameEmptyValueException extends RuntimeException{
    public FullNameEmptyValueException() {
        super("One or more values in the full name are empty!!!");
    }
}
