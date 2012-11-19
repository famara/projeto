package com.filipeneis.personal;


import com.filipeneis.personal.Usuario;
import com.filipeneis.personal.Telas3;
import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class Usuario extends Activity {

	Button bttela1 , bttela2;

	public void onCreate(Bundle savedInstanceState){
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usuario);

		bttela1 = (Button)
				findViewById(R.id.button1);
		
		bttela2 = (Button)
				findViewById(R.id.button2);


		bttela1.setOnClickListener(new View.OnClickListener() {
    	 
     
			@Override
			public void onClick(View arg0) {

				Intent troca = new
						Intent(Usuario.this, Telas3.class);
				Usuario.this.startActivity(troca);
				Usuario.this.finish();
			}
		});


			bttela2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent troca = new
				Intent(Usuario.this,TipoPessoa.class);
				Usuario.this.startActivity(troca);
				Usuario.this.finish();

			}
		});
		}

	}








