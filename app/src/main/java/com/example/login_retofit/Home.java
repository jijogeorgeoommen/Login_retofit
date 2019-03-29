package com.example.login_retofit;

import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Utils utils=new Utils();

        Call<JobModel> modelCall=utils.getApi().jobmodel("26");
        modelCall.enqueue(new Callback<JobModel>() {
            @Override
            public void onResponse(Call<JobModel> call, Response<JobModel> response) {

                if(response.isSuccessful()){
                    Toast.makeText(Home.this, "Response success", Toast.LENGTH_SHORT).show();

                    List<JobDetail> ls=response.body().getJobDetails();

                    Toast.makeText(Home.this, "Addeed", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Home.this, "POTTI", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<JobModel> call, Throwable t) {

            }
        });



    }
}
