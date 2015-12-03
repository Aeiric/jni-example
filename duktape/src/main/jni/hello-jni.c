#include <string.h>
#include <jni.h>

JNIEXPORT jstring JNICALL
Java_com_squareup_jniexample_Hello_greet(JNIEnv *env, jclass type, jstring name_) {
  const char *name = (*env)->GetStringUTFChars(env, name_, 0);

  char *greeting;
  if (strcmp(name, "Jesse") == 0) {
    greeting = "Yo dog";
  } else {
    greeting = "Hello";
  }

  (*env)->ReleaseStringUTFChars(env, name_, name);

  return (*env)->NewStringUTF(env, greeting);
}