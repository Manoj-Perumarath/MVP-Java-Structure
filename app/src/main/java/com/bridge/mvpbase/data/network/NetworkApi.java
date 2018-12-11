package com.bridge.mvpbase.data.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface NetworkApi {

    @GET("/photos")
    Call<ResponseBody> dummyRequest();
}
