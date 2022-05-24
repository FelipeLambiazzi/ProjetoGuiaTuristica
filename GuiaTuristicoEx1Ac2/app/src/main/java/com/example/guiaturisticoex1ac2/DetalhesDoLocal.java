package com.example.guiaturisticoex1ac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetalhesDoLocal extends AppCompatActivity {
    TextView txtTitulo;
    TextView txtDescricao;
    ImageView imageDetalhes;
    Button btnTelefonar;
    Button btnLocalizacao;
    Button btnSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_do_local);
        Intent intent = getIntent();
        Bundle params = getIntent().getExtras();

        txtTitulo = (TextView) findViewById(R.id.txtTitulo);
        String nome = getIntent().getStringExtra("nome");
        txtTitulo.setText(nome);

        txtDescricao = (TextView) findViewById(R.id.txtDescricao);
        String descricao = getIntent().getStringExtra("descricao");
        txtDescricao.setText(descricao);

        imageDetalhes = (ImageView) findViewById(R.id.imageDetalhes);
        imageDetalhes.setImageResource(intent.getIntExtra("imagem",0));

        btnSite = (Button) findViewById(R.id.btnSite);
        String url = getIntent().getStringExtra("site");
        btnSite.setText(url);

        btnLocalizacao = (Button) findViewById(R.id.btnLocalizacao);
        String loc = getIntent().getStringExtra("localizacao");

    }

}