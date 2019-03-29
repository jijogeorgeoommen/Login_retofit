package com.example.login_retofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
EditText phone,passd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phone=findViewById(R.id.phone);
        passd=findViewById(R.id.Password);

        String ph="7";
        String Pass="huk";



    }

    public void register(View view) {

        startActivity(new Intent(getApplicationContext(),Register.class));
    }

    public void login(View view) {

        String ph=phone.getText().toString()
;
        String pass=passd.getText().toString()


;
        Utils utils=new Utils();

        Call<LoginModel> loginModelCall=utils.getApi().loginUser(ph,pass);
        loginModelCall.enqueue(new Callback<LoginModel>() {
            @Override
            public void onResponse(Call<LoginModel> call, Response<LoginModel> response) {


                //    Toast.makeText(MainActivity.this, ""+response.body(), Toast.LENGTH_SHORT).show();

                if(response.isSuccessful()){


                    String s=response.body().Status;
                    String n=response.body().Name;

                    Toast.makeText(MainActivity.this, ""+s+n, Toast.LENGTH_SHORT).show();
if(s.equals("Success"))
{
    startActivity(new Intent(getApplicationContext(),Home.class));
}

                }
                else
                {
                    Toast.makeText(MainActivity.this, "response failed", Toast.LENGTH_SHORT).show();


                }




            }

            @Override
            public void onFailure(Call<LoginModel> call, Throwable t) {
                Toast.makeText(MainActivity.this, "on failure response failed", Toast.LENGTH_SHORT).show();


            }
        });






    }
}
