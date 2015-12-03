package com.squareup.duktape.tests;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.squareup.jniexample.Hello;

public final class OctaneActivity extends Activity {
  @Bind(R.id.name) EditText editName;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.octane);
    ButterKnife.bind(this);
  }

  @OnClick(R.id.greet) void click() {
    String name = editName.getText().toString();
    String greeting = Hello.greet(name);
    Toast.makeText(this, greeting, Toast.LENGTH_SHORT).show();
  }
}
