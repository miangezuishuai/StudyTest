#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_example_studytest_JniActivity_stringFromJNIWithC(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "This is C";
    return env->NewStringUTF(hello.c_str());
}

