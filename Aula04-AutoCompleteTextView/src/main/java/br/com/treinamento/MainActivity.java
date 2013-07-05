package br.com.treinamento;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

    private static final String[] nomes = new String[]{  "Joao", "Maria", "Josefina", "Miranda", "Ricardo", "Paulo" };

    private AutoCompleteTextView mAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_dropdown_item_1line, nomes);

        mAutoCompleteTextView = (AutoCompleteTextView) findViewById( R.id.autoCompleteTextView );
        mAutoCompleteTextView.setThreshold( 3 );      //Quantidade minima de caracteres que o usuario deve digitar para aparecer a sugestao
        mAutoCompleteTextView.setAdapter( adapter );

    }

}
