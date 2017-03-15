package com.simple.notifier.notification;

/**
 * Pojo for holding notification data
 * 
 * @author allwynjesu
 */
public class Notification {

    private String msg;
    private String title;
    private String subtitle;
    private SoundType sound;

    public String getMsg() {
	return msg;
    }

    public void setMsg(String msg) {
	this.msg = msg;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public String getSubtitle() {
	return subtitle;
    }

    public void setSubtitle(String subtitle) {
	this.subtitle = subtitle;
    }

    public SoundType getSound() {
	return sound;
    }

    public void setSound(SoundType sound) {
	this.sound = sound;
    }

}
