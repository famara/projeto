package com.filipeneis.personal;

import android.app.Activity;
import android.content.*;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class Telas3 extends Activity {
	Button bttela1 , bttela2;

	public void onCreate(Bundle savedInstanceState){

		super.onCreate(savedInstanceState);
		setContentView(R.layout.telafinal);

		bttela1 = (Button)
				findViewById(R.id.button1);

		bttela2 = (Button)
				findViewById(R.id.button2);


		bttela1.setOnClickListener(new View.OnClickListener() {


			@Override
			public void onClick(View arg0) {

				Intent troca = new
						Intent(Telas3.this, Personal_Card.class);
				Telas3.this.startActivity(troca);
				Telas3.this.finish();
			}
		});

		bttela2.setOnClickListener(new View.OnClickListener() {


			@Override
			public void onClick(View arg0) {

				Intent troca = new
						Intent(Telas3.this, TipoCartaoP.class);
				Telas3.this.startActivity(troca);
				Telas3.this.finish();
			}
		});
	}
}
