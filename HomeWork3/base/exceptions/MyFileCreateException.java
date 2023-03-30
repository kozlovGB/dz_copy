package dz_copy.HomeWork3.base.exceptions;

import HomeWork3.base.exceptions.FileCreateException;

public class MyFileCreateException extends FileCreateException {
    public MyFileCreateException(String message) {
        super("Can't create file in CFileCreator: " + message);
    }
}
