package com.filipeneis.personal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Personal_Card extends Activity {
Button bttela2, bttela3, bttela1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bttela2 = (Button)
        findViewById (R.id.button2);
        
        bttela3 = (Button)
                findViewById(R.id.button3);
        bttela1 = (Button)
                findViewById(R.id.button1);
        
        bttela1.setOnClickListener(new View.OnClickListener() {
			
     			@Override
     			public void onClick(View arg0) {
     				
     				Intent trocatela = new
     						Intent(Personal_Card.this,TipoCartaoP.class);
     				Personal_Card.this.startActivity(trocatela);
     				Personal_Card.this.finish();
     				
     			}
     		});
         
        bttela2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent trocatela = new
						Intent(Personal_Card.this,Usuario.class);
				Personal_Card.this.startActivity(trocatela);
				Personal_Card.this.finish();
				
			}
		});  
        bttela3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent trocatela = new
						Intent(Personal_Card.this,Usuario.class);
				Personal_Card.this.startActivity(trocatela);
				Personal_Card.this.finish();
			}
		});
    }
}

		

