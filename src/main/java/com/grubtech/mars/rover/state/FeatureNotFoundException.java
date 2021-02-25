package com.grubtech.mars.rover.state;

public class FeatureNotFoundException extends RuntimeException{
    public FeatureNotFoundException() {
    }

    public FeatureNotFoundException(String message) {
        super(message);
    }

    public FeatureNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FeatureNotFoundException(Throwable cause) {
        super(cause);
    }

    public FeatureNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
