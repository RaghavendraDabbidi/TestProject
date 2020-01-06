package com.apollo.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.apollo.myapplication.api.CityRequest;
import com.apollo.myapplication.api.CityResponce;
import com.apollo.myapplication.api.StateRequest;
import com.apollo.myapplication.api.StateResponse;
import com.apollo.myapplication.model.RegistrationRequest;
import com.apollo.myapplication.model.RegistrationResponse;
import com.apollo.myapplication.model.SignUpModel;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Registration extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private SignUpModel signUpModel;
APIInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
//        selectState();
//        selectCity();
       serviceCall();
    }

    public void selectState() {
        String[] states = {"Select state", "Telangana", "Andhra pradhesh", "Tamilanadu", "Karnataka", "Kerala", "Goa", "Gujarat", "Punjab"};

        Spinner spinner = (Spinner) findViewById(R.id.select_state);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, states) {
            @Override
            public boolean isEnabled(int position) {
                if (position == 0) {
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if (position == 0) {
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                } else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);
    }

    public void selectCity(){
        String[] city = {"Select city", "Hyderabad", "Warangal", "Karimnagar", "Sidipet", "Janagama", "Nalgonda", "Jagithyal"};

        Spinner spinner = (Spinner) findViewById(R.id.select_city);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, city) {
            @Override
            public boolean isEnabled(int position) {
                if (position == 0) {
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View view = super.getDropDownView(position, convertView, parent);
                TextView tv = (TextView) view;
                if (position == 0) {
                    // Set the hint text color gray
                    tv.setTextColor(Color.GRAY);
                } else {
                    tv.setTextColor(Color.BLACK);
                }
                return view;
            }
        };
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
     public void serviceCall(){
         apiInterface = APIClient.getClient().create(APIInterface.class);

         /**
          GET List Resources
          **/
//         RegistrationRequest.DeliveryExecutive deliveryExecutive = new RegistrationRequest.DeliveryExecutive();
//         deliveryExecutive.setAadharNo();
         RegistrationRequest registrationRequest = new RegistrationRequest();
         Call<RegistrationResponse> call = apiInterface.doPostListResource(registrationRequest);
         call.enqueue(new Callback<RegistrationResponse>() {
             @Override
             public void onResponse(Call<RegistrationResponse> call, Response<RegistrationResponse> response) {

                 Log.d("TAG", response.code() + "");

             }

             @Override
             public void onFailure(Call<RegistrationResponse> call, Throwable t) {
                 call.cancel();
             }
         });


     }

    public void cityServiceCall(){
        apiInterface = APIClient.getClient().create(APIInterface.class);

        /**
         GET List Resources
         **/
//         RegistrationRequest.DeliveryExecutive deliveryExecutive = new RegistrationRequest.DeliveryExecutive();
//         deliveryExecutive.setAadharNo();
        CityRequest cityRequest = new CityRequest();
        Call<CityResponce> call = apiInterface.doPostListCity(cityRequest);
        call.enqueue(new Callback<CityResponce>() {
            @Override
            public void onResponse(Call<CityResponce> call, Response<CityResponce> response) {

                Log.d("TAG", response.code() + "");

            }

            @Override
            public void onFailure(Call<CityResponce> call, Throwable t) {
                call.cancel();
            }
        });


    }
    public void stateServiceCall(){
        apiInterface = APIClient.getClient().create(APIInterface.class);

        /**
         GET List Resources
         **/
//         RegistrationRequest.DeliveryExecutive deliveryExecutive = new RegistrationRequest.DeliveryExecutive();
//         deliveryExecutive.setAadharNo();
        StateRequest stateRequest = new StateRequest();
        Call<StateResponse> call = apiInterface.doPostListState(stateRequest);
        call.enqueue(new Callback<StateResponse>() {
            @Override
            public void onResponse(Call<StateResponse> call, Response<StateResponse> response) {

                Log.d("TAG", response.code() + "");

            }

            @Override
            public void onFailure(Call<StateResponse> call, Throwable t) {
                call.cancel();
            }
        });


    }

}
