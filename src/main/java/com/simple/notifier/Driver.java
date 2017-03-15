package com.simple.notifier;

import com.simple.notifier.notification.Notification;
import com.simple.notifier.notification.NotificationCentre;
import com.simple.notifier.notification.SoundType;

public class Driver {

	public static void main(String[] args) {
		Notification notification = new Notification();
		notification.setMsg("Sample notification");
		notification.setTitle("My Title");
		notification.setSound(SoundType.FUNK);
		notification.setSubtitle("Hello World");
		NotificationCentre.displayNotification(notification);
	}
	
}
