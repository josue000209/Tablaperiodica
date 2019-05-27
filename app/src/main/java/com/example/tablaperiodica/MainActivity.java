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
import com.example.tablaperiodica.Descripciones.DescActinidos;
import com.example.tablaperiodica.Descripciones.DescAlcalinos;
import com.example.tablaperiodica.Descripciones.DescAlcalinoterreos;
import com.example.tablaperiodica.Descripciones.DescGasesNobles;
import com.example.tablaperiodica.Descripciones.DescHalogenos;
import com.example.tablaperiodica.Descripciones.DescLantanidos;
import com.example.tablaperiodica.Descripciones.DescMetalesTranscision;
import com.example.tablaperiodica.Descripciones.DescMetaloides;
import com.example.tablaperiodica.Descripciones.DescNoMetales;
import com.example.tablaperiodica.Descripciones.DescOtrosMetales;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    Elemento ele = new Elemento();
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn9,btn10,btn11,btn12,btn13,btn14,btn18,btn19,btn153,btn154,btn155,btn156,btn157,btn158;
    Button btn162,btn163,btn164,btn165,btn166,btn167,btn168,btn113,btn124,btn125,btn135,btn136,btn146,btn147,btn123,btn133,btn134,btn143;
    Button btn144,btn145,btn114,btn115,btn116,btn117,btn127,btn137,btn128,btn148,btn30,btn40,btn50,btn60,btn70,btn80,btn90,btn100,btn110;
    Button btn120,btn130,btn140,btn150,btn160,btn170,btn31,btn41,btn51,btn61,btn71,btn81,btn91,btn101,btn111,btn121,btn131,btn141,btn151;
    Button btn161,btn171;

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
        btn114 = (Button)findViewById(R.id.button114);
        btn115 = (Button)findViewById(R.id.button115);
        btn116 = (Button)findViewById(R.id.button116);
        btn117 = (Button)findViewById(R.id.button117);
        btn127 = (Button)findViewById(R.id.button127);
        btn137 = (Button)findViewById(R.id.button137);
        btn148 = (Button)findViewById(R.id.button148);
        btn128 = (Button)findViewById(R.id.button128);
        btn30 = (Button)findViewById(R.id.button30);
        btn40 = (Button)findViewById(R.id.button40);
        btn50 = (Button)findViewById(R.id.button50);
        btn60 = (Button)findViewById(R.id.button60);
        btn70 = (Button)findViewById(R.id.button70);
        btn80 = (Button)findViewById(R.id.button80);
        btn90 = (Button)findViewById(R.id.button90);
        btn100 = (Button)findViewById(R.id.button100);
        btn110 = (Button)findViewById(R.id.button110);
        btn120 = (Button)findViewById(R.id.button120);
        btn130 = (Button)findViewById(R.id.button130);
        btn140 = (Button)findViewById(R.id.button140);
        btn150 = (Button)findViewById(R.id.button150);
        btn160 = (Button)findViewById(R.id.button160);
        btn170 = (Button)findViewById(R.id.button170);
        btn31 = (Button)findViewById(R.id.button31);
        btn41 = (Button)findViewById(R.id.button41);
        btn51 = (Button)findViewById(R.id.button51);
        btn61 = (Button)findViewById(R.id.button61);
        btn71 = (Button)findViewById(R.id.button71);
        btn81 = (Button)findViewById(R.id.button81);
        btn91 = (Button)findViewById(R.id.button91);
        btn101 = (Button)findViewById(R.id.button101);
        btn111 = (Button)findViewById(R.id.button111);
        btn121 = (Button)findViewById(R.id.button121);
        btn131 = (Button)findViewById(R.id.button131);
        btn141 = (Button)findViewById(R.id.button141);
        btn151 = (Button)findViewById(R.id.button151);
        btn161 = (Button)findViewById(R.id.button161);
        btn171 = (Button)findViewById(R.id.button171);
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
        btn114.setOnClickListener(this);
        btn115.setOnClickListener(this);
        btn116.setOnClickListener(this);
        btn117.setOnClickListener(this);
        btn127.setOnClickListener(this);
        btn137.setOnClickListener(this);
        btn128.setOnClickListener(this);
        btn148.setOnClickListener(this);
        btn30.setOnClickListener(this);
        btn40.setOnClickListener(this);
        btn50.setOnClickListener(this);
        btn60.setOnClickListener(this);
        btn70.setOnClickListener(this);
        btn80.setOnClickListener(this);
        btn90.setOnClickListener(this);
        btn100.setOnClickListener(this);
        btn110.setOnClickListener(this);
        btn120.setOnClickListener(this);
        btn130.setOnClickListener(this);
        btn140.setOnClickListener(this);
        btn150.setOnClickListener(this);
        btn160.setOnClickListener(this);
        btn170.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn41.setOnClickListener(this);
        btn51.setOnClickListener(this);
        btn61.setOnClickListener(this);
        btn71.setOnClickListener(this);
        btn81.setOnClickListener(this);
        btn91.setOnClickListener(this);
        btn101.setOnClickListener(this);
        btn111.setOnClickListener(this);
        btn121.setOnClickListener(this);
        btn131.setOnClickListener(this);
        btn141.setOnClickListener(this);
        btn151.setOnClickListener(this);
        btn161.setOnClickListener(this);
        btn171.setOnClickListener(this);
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
            case R.id.button114:
                Intent i41 =  new Intent(this, DescOtrosMetales.class);
                i41.putExtra("ID", "Aluminio");
                i41.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Al.htm1.jpg");
                startActivity(i41);
                break;
            case R.id.button115:
                Intent i42 =  new Intent(this, DescOtrosMetales.class);
                i42.putExtra("ID", "Galio");
                i42.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Ga.htm30.jpg");
                startActivity(i42);
                break;
            case R.id.button116:
                Intent i43 =  new Intent(this, DescOtrosMetales.class);
                i43.putExtra("ID", "Indio");
                i43.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/In.htm9.jpg");
                startActivity(i43);
                break;
            case R.id.button117:
                Intent i44 =  new Intent(this, DescOtrosMetales.class);
                i44.putExtra("ID", "Talio");
                i44.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Tl.htm3.jpg");
                startActivity(i44);
                break;
            case R.id.button127:
                Intent i45 =  new Intent(this, DescOtrosMetales.class);
                i45.putExtra("ID", "Plomo");
                i45.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Pb.htm2.jpg");
                startActivity(i45);
                break;
            case R.id.button137:
                Intent i46 =  new Intent(this, DescOtrosMetales.class);
                i46.putExtra("ID", "Bismuto");
                i46.putExtra("Image", "https://www.lenntech.com/images/espanol/tabla-peiodica/Bi.htm10.jpg");
                startActivity(i46);
                break;
            case R.id.button128:
                Intent i47 =  new Intent(this, DescOtrosMetales.class);
                i47.putExtra("ID", "Floverio");
                i47.putExtra("Image", "https://f4.bcbits.com/img/a2646001305_10.jpg");
                startActivity(i47);
                break;
            case R.id.button148:
                Intent i48 =  new Intent(this, DescOtrosMetales.class);
                i48.putExtra("ID", "Livermorio");
                i48.putExtra("Image", "https://f4.bcbits.com/img/a2646001305_10.jpg");
                startActivity(i48);
                break;
            case R.id.button30:
                Intent i49 =  new Intent(this, DescLantanidos.class);
                i49.putExtra("ID", "Lantanio");
                i49.putExtra("Image", "https://elementos.org.es/img-elementos.org.es/lantano.jpg");
                startActivity(i49);
                break;
            case R.id.button40:
                Intent i50 =  new Intent(this, DescLantanidos.class);
                i50.putExtra("ID", "Cerio");
                i50.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Ce-en.16.jpg");
                startActivity(i50);
                break;
            case R.id.button50:
                Intent i51 =  new Intent(this, DescLantanidos.class);
                i51.putExtra("ID", "Praseodimio");
                i51.putExtra("Image", "https://www.ecured.cu/Praseodimio#/media/File:Praseodimio.JPG");
                startActivity(i51);
                break;
            case R.id.button60:
                Intent i52 =  new Intent(this, DescLantanidos.class);
                i52.putExtra("ID", "Neodimio");
                i52.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Nd-en.8.jpg");
                startActivity(i52);
                break;
            case R.id.button70:
                Intent i53 =  new Intent(this, DescLantanidos.class);
                i53.putExtra("ID", "Prometio");
                i53.putExtra("Image", "http://100cia.site/media/k2/items/cache/31d3d648bcd5264f68bcb78a6a92b36d_M.jpg");
                startActivity(i53);
                break;
            case R.id.button80:
                Intent i54 =  new Intent(this, DescLantanidos.class);
                i54.putExtra("ID", "Samario");
                i54.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Sm-en.5.jpg");
                startActivity(i54);
                break;
            case R.id.button90:
                Intent i55 =  new Intent(this, DescLantanidos.class);
                i55.putExtra("ID", "Europio");
                i55.putExtra("Image", "https://isqch.files.wordpress.com/2013/12/s13.jpg");
                startActivity(i55);
                break;
            case R.id.button100:
                Intent i56 =  new Intent(this, DescLantanidos.class);
                i56.putExtra("ID", "Gadolinio");
                i56.putExtra("Image", "https://conceptodefinicion.de/wp-content/uploads/2015/12/gadolinio.jpg");
                startActivity(i56);
                break;
            case R.id.button110:
                Intent i57 =  new Intent(this, DescLantanidos.class);
                i57.putExtra("ID", "Terbio");
                i57.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Tb-en.9.jpg");
                startActivity(i57);
                break;
            case R.id.button120:
                Intent i58 =  new Intent(this, DescLantanidos.class);
                i58.putExtra("ID", "Disprosio");
                i58.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Dy-en.31.jpg");
                startActivity(i58);
                break;
            case R.id.button130:
                Intent i59 =  new Intent(this, DescLantanidos.class);
                i59.putExtra("ID", "Holmio");
                i59.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Ho-en.46.jpg");
                startActivity(i59);
                break;
            case R.id.button140:
                Intent i60 =  new Intent(this, DescLantanidos.class);
                i60.putExtra("ID", "Erbio");
                i60.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Er-en.32.jpg");
                startActivity(i60);
                break;
            case R.id.button150:
                Intent i61 =  new Intent(this, DescLantanidos.class);
                i61.putExtra("ID", "Tulio");
                i61.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Tm-en.15.jpg");
                startActivity(i61);
                break;
            case R.id.button160:
                Intent i62 =  new Intent(this, DescLantanidos.class);
                i62.putExtra("ID", "Iterbio");
                i62.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Yb-en.23.jpg");
                startActivity(i62);
                break;
            case R.id.button170:
                Intent i63 =  new Intent(this, DescLantanidos.class);
                i63.putExtra("ID", "Lutecio");
                i63.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Lu-en.9.jpg");
                startActivity(i63);
                break;
            case R.id.button31:
                Intent i64 =  new Intent(this, DescActinidos.class);
                i64.putExtra("ID", "Actinio");
                i64.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Ac-en.1.jpg");
                startActivity(i64);
                break;
            case R.id.button41:
                Intent i65 =  new Intent(this, DescActinidos.class);
                i65.putExtra("ID", "Torio");
                i65.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Th-en.12.jpg");
                startActivity(i65);
                break;
            case R.id.button51:
                Intent i66 =  new Intent(this, DescActinidos.class);
                i66.putExtra("ID", "Protactinio");
                i66.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Pa-en.7.jpg");
                startActivity(i66);
                break;
            case R.id.button61:
                Intent i67 =  new Intent(this, DescActinidos.class);
                i67.putExtra("ID", "Uranio");
                i67.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/U-en.h16.gif");
                startActivity(i67);
                break;
            case R.id.button71:
                Intent i68 =  new Intent(this, DescActinidos.class);
                i68.putExtra("ID", "Neptunio");
                i68.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Np-en.4.jpg");
                startActivity(i68);
                break;
            case R.id.button81:
                Intent i69 =  new Intent(this, DescActinidos.class);
                i69.putExtra("ID", "Plutonio");
                i69.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Pu-en.2.jpg");
                startActivity(i69);
                break;
            case R.id.button91:
                Intent i70 =  new Intent(this, DescActinidos.class);
                i70.putExtra("ID", "Americio");
                i70.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Am-en.1.jpg");
                startActivity(i70);
                break;
            case R.id.button101:
                Intent i71 =  new Intent(this, DescActinidos.class);
                i71.putExtra("ID", "Curio");
                i71.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Cm-en.24.gif");
                startActivity(i71);
                break;
            case R.id.button111:
                Intent i72 =  new Intent(this, DescActinidos.class);
                i72.putExtra("ID", "Berkelio");
                i72.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Bk-en.12.jpg");
                startActivity(i72);
                break;
            case R.id.button121:
                Intent i73 =  new Intent(this, DescActinidos.class);
                i73.putExtra("ID", "Californio");
                i73.putExtra("Image", "https://es.wikipedia.org/wiki/Californio#/media/File:Californium.jpg");
                startActivity(i73);
                break;
            case R.id.button131:
                Intent i74 =  new Intent(this, DescActinidos.class);
                i74.putExtra("ID", "Einstenio");
                i74.putExtra("Image", "https://es.wikipedia.org/wiki/Einstenio#/media/File:Einsteinium.jpg");
                startActivity(i74);
                break;
            case R.id.button141:
                Intent i75 =  new Intent(this, DescActinidos.class);
                i75.putExtra("ID", "Fermio");
                i75.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Fm-en.37.jpg");
                startActivity(i75);
                break;
            case R.id.button151:
                Intent i76 =  new Intent(this, DescActinidos.class);
                i76.putExtra("ID", "Mendelevio");
                i76.putExtra("Image", "https://conceptodefinicion.de/wp-content/uploads/2015/12/mendelevio.jpg");
                startActivity(i76);
                break;
            case R.id.button161:
                Intent i77 =  new Intent(this, DescActinidos.class);
                i77.putExtra("ID", "Nobelio");
                i77.putExtra("Image", "https://f4.bcbits.com/img/a2646001305_10.jpg");
                startActivity(i77);
                break;
            case R.id.button171:
                Intent i78 =  new Intent(this, DescActinidos.class);
                i78.putExtra("ID", "Lawrencio");
                i78.putExtra("Image", "https://www.lenntech.com/images/Periodic-chart-elements/Lr-en.11.jpg");
                startActivity(i78);
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
