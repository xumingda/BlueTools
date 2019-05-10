package filedstrength.jingxun.com.meter;

import android.app.Application;


import filedstrength.jingxun.com.meter.Utils.LogcatHelper;
import filedstrength.jingxun.com.meter.service.LocationService;


public class MyApp extends Application {

    public LocationService locationService;
    public static int type;

    @Override
    public void onCreate() {
        super.onCreate();
        LogcatHelper.getInstance(this).start();
        locationService = new LocationService(getApplicationContext());
    }


}
