package com.xcdanmu;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

public class AccessibilityMonitor extends android.accessibilityservice.AccessibilityService {

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        if (event.getEventType() == AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED){
            Notification notification = (Notification) event.getParcelableData();
            Log.i("lee..","notification state changed "+notification.flags);
            Intent intent = new Intent();
            IntentFilter filter = new IntentFilter();

           // startService(filter);
        }
    }

    @Override
    protected void onServiceConnected() {

        Log.i("lee..","Accessibility monitor connected");
        // Define it in both xml file and here,  for compatibility with pre-ICS devices
        AccessibilityServiceInfo info = new AccessibilityServiceInfo();
        info.eventTypes = AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED |
                AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED |
                AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED;

        info.feedbackType = AccessibilityServiceInfo.FEEDBACK_GENERIC;
        setServiceInfo(info);
    }

    @Override
    public void onInterrupt() {
        Log.i("lee..", "Accessibility interrupted");
    }
}
