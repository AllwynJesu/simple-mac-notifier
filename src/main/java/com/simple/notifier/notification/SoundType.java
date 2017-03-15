package com.simple.notifier.notification;

/**
 * Different types of sound that is supported by Mac 10.11.6
 * 
 * @author allwynjesu
 */
public enum SoundType {
    FUNK("Funk"), BASSO("Basso"), BLOW("Blow"), BOTTLE("Bottle"), FROG("Frog"), GLASS("Glass"), HERO("Hero"), MORSE(
	    "Morse"), PING("Ping"), POP("Pop"), PURR("Purr"), SOSUMI("Sosumi"), SUBMARI("Submari"), TINK("Tink");

    private String name;

    private SoundType(String name) {
	this.name = name;
    }

    public String getName() {
	return this.name;
    }
}
