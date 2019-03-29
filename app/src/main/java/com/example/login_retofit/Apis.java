package com.example.login_retofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apis {

    @GET("UserLogin.aspx?")
    Call  <LoginModel> loginUser(@Query("phn")String phn,@Query("Password") String Password);


@GET("UserRegistration.aspx?")
    Call <RegModel> regmodel(@Query("name")String name,@Query("email")String email,@Query("phone")String phone,@Query("password")String Password,@Query("adres")String add);

@GET("ViewJob.aspx?")
    Call <JobModel> jobmodel(@Query("USERID")String uid);


}
