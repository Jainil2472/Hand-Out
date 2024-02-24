package com.example.myapplication.api;



import com.example.myapplication.model.RegidtrationModal;

import retrofit.Callback;
import retrofit.http.POST;
import retrofit.http.Query;

public interface Webservices {

    @POST("/post_profile.php")
    public void reg_user(@Query("Name")String Name,@Query("Mobile") String Mobile,@Query("Address") String Address, @Query("Service")String Service,@Query("Dataa")String Dataa, @Query("Description") String Description , Callback<RegidtrationModal> callback);
}
