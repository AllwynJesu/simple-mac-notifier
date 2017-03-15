package com.simple.notifier.notification;

import java.io.IOException;

public class NotificationCentre {

    public static void displayNotification(Notification notification) {
	String sound = notification.getSound() != null ? notification.getSound().getName() : "default";
	String[] command = new String[] { "osascript", "-e",
		"display notification \"" + notification.getMsg() + "\" with title \"" + notification.getTitle()
			+ "\" subtitle \"" + notification.getSubtitle() + "\" sound name \"" + sound + "\"" };
	try {
	    Runtime.getRuntime().exec(command);
	} catch (IOException e) {
	    //TODO : Handle the exception
	}
    }

}
