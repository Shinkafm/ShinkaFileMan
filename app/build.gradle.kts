
plugins {
    id("com.android.application")
    
}

android {
    namespace = "com.shinka.filemanager"
    //noinspection GradleDependency
    compileSdk = 35
    
    defaultConfig {
        applicationId = "com.shinka.filemanager"
        minSdk = 22
        //noinspection OldTargetApi
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        
        vectorDrawables { 
            useSupportLibrary = true
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
        
    }
    
}

dependencies {


    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.14.0-alpha04")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("com.github.smailbarkouch:android-breadcrumb:1.0.0")
}
