package com.example.login_retofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        String name="aa";
        String email="aa";
        String phone="123";
        String pass="12345";
        String add="qwety";

        Utils utils=new Utils();

        Call <RegModel> regModelCall=utils.getApi().regmodel(name,email,phone,pass,add);
        regModelCall.enqueue(new Callback<RegModel>() {
            @Override
            public void onResponse(Call<RegModel> call, Response<RegModel> response) {

                if(response.isSuccessful())
                {
                    Toast.makeText(Register.this, "Response success", Toast.LENGTH_SHORT).show();


                    String s=response.body().Status;
                    String uid=response.body().UserId;


                    if(s.equalsIgnoreCase("success"))
                    {
                        Toast.makeText(Register.this, "Reg success", Toast.LENGTH_SHORT).show();

                   startActivity(new Intent(getApplicationContext(),MainActivity.class));

                    }

                }


            }

            @Override
            public void onFailure(Call<RegModel> call, Throwable t) {

            }
        });



    }
}
