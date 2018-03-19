package com.appgue.loginregister.ApiHelper;

/**
 * Created by Andri on 3/19/2018.
 */

public class UtilsApi {
    // 10.0.2.2 ini adalah localhost.
    public static final String BASE_URL_API = "https://api.appgue.com/miutracker/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
