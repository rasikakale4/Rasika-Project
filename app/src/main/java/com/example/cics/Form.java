package com.example.cics;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Calendar;

public class Form extends AppCompatActivity {

    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;

    EditText Climate, Soil_type, Rainfall, Land, Nitrogen, Phosphorous, Potash, Micro, Yield, Pest, Near;
    String cropname, climate, rainfall, soil_type, land, nitrogen, phosphorous, potash, micro, yield, pest, near, irrigate, rainfed, cannel, tube, openwell, sowing;
    RadioButton Irrigate, Rainfed;
    CheckBox Cannel, Tube, Openwell;
    Button Sowing, submite;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);



        Climate = (EditText)findViewById(R.id.climate_edit);
        Soil_type = (EditText)findViewById(R.id.soil_edit);
        Rainfall  = (EditText)findViewById(R.id.Rainfall_mm_edit);
        Land = (EditText)findViewById(R.id.Land_Holding_Size_hectares_edit);
        Nitrogen = (EditText)findViewById(R.id.Nitrogen_edit);
        Phosphorous = (EditText)findViewById(R.id.Phosphorous_edit);
        Potash = (EditText)findViewById(R.id.Potash_edit);
        Micro = (EditText)findViewById(R.id.Micro_Nutrients_edit);
        Yield = (EditText)findViewById(R.id.Yield_kg_hectares_edit);
        Pest = (EditText)findViewById(R.id.Pest_edit);
        Near = (EditText)findViewById(R.id.Nearby_Market_edit);
        Rainfed = (RadioButton)findViewById(R.id.Irrigation_Source_rainfed_edit);
        Irrigate = (RadioButton)findViewById(R.id.Irrigation_Source_irrigate_edit);
        Cannel = (CheckBox)findViewById(R.id.Water_cannel);
        Tube = (CheckBox)findViewById(R.id.Water_tube_well);
        Openwell = (CheckBox)findViewById(R.id.Water_open_well);
        Sowing = (Button)findViewById(R.id.Sowing_date);


        submite = (Button) findViewById(R.id.sbmit);



        textView = (TextView) findViewById(R.id.crop_name_edit);
        Bundle bundle = getIntent().getExtras();
        String data = bundle.get("data").toString();
        textView.setText(data);


        dateView = (TextView) findViewById(R.id.txt);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);

        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month+1, day);
    }

    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
        Toast.makeText(getApplicationContext(), "ca",
                Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2+1, arg3);
                }
            };

    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("-")
                .append(month).append("-").append(year));
    }

    public void saveinfo(View view )
    {

        cropname = textView.getText().toString();
        climate = Climate.getText().toString();
        rainfall = Rainfall.getText().toString();
        soil_type = Soil_type.getText().toString();
        irrigate = Irrigate.getText().toString();
        rainfed = Rainfed.getText().toString();
        cannel = Cannel.getText().toString();
        tube = Tube.getText().toString();
        openwell = Openwell.getText().toString();
        sowing = dateView.getText().toString();
        land = Land.getText().toString();
        nitrogen = Nitrogen.getText().toString();
        phosphorous = Phosphorous.getText().toString();
        potash = Potash.getText().toString();
        micro = Micro.getText().toString();
        yield = Yield.getText().toString();
        pest = Pest.getText().toString();
        near = Near.getText().toString();

        BackgraundTask backgraundTask = new BackgraundTask();
        backgraundTask.execute(cropname, climate, soil_type, rainfall, irrigate, rainfed, cannel, tube, openwell,sowing, land, nitrogen, phosphorous, potash, micro, yield, pest,near);
        finish();

       // Intent intent = new Intent(Form.this,Camera.class);
       // startActivity(intent);

    }

    class BackgraundTask extends AsyncTask<String, Void, String> {

        String add_info_url;

        @Override
        protected void onPreExecute() {

            add_info_url = "https://nbsscics.000webhostapp.com/connect/data_entry.php";

        }

        @Override
        protected String doInBackground(String... args) {
            try {
                String cropname,climate,rainfall,soil_type,irrigate, rainfed, cannel, tube, openwell,land,nitrogen,phosphorous,potash,micro,yield,pest,near,sowing;
                cropname = args[0];
                climate = args[1];
                soil_type = args[2];
                rainfall = args[3];
                irrigate = args[4];
                rainfed = args[5];
                cannel = args[6];
                tube = args[7];
                openwell = args[8];
                sowing = args[9];
                land = args[10];
                nitrogen = args[11];
                phosphorous = args[12];
                potash = args[13];
                micro = args[14];
                yield = args[15];
                pest = args[16];
                near = args[17];

                URL url = new URL(add_info_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));

                String data_string = URLEncoder.encode("cropname","UTF-8")+"="+URLEncoder.encode(cropname,"UTF-8")+"&"+
                        URLEncoder.encode("climate","UTF-8")+"="+URLEncoder.encode(climate,"UTF-8")+"&"+
                        URLEncoder.encode("soil_type","UTF-8")+"="+URLEncoder.encode(soil_type,"UTF-8")+"&"+
                        URLEncoder.encode("rainfall","UTF-8")+"="+URLEncoder.encode(rainfall,"UTF-8")+"&"+
                        URLEncoder.encode("irrigate","UTF-8")+"="+URLEncoder.encode(irrigate,"UTF-8")+"&"+
                        URLEncoder.encode("rainfed", "UTF-8")+"="+URLEncoder.encode(rainfed,"UTF-8")+"&"+
                        URLEncoder.encode("cannel", "UTF-8")+"="+URLEncoder.encode(cannel,"UTF-8")+"&"+
                        URLEncoder.encode("tube_well", "UTF-8")+"="+URLEncoder.encode(tube,"UTF-8")+"&"+
                        URLEncoder.encode("open_well", "UTF-8")+"="+URLEncoder.encode(openwell,"UTF-8")+"&"+
                        URLEncoder.encode("sowing", "UTF-8")+"="+URLEncoder.encode(sowing,"UTF-8")+"&"+
                        URLEncoder.encode("land_holding_size","UTF-8")+"="+URLEncoder.encode(land,"UTF-8")+"&"+
                        URLEncoder.encode("nitrogen","UTF-8")+"="+URLEncoder.encode(nitrogen,"UTF-8")+"&"+
                        URLEncoder.encode("phosphorous","UTF-8")+"="+URLEncoder.encode(phosphorous,"UTF-8")+"&"+
                        URLEncoder.encode("potash","UTF-8")+"="+URLEncoder.encode(potash,"UTF-8")+"&"+
                        URLEncoder.encode("micro_nutrients","UTF-8")+"="+URLEncoder.encode(micro,"UTF-8")+"&"+
                        URLEncoder.encode("yield","UTF-8")+"="+URLEncoder.encode(yield,"UTF-8")+"&"+
                        URLEncoder.encode("pest","UTF-8")+"="+URLEncoder.encode(pest,"UTF-8")+"&"+
                        URLEncoder.encode("nearby_market","UTF-8")+"="+URLEncoder.encode(near,"utf-8");
                bufferedWriter.write(data_string);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                inputStream.close();
                httpURLConnection.disconnect();
                return "One row of data inserted....";

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (Exception e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
        }
    }
}
