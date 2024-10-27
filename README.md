# AndroidToast
A simple Android Toast Library.

## Installation

To use this library in your Android project, follow these steps:

### Step 1: Add the JitPack repository to your build file

Add the JitPack repository in your root `build.gradle` at the end of `repositories`:

```gradle
allprojects {
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
### Step 2: Add the dependency
Add the following dependency to your app module's build.gradle file:

```gradle
dependencies {
     implementation 'com.github.pkrsingh06:Toast:1.0.0'

}
```
### Step 3: Use a MainActivity
```gradle
        Toaster.simpleToast(this,"jai shree ram")
```





