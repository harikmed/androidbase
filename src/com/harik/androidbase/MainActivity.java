package com.harik.androidbase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
Button bconvertir;
EditText edh,edolar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	//liaison entre composant graphique et les composant en code source java
bconvertir=(Button) findViewById(R.id.bconvertir);
edh=(EditText) findViewById(R.id.tdh);
edolar=(EditText) findViewById(R.id.tdolar);
bconvertir.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		//on recupere le texte dans tdh
	String textdhs=edh.getText().toString();
	Toast.makeText(getApplicationContext(), "Vous avez saisi "+textdhs, Toast.LENGTH_LONG).show();
	//convertir le textdhs en double 
	double nombredhs=Double.parseDouble(textdhs);
	double prixDolar=nombredhs/10.2500;
	edolar.setText(""+prixDolar);
	
		
	}
});
	
	}
}
