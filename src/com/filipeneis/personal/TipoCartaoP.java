package com.filipeneis.personal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TipoCartaoP extends Activity {
	Button bt1 , bt2 , bt3;
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tipocartao);
        
        bt2 = (Button)
        findViewById (R.id.button2);
        
        bt3 = (Button)
                findViewById(R.id.button3);
        bt1 = (Button)
                findViewById(R.id.button1);
        
        bt1.setOnClickListener(new View.OnClickListener() {
			
     			@Override
     			public void onClick(View arg0) {
     				
     				Intent trocatela = new
     						Intent(TipoCartaoP.this,TipoPessoa.class);
     				TipoCartaoP.this.startActivity(trocatela);
     				TipoCartaoP.this.finish();
     				
     			}
     		});
         
        bt2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent trocatela = new
						Intent(TipoCartaoP.this,TipoPessoa.class);
				TipoCartaoP.this.startActivity(trocatela);
				TipoCartaoP.this.finish();
				
			}
		});  
        bt3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				Intent trocatela = new
						Intent(TipoCartaoP.this,TipoPessoa.class);
				TipoCartaoP.this.startActivity(trocatela);
				TipoCartaoP.this.finish();
			}
		});
    }
}


