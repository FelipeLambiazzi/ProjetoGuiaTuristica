package com.example.guiaturisticoex1ac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image;
        image = (ImageView) findViewById(R.id.imageViewIguatemi);
        image.setImageResource(R.drawable.iguatemi);

        image = (ImageView) findViewById(R.id.imageViewMuseu);
        image.setImageResource(R.drawable.museusorocaba);

        image = (ImageView) findViewById(R.id.imageViewParque);
        image.setImageResource(R.drawable.parquedasaguas);
    }

    public void btnAbrirTelaIguatemi(View view) {
        Bundle params = new Bundle();
        Intent intentIguatemi = new Intent(this, DetalhesDoLocal.class);
        intentIguatemi.putExtra("nome", "Shopping Iguatemi");
        intentIguatemi.putExtra("imagem", R.drawable.iguatemi);
        intentIguatemi.putExtra("descricao", "Maior Shopping de Sorocaba");
        intentIguatemi.putExtra("telefone", "tel:0151532283305");
        intentIguatemi.putExtra("localizacao", "geo:-23.533672951458662, -47.46285091197934");
        intentIguatemi.putExtra("navegador", "https://iguatemi.com.br/esplanada/");
        startActivity(intentIguatemi);
    }

    public void btnAbrirTelaParque(View view) {
        Intent intentParque = new Intent(this, DetalhesDoLocal.class);
        intentParque.putExtra("nome", "Parque das aguas");
        intentParque.putExtra("imagem", R.drawable.parquedasaguas);
        intentParque.putExtra("descricao", "Contato Urbano com o Parque");
        intentParque.putExtra("localizacao", "geo: -23.469538, -47.446180");//https://agendasorocaba.com.br/parque-aguas/
        intentParque.putExtra("navegador", "https://agendasorocaba.com.br/parque-aguas/");
        startActivity(intentParque);
    }

    public void btnAbrirTelaMuseu(View view) {
        Intent intentMuseu = new Intent(this, DetalhesDoLocal.class);
        intentMuseu.putExtra("nome", "Museu de História de Sorocaba");
        intentMuseu.putExtra("imagem", R.drawable.museusorocaba);
        intentMuseu.putExtra("descricao", "Conhecendo a História");
        intentMuseu.putExtra("localizacao", "geo:-23.506710, -47.438050");
        intentMuseu.putExtra("navegador", "https://turismo.sorocaba.sp.gov.br/visite/museu-historico-sorocabano/");
        startActivity(intentMuseu);
    }
}

