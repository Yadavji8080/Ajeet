buildscript {


    val agp_version by extra("7.0.0")
    val agp_version1 by extra("7.2.0")
    val agp_version2 by extra("8.2.1")
    val agp_version3 by extra("7.2.0")
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.2.0" apply false
}
val constraintlayoutVersion by extra("2.2.0-alpha13")
