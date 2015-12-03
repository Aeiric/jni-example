package com.squareup.jniexample;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.google.common.truth.Truth.assertThat;

@RunWith(AndroidJUnit4.class)
public final class HelloTest {
  @Test public void helloMatt() {
    assertThat(Hello.greet("Matt")).isEqualTo("Hello");
  }

  @Test public void helloJake() {
    assertThat(Hello.greet("Jake")).isEqualTo("Hello");
  }

  @Test public void helloJesse() {
    assertThat(Hello.greet("Jesse")).isEqualTo("Yo dog");
  }
}
