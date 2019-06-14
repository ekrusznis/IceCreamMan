package ek.uw.icecreamman.common;

import android.location.Location;

import ek.uw.icecreamman.retrofit.FCMClient;
import ek.uw.icecreamman.retrofit.FCMService;
import ek.uw.icecreamman.retrofit.IGoogleApi;
import ek.uw.icecreamman.retrofit.RetrofitClient;

public class Common {
    public static final String baseURL="https://maps.googleapis.com";
    public static final String fcmURL="https://fcm.googleapis.com";
    public static IGoogleApi getGoogeApi()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleApi.class);
    }
    public static FCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(FCMService.class);
    }

    public static Location mLastLocation=null;

}
