package com.stackroute.assignment.exception;

public class TrackNotFoundException extends RuntimeException {

    public TrackNotFoundException(){
        super("Track not found");
    }
}
