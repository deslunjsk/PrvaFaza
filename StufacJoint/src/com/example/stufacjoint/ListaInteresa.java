package com.example.stufacjoint;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class ListaInteresa extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_interesa);
		
		ImageButton pocetna=(ImageButton)findViewById(R.id.homegumb);
		pocetna.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i=new Intent(getApplicationContext(), GlavnaAktivnost.class);
				startActivity(i);
				
			}
		});
		
		
		ImageButton vlastita_lista=(ImageButton)findViewById(R.id.lista_mojih_interesa);
		vlastita_lista.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i=new Intent(getApplicationContext(), MojalListaInteresa.class);
				startActivity(i);
				
			}
		});
		
		ImageButton novi_predlozak=(ImageButton)findViewById(R.id.novipredlozak);
		novi_predlozak.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i=new Intent(getApplicationContext(), NoviPredlozak.class);
				startActivity(i);
				
			}
		});
		
		ImageButton facebook=(ImageButton)findViewById(R.id.facebookshare);
		facebook.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
				startActivity(i);
				
			}
		});
		
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lista_interesa, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast.makeText(ListaInteresa.this, "Dio aplikacije koji je jo� u razvoju...", Toast.LENGTH_LONG).show();
			return true;
		}else if(id==R.id.o_aplikaciji){
			o_razvoju sd = new o_razvoju(this);
			sd.show();
			return true;
			
		}
		return super.onOptionsItemSelected(item);
	}
}
