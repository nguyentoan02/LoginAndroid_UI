plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.myapplication1"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.myapplication1"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    // GIỮ LẠI CÁC DÒNG NÀY (đây là cách khai báo chuẩn qua libs.versions.toml)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity) // Giữ lại nếu bạn đang sử dụng hoặc có kế hoạch sử dụng các thành phần của Activity Compose hoặc tương tự. Nếu không dùng, có thể xóa.
    implementation(libs.constraintlayout)

    // Các dependencies cho Testing (cũng nên được khai báo qua libs.versions.toml)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // ĐÃ XÓA CÁC DÒNG TRÙNG LẶP SAU:
    // implementation 'androidx.appcompat:appcompat:1.6.1'
    // implementation 'com.google.android.material:material:1.11.0'
    // implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
}