package com.example.tablaperiodica;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tablaperiodica.Adaptadores.Propiedades;
import com.example.tablaperiodica.JSON.HttpClient;
import com.example.tablaperiodica.JSON.OnHttpRequestComplete;
import com.example.tablaperiodica.JSON.Response;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class DescActivity extends AppCompatActivity {

    LinearLayout stackContent;
    String ID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        stackContent = (LinearLayout) findViewById(R.id.contendorDatos);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b!=null){
            ID = (b.getString("ID"));
        }

        TextView txt = (TextView) findViewById(R.id.txtTitulo);
        txt.setText(ID);

        HttpClient client = new HttpClient(new OnHttpRequestComplete() {
            @Override
            public void onComplete(Response status) {
                if (status.isSuccess()){
                    Gson gson = new GsonBuilder().create();
                    try {
                        JSONObject jsonObject = new JSONObject(status.getResult());
                        JSONArray jsonArray = jsonObject.getJSONArray(ID);
                        ArrayList<Propiedades> propiedades = new ArrayList<Propiedades>();
                        for (int i =0; i<jsonArray.length(); i++){
                            String pro = jsonArray.getString(i);
                            Propiedades p = gson.fromJson(pro, Propiedades.class);
                            propiedades.add(p);
                            TextView t = new TextView(getApplicationContext());
                            t.setText(p.getNa()+"\n\n"+p.getV()+"\n\n"+p.getEo()+"\n\n"+p.getE()
                                    +"\n\n"+p.getRc()+"\n\n"+p.getRi()+"\n\n"+p.getRa()+"\n\n"+p.getCe()+"\n\n"+p.getPp()
                                    +"\n\n"+p.getMa()+"\n\n"+p.getD()+"\n\n"+p.getPe()+"\n\n"+p.getPf()+"\n\n"+p.getDe()+"\n\n"+p.getUsos());
                            t.setTextSize(18);
                            t.setTextColor(Color.WHITE);
                            t.setTypeface(Typeface.DEFAULT_BOLD);
                            stackContent.addView(t);
                        }
                    }catch (Exception e){
                        Toast.makeText(DescActivity.this, "Error: "+e,Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        client.excecute("https://gist.githubusercontent.com/josue000209/9ba0e9cca98d57acbdde0619dd9bf2af/raw/068611acef6cabff2c95279d9f317290c64ed11a/datos.json");
    }
}
