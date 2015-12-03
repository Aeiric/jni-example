package com.squareup.jniexample;

public final class Hello {
  static {
    System.loadLibrary("jniexample");
  }

  public static native String greet(String name);
}
