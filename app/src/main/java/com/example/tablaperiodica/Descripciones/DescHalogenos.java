package com.example.tablaperiodica.Descripciones;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.tablaperiodica.Adaptadores.Propiedades;
import com.example.tablaperiodica.JSON.HttpClient;
import com.example.tablaperiodica.JSON.OnHttpRequestComplete;
import com.example.tablaperiodica.JSON.Response;
import com.example.tablaperiodica.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class DescHalogenos extends AppCompatActivity {

    LinearLayout stackContent;
    String ID, ImgUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_halogenos);

        stackContent = (LinearLayout) findViewById(R.id.contendorDatos2);
        Intent intent = getIntent();
        Bundle b = intent.getExtras();
        if(b!=null){
            ID = (b.getString("ID"));
            ImgUrl = (b.getString("Image"));
        }

        ImageView img = (ImageView) findViewById(R.id.ImgEle2);
        TextView txt = (TextView) findViewById(R.id.txtTitulo2);
        txt.setText(ID);

        Glide.with(DescHalogenos.this)
                .load(ImgUrl)
                .apply(RequestOptions.circleCropTransform())
                .into(img);

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
                        Toast.makeText(DescHalogenos.this, "Error: "+e,Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        client.excecute("https://gist.githubusercontent.com/josue000209/41d0aa841c8e7c56beb3440a4b36879a/raw/c8e5c930780f15f21c843443b25f5b7d2d7f831e/HalogenosInfo.json");
    }
}
