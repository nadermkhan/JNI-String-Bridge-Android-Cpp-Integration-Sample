#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_nademkhan_example_jnistringbridge_MainActivity_getNativeString(JNIEnv* env, jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
