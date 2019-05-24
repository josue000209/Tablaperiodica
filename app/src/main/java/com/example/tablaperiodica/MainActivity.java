package com.example.tablaperiodica;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

import com.example.tablaperiodica.Adaptadores.Elemento;
import com.example.tablaperiodica.Agrupamientos.Actinidos;
import com.example.tablaperiodica.Agrupamientos.Alcalinos;
import com.example.tablaperiodica.Agrupamientos.Alcalinoterreos;
import com.example.tablaperiodica.Agrupamientos.GasesNobles;
import com.example.tablaperiodica.Agrupamientos.Halogenos;
import com.example.tablaperiodica.Agrupamientos.Lantanidos;
import com.example.tablaperiodica.Agrupamientos.MetalesTransicion;
import com.example.tablaperiodica.Agrupamientos.Metaloides;
import com.example.tablaperiodica.Agrupamientos.NoMetales;
import com.example.tablaperiodica.Agrupamientos.OtrosMetales;
import com.example.tablaperiodica.Descripciones.DescAlcalinos;
import com.example.tablaperiodica.Descripciones.DescAlcalinoterreos;
import com.example.tablaperiodica.Descripciones.DescGasesNobles;
import com.example.tablaperiodica.Descripciones.DescHalogenos;
import com.example.tablaperiodica.Descripciones.DescMetalesTranscision;
import com.example.tablaperiodica.Descripciones.DescMetaloides;
import com.example.tablaperiodica.Descripciones.DescNoMetales;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    Elemento ele = new Elemento();
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn9,btn10,btn11,btn12,btn13,btn14,btn18,btn19,btn153,btn154,btn155,btn156,btn157,btn158;
    Button btn162,btn163,btn164,btn165,btn166,btn167,btn168,btn113,btn124,btn125,btn135,btn136,btn146,btn147,btn123,btn133,btn134,btn143;
    Button btn144,btn145;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5= (Button)findViewById(R.id.button5);
        btn6 = (Button)findViewById(R.id.button6);
        btn7 = (Button)findViewById(R.id.button7);
        btn9 = (Button)findViewById(R.id.button9);
        btn10 = (Button)findViewById(R.id.button10);
        btn11 = (Button)findViewById(R.id.button11);
        btn12 = (Button)findViewById(R.id.button12);
        btn13 = (Button)findViewById(R.id.button13);
        btn14 = (Button)findViewById(R.id.hbutton14);
        btn18 = (Button)findViewById(R.id.button18);
        btn19 = (Button)findViewById(R.id.button19);
        btn153 = (Button)findViewById(R.id.button153);
        btn154 = (Button)findViewById(R.id.button154);
        btn155 = (Button)findViewById(R.id.button155);
        btn156 = (Button)findViewById(R.id.button156);
        btn157 = (Button)findViewById(R.id.button157);
        btn158 = (Button)findViewById(R.id.button158);
        btn162 = (Button)findViewById(R.id.button162);
        btn163 = (Button)findViewById(R.id.button163);
        btn164 = (Button)findViewById(R.id.button164);
        btn165 = (Button)findViewById(R.id.button165);
        btn166 = (Button)findViewById(R.id.button166);
        btn167 = (Button)findViewById(R.id.button167);
        btn168 = (Button)findViewById(R.id.button168);
        btn168 = (Button)findViewById(R.id.button168);
        btn113 = (Button)findViewById(R.id.button113);
        btn124 = (Button)findViewById(R.id.button124);
        btn125 = (Button)findViewById(R.id.button125);
        btn135 = (Button)findViewById(R.id.button135);
        btn136 = (Button)findViewById(R.id.button136);
        btn146 = (Button)findViewById(R.id.button146);
        btn147 = (Button)findViewById(R.id.button147);
        btn123 = (Button)findViewById(R.id.button123);
        btn133 = (Button)findViewById(R.id.button133);
        btn134 = (Button)findViewById(R.id.button134);
        btn143 = (Button)findViewById(R.id.button143);
        btn144 = (Button)findViewById(R.id.button144);
        btn145 = (Button)findViewById(R.id.button145);
        btn1.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn153.setOnClickListener(this);
        btn154.setOnClickListener(this);
        btn155.setOnClickListener(this);
        btn156.setOnClickListener(this);
        btn157.setOnClickListener(this);
        btn158.setOnClickListener(this);
        btn162.setOnClickListener(this);
        btn163.setOnClickListener(this);
        btn164.setOnClickListener(this);
        btn165.setOnClickListener(this);
        btn166.setOnClickListener(this);
        btn167.setOnClickListener(this);
        btn168.setOnClickListener(this);
        btn113.setOnClickListener(this);
        btn113.setOnClickListener(this);
        btn124.setOnClickListener(this);
        btn125.setOnClickListener(this);
        btn135.setOnClickListener(this);
        btn136.setOnClickListener(this);
        btn146.setOnClickListener(this);
        btn147.setOnClickListener(this);
        btn123.setOnClickListener(this);
        btn133.setOnClickListener(this);
        btn134.setOnClickListener(this);
        btn143.setOnClickListener(this);
        btn144.setOnClickListener(this);
        btn145.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                Intent i =  new Intent(this, DescAlcalinos.class);
                i.putExtra("ID", "Litio");
                i.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Li.htm14.jpg");
                startActivity(i);
                break;
            case R.id.button3:
                Intent i2 =  new Intent(this, DescAlcalinos.class);
                i2.putExtra("ID", "Sodio");
                i2.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Na.htm8.jpg");
                startActivity(i2);
                break;
            case R.id.button4:
                Intent i3 =  new Intent(this, DescAlcalinos.class);
                i3.putExtra("ID", "Potasio");
                i3.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/K.htm11.jpg");
                startActivity(i3);
                break;
            case R.id.button5:
                Intent i4 =  new Intent(this, DescAlcalinos.class);
                i4.putExtra("ID", "Rubidio");
                i4.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Rb.htm9.jpg");
                startActivity(i4);
                break;
            case R.id.button6:
                Intent i5 =  new Intent(this, DescAlcalinos.class);
                i5.putExtra("ID", "Cesio");
                i5.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Cs.htm3.gif");
                startActivity(i5);
                break;
            case R.id.button7:
                Intent i6 =  new Intent(this, DescAlcalinos.class);
                i6.putExtra("ID", "Estroncio");
                i6.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Sr.htm2.gif");
                startActivity(i6);
                break;
            case R.id.button9:
                Intent i7 =  new Intent(this, DescAlcalinoterreos.class);
                i7.putExtra("ID", "Berilio");
                i7.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Be-en.8.jpg");
                startActivity(i7);
                break;
            case R.id.button10:
                Intent i8 =  new Intent(this, DescAlcalinoterreos.class);
                i8.putExtra("ID", "Magnesio");
                i8.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Mg-en.2.jpg");
                startActivity(i8);
                break;
            case R.id.button11:
                Intent i9 =  new Intent(this, DescAlcalinoterreos.class);
                i9.putExtra("ID", "Calcio");
                i9.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Ca-en.14.jpg");
                startActivity(i9);
                break;
            case R.id.button12:
                Intent i10 =  new Intent(this, DescAlcalinoterreos.class);
                i10.putExtra("ID", "Estroncio");
                i10.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Sr-en.7.gif");
                startActivity(i10);
                break;
            case  R.id.button13:
                Intent i11 =  new Intent(this, DescAlcalinoterreos.class);
                i11.putExtra("ID", "Bario");
                i11.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Ba-en.7.jpg");
                startActivity(i11);
                break;
            case R.id.hbutton14:
                Intent i12 =  new Intent(this, DescAlcalinoterreos.class);
                i12.putExtra("ID", "Radio");
                i12.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Ra-en.3.jpg");
                startActivity(i12);
                break;
            case R.id.button18:
                Intent i13 =  new Intent(this, DescMetalesTranscision.class);
                i13.putExtra("ID", "Escandio");
                i13.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Sc.htm17.jpg");
                startActivity(i13);
                break;
            case R.id.button19:
                Intent i14 =  new Intent(this, DescMetalesTranscision.class);
                i14.putExtra("ID", "Itrio");
                i14.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Y.htm3.jpg");
                startActivity(i14);
                break;
            case R.id.button153:
                Intent i15 =  new Intent(this, DescHalogenos.class);
                i15.putExtra("ID", "Fluor");
                i15.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/F.htm27.jpg");
                startActivity(i15);
                break;
            case R.id.button154:
                Intent i16 =  new Intent(this, DescHalogenos.class);
                i16.putExtra("ID", "Cloro");
                i16.putExtra("Image", "https://es.wikipedia.org/wiki/Cloro#/media/File:Chlorine_liquid_in_an_ampoule.jpg");
                startActivity(i16);
                break;
            case R.id.button155:
                Intent i17 =  new Intent(this, DescHalogenos.class);
                i17.putExtra("ID", "Bromo");
                i17.putExtra("Image", "https://es.wikipedia.org/wiki/Bromo#/media/File:Bromine_vial_in_acrylic_cube.jpg");
                startActivity(i17);
                break;
            case R.id.button156:
                Intent i18 =  new Intent(this, DescHalogenos.class);
                i18.putExtra("ID", "Yodo");
                i18.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/I.htm8.gif");
                startActivity(i18);
                break;
            case R.id.button157:
                Intent i19 =  new Intent(this, DescHalogenos.class);
                i19.putExtra("ID", "Astato");
                i19.putExtra("Image", "https://f4.bcbits.com/img/a2646001305_10.jpg");
                startActivity(i19);
                break;
            case R.id.button158:
                Intent i20 =  new Intent(this, DescHalogenos.class);
                i20.putExtra("ID", "Tennessie");
                i20.putExtra("Image", "https://f4.bcbits.com/img/a2646001305_10.jpg");
                startActivity(i20);
                break;
            case R.id.button162:
                Intent i21 =  new Intent(this, DescGasesNobles.class);
                i21.putExtra("ID", "Helio");
                i21.putExtra("Image", "https://es.wikipedia.org/wiki/Helio#/media/File:Helium_discharge_tube.jpg");
                startActivity(i21);
                break;
            case R.id.button163:
                Intent i22 =  new Intent(this, DescGasesNobles.class);
                i22.putExtra("ID", "Neon");
                i22.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Ne.htm11.jpg");
                startActivity(i22);
                break;
            case R.id.button164:
                Intent i23 =  new Intent(this, DescGasesNobles.class);
                i23.putExtra("ID", "Argon");
                i23.putExtra("Image", "https://es.wikipedia.org/wiki/Arg%C3%B3n#/media/File:Argon_discharge_tube.jpg");
                startActivity(i23);
                break;
            case R.id.button165:
                Intent i24 =  new Intent(this, DescGasesNobles.class);
                i24.putExtra("ID", "Kripton");
                i24.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Kr.htm12.jpg");
                startActivity(i24);
                break;
            case R.id.button166:
                Intent i25 =  new Intent(this, DescGasesNobles.class);
                i25.putExtra("ID", "Xenon");
                i25.putExtra("Image", "https://es.wikipedia.org/wiki/Xen%C3%B3n#/media/File:Xenon_discharge_tube.jpg");
                startActivity(i25);
                break;
            case R.id.button167:
                Intent i26 =  new Intent(this, DescGasesNobles.class);
                i26.putExtra("ID", "Radon");
                i26.putExtra("Image", "https://f4.bcbits.com/img/a2646001305_10.jpg");
                startActivity(i26);
                break;
            case R.id.button168:
                Intent i27 =  new Intent(this, DescGasesNobles.class);
                i27.putExtra("ID", "Oganeson");
                i27.putExtra("Image", "https://f4.bcbits.com/img/a2646001305_10.jpg");
                startActivity(i27);
                break;
            case R.id.button113:
                Intent i28 =  new Intent(this, DescMetaloides.class);
                i28.putExtra("ID", "Boro");
                i28.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/B-en.h9.jpg");
                startActivity(i28);
                break;
            case R.id.button124:
                Intent i29 =  new Intent(this, DescMetaloides.class);
                i29.putExtra("ID", "Silicio");
                i29.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Si-en.4.jpg");
                startActivity(i29);
                break;
            case R.id.button125:
                Intent i30 =  new Intent(this, DescMetaloides.class);
                i30.putExtra("ID", "Germanio");
                i30.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Ge-en.41.jpg");
                startActivity(i30);
                break;
            case R.id.button135:
                Intent i31 =  new Intent(this, DescMetaloides.class);
                i31.putExtra("ID", "Arsenico");
                i31.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/As-en.4.jpg");
                startActivity(i31);
                break;
            case R.id.button136:
                Intent i32 =  new Intent(this, DescMetaloides.class);
                i32.putExtra("ID", "Antimonio");
                i32.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Sb-en.10.jpg");
                startActivity(i32);
                break;
            case R.id.button146:
                Intent i33 =  new Intent(this, DescMetaloides.class);
                i33.putExtra("ID", "Telurio");
                i33.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Te-en.11.jpg");
                startActivity(i33);
                break;
            case R.id.button147:
                Intent i34 =  new Intent(this, DescMetaloides.class);
                i34.putExtra("ID", "Polonio");
                i34.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Po-en.12.jpg");
                startActivity(i34);
                break;
            case R.id.button123:
                Intent i35 =  new Intent(this, DescNoMetales.class);
                i35.putExtra("ID", "Carbono");
                i35.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/C-en.h17.jpg");
                startActivity(i35);
                break;
            case R.id.button133:
                Intent i36 =  new Intent(this, DescNoMetales.class);
                i36.putExtra("ID", "Nitrogeno");
                i36.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/N-en.h1.jpg");
                startActivity(i36);
                break;
            case R.id.button134:
                Intent i37 =  new Intent(this, DescNoMetales.class);
                i37.putExtra("ID", "Oxigeno");
                i37.putExtra("Image", "https://es.wikipedia.org/wiki/Ox%C3%ADgeno#/media/File:Oxygen_discharge_tube.jpg");
                startActivity(i37);
                break;
            case R.id.button143:
                Intent i38 =  new Intent(this, DescNoMetales.class);
                i38.putExtra("ID", "Fosforo");
                i38.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/P-en.h10.jpg");
                startActivity(i38);
                break;
            case R.id.button144:
                Intent i39 =  new Intent(this, DescNoMetales.class);
                i39.putExtra("ID", "Azufre");
                i39.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/S-en.h2.jpg");
                startActivity(i39);
                break;
            case R.id.button145:
                Intent i40 =  new Intent(this, DescNoMetales.class);
                i40.putExtra("ID", "Selenio");
                i40.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Se-en.1.jpg");
                startActivity(i40);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.alcalinos_button) {
            Intent i = new Intent(MainActivity.this, Alcalinos.class);
            startActivity(i);
        } else if (id == R.id.alcalinoterreos_button) {
            Intent i = new Intent(MainActivity.this, Alcalinoterreos.class);
            startActivity(i);
        } else if (id == R.id.metales_transicion_button) {
            Intent i = new Intent(MainActivity.this, MetalesTransicion.class);
            startActivity(i);
        } else if (id == R.id.otros_metales_button) {
            Intent i = new Intent(MainActivity.this, OtrosMetales.class);
            startActivity(i);
        } else if (id == R.id.metaloides_button) {
            Intent i = new Intent(MainActivity.this, Metaloides.class);
            startActivity(i);
        } else if (id == R.id.no_metales_button) {
            Intent i = new Intent(MainActivity.this, NoMetales.class);
            startActivity(i);
        }else if (id == R.id.halogenos_button) {
            Intent i = new Intent(MainActivity.this, Halogenos.class);
            startActivity(i);
        }else if (id == R.id.gases_nobles_button) {
            Intent i = new Intent(MainActivity.this, GasesNobles.class);
            startActivity(i);
        }else if (id == R.id.lantanidos_button) {
            Intent i = new Intent(MainActivity.this, Lantanidos.class);
            startActivity(i);
        }else if (id == R.id.actinidos_button) {
            Intent i = new Intent(MainActivity.this, Actinidos.class);
            startActivity(i);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
