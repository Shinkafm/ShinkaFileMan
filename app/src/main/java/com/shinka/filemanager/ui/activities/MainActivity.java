package com.shinka.filemanager.ui.activities;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.shinka.filemanager.ui.base.BaseActivity;
import com.shinka.filemanager.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
	
	  private ActivityMainBinding binding;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		    binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
		    setSupportActionBar(binding.toolbar);

		    binding.fab.setOnClickListener(v ->
          Toast.makeText(MainActivity.this, "Replace with your action", Toast.LENGTH_SHORT).show()
        );
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}