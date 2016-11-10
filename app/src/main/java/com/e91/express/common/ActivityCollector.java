package com.e91.express.common;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author devin
 * @Class ActivityCollector
 * @Date 16/5/1
 */
public class ActivityCollector {


    public static List<Activity> activities = new ArrayList<Activity>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for (Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }

}