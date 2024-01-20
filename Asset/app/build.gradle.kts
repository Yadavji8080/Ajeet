plugins {
    id("com.android.application")
}

android {
    namespace = "com.ajeet.asset"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ajeet.asset"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}


dependencies {


    implementation(platform("com.google.firebase:firebase-bom:32.7.0"))
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("com.google.firebase:firebase-storage:20.3.0")

    implementation ("com.github.zagum:SpeechRecognitionView:1.2.2")
    implementation("androidx.appcompat:appcompat:1.7.0-alpha03")
    implementation("com.google.android.material:material:1.12.0-alpha03")
    implementation("androidx.constraintlayout:constraintlayout:${rootProject.extra["constraintlayoutVersion"]}")
    implementation("org.tensorflow:tensorflow-api:0.5.0")
    implementation("androidx.appcompat:appcompat:1.7.0-alpha03")
    implementation("androidx.constraintlayout:constraintlayout:2.2.0-alpha13")
    implementation("org.tensorflow:tensorflow-android:1.13.1")
    implementation("com.google.android.gms:play-services-vision:20.1.3")
    implementation("com.dlazaro66.qrcodereaderview:qrcodereaderview:2.0.2")
    implementation("ai.api:sdk:2.0.7")
    implementation("ai.api:libai:1.6.12")
    implementation("com.android.volley:volley:1.2.1")
    implementation("com.android.volley:volley-cronet:1.2.1")
    implementation("androidx.annotation:annotation:1.7.1")
    implementation("com.google.android.gms:play-services-maps:18.2.0")
    implementation("junit:junit:4.13.2")
    implementation("com.google.firebase:firebase-auth:22.3.0")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation("com.google.android.gms:play-services-places:17.0.0")
    implementation("com.google.firebase:firebase:21.1.1")
    implementation("com.firebaseui:firebase-ui-auth:8.0.2")
    implementation("com.google.firebase:firebase-firestore:24.10.0")
    implementation("com.firebaseui:firebase-ui-firestore:8.0.2")
    implementation("com.github.kenglxn.QRGen:android:2.2.0")
    implementation("com.itextpdf:itextg:5.5.10")
    implementation("com.google.android.material:material:1.12.0-alpha03")
    //noinspection GradleCompatible
    implementation("androidx.legacy:legacy:1.0.0")
    implementation("com.jjoe64:graphview:4.2.2")
    implementation("androidx.recyclerview:recyclerview:1.4.0-alpha01")
    implementation("com.google.firebase:firebase-dynamic-links:21.2.0")
    implementation("com.opencsv:opencsv:5.9")
    implementation("com.google.android.material:material:1.12.0-alpha03")
    implementation("com.mikhaellopez:circularimageview:4.3.1")
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("com.android.tools.build:gradle:8.4.0-alpha04")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.0.0-Beta3")
    implementation(files("libs/ab.jar"))
    implementation(files("libs/ab1.jar"))
    implementation(files("libs/activation.jar"))
    implementation(files("libs/additionnal.jar"))
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("androidmads.library.qrgenearator:QRGenearator:1.0.3’")
    implementation("androidx.test.espresso:espresso:3.6.0-alpha02")
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("com.android.tools.build:gradle:8.4.0-alpha04")
    testImplementation(files("libs/javase-3.1.0.jar"))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso:3.6.0-alpha02")
}
