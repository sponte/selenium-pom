package uk.sponte.automation.web.exceptions;

/**
 * Created by n450777 on 13/04/15.
 */
public class RetryException extends RuntimeException {
    public RetryException(Exception exceptionThrown) {
        super(exceptionThrown);
    }
}
