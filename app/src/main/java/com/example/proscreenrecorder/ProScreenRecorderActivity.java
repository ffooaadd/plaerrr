}

// drawable/gradient_light.xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <gradient
        android:angle="135"
        android:startColor="#667eea"
        android:centerColor="#764ba2"
        android:endColor="#f093fb"
        android:type="linear" />
</shape>

// drawable/gradient_dark.xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <gradient
        android:angle="135"
        android:startColor="#2C3E50"
        android:centerColor="#4A6741"
        android:endColor="#8E44AD"
        android:type="linear" />
</shape>

// drawable/circular_button_record.xml
<?xml version="1.0" encoding="utf-8"?>
<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="#40FFFFFF">
    <item>
        <shape android:shape="oval">
            <gradient
                android:angle="45"
                android:startColor="#FF6B6B"
                android:endColor="#FF8E8E"
                android:type="linear" />
            <stroke
                android:width="3dp"
                android:color="#FFFFFF" />
        </shape>
    </item>
</ripple>

// drawable/circular_button_stop.xml
<?xml version="1.0" encoding="utf-8"?>
<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="#40FFFFFF">
    <item>
        <shape android:shape="oval">
            <gradient
                android:angle="45"
                android:startColor="#E53E3E"
                android:endColor="#FC8181"
                android:type="linear" />
            <stroke
                android:width="3dp"
                android:color="#FFFFFF" />
        </shape>
    </item>
</ripple>

// drawable/circular_button_settings.xml
<?xml version="1.0" encoding="utf-8"?>
<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="#40FFFFFF">
    <item>
        <shape android:shape="oval">
            <gradient
                android:angle="45"
                android:startColor="#805AD5"
                android:endColor="#B794F6"
                android:type="linear" />
            <stroke
                android:width="2dp"
                android:color="#FFFFFF" />
        </shape>
    </item>
</ripple>

// drawable/circular_button_gallery.xml
<?xml version="1.0" encoding="utf-8"?>
<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="#40FFFFFF">
    <item>
        <shape android:shape="oval">
            <gradient
                android:angle="45"
                android:startColor="#38B2AC"
                android:endColor="#81E6D9"
                android:type="linear" />
            <stroke
                android:width="2dp"
                android:color="#FFFFFF" />
        </shape>
    </item>
</ripple>

// drawable/card_background.xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <solid android:color="#FFFFFF" />
    <corners android:radius="20dp" />
    <stroke
        android:width="1dp"
        android:color="#E2E8F0" />
</shape>

// drawable/floating_background.xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android">
    <solid android:color="#CC000000" />
    <corners android:radius="25dp" />
</shape>

// drawable/button_primary.xml
<?xml version="1.0" encoding="utf-8"?>
<ripple xmlns:android="http://schemas.android.com/apk/res/android"
    android:color="#40FFFFFF">
    <item>
        <shape>
            <gradient
                android:angle="45"
                android:startColor="#667eea"
                android:endColor="#764ba2"
                android:type="linear" />
            <corners android:radius="12dp" />
        </shape>
    </item>
</ripple>

// values/colors.xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="colorPrimary">#667eea</color>
    <color name="colorPrimaryDark">#5a67d8</color>
    <color name="colorAccent">#764ba2</color>
    
    <color name="recording_red">#E53E3E</color>
    <color name="ready_green">#68D391</color>
    <color name="text_primary">#2D3748</color>
    <color name="text_secondary">#4A5568</color>
    <color name="background_light">#F7FAFC</color>
    <color name="background_dark">#1A202C</color>
    
    <color name="gradient_start">#667eea</color>
    <color name="gradient_center">#764ba2</color>
    <color name="gradient_end">#f093fb</color>
</resources>

// values/strings.xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="app_name">ProScreenRecorder</string>
    <string name="record">تسجيل</string>
    <string name="stop">إيقاف</string>
    <string name="settings">إعدادات</string>
    <string name="gallery">معرض</string>
    <string name="ready_to_record">جاهز للتسجيل</string>
    <string name="recording">جاري التسجيل...</string>
    <string name="audio_recording">تسجيل الصوت</string>
    <string name="front_camera">الكاميرا الأمامية</string>
    <string name="dark_mode">الوضع الداكن</string>
    <string name="video_quality">جودة الفيديو</string>
    <string name="recording_finished">تم الانتهاء من التسجيل!</string>
    <string name="play">تشغيل</string>
    <string name="edit">تحرير</string>
    <string name="share">مشاركة</string>
    <string name="delete">حذف</string>
    <string name="save">حفظ</string>
    <string name="cancel">إلغاء</string>
    <string name="watermark">علامة مائية</string>
    <string name="auto_record">تسجيل تلقائي</string>
    <string name="volume">مستوى الصوت</string>
    <string name="settings_saved">تم حفظ الإعدادات</string>
    <string name="permissions_required">يتطلب التطبيق جميع الصلاحيات للعمل بشكل صحيح</string>
    <string name="video_deleted">تم حذف الفيديو</string>
    <string name="share_video">مشاركة الفيديو</string>
    <string name="recorded_with">تم تسجيله باستخدام ProScreenRecorder</string>
</resources>

// values/styles.xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
        <item name="colorPrimary">@color/colorPrimary</item>
        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
        <item name="colorAccent">@color/colorAccent</item>
        <item name="android:windowBackground">@color/background_light</item>
        <item name="android:statusBarColor">@color/colorPrimaryDark</item>
    </style>

    <style name="SwitchTheme" parent="Theme.AppCompat.Light">
        <item name="colorControlActivated">@color/colorPrimary</item>
        <item name="colorSwitchThumbNormal">@color/colorAccent</item>
        <item name="android:colorForeground">@color/colorPrimary</item>
    </style>

    <style name="CircularButton">
        <item name="android:layout_width">70dp</item>
        <item name="android:layout_height">70dp</item>
        <item name="android:layout_margin">8dp</item>
        <item name="android:textColor">#FFFFFF</item>
        <item name="android:textSize">12sp</item>
        <item name="android:elevation">6dp</item>
        <item name="android:stateListAnimator">@null</item>
    </style>
</resources>

// AndroidManifest.xml
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    package="com.proscreen.recorder">

    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
    <uses-permission android:name="android.permission.RECORD_AUDIO" />
    <uses-permission android:name="android.permission.CAMERA" />
    <uses-permission android:name="android.permission.SYSTEM_ALERT_WINDOW" />
    <uses-permission android:name="android.permission.FOREGROUND_SERVICE" />
    <uses-permission android:name="android.permission.WAKE_LOCK" />
    <uses-permission android:name="android.permission.INTERNET" />

    <application
        android:allowBackup="true"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:theme="@style/AppTheme"
        android:requestLegacyExternalStorage="true">

        <activity
            android:name=".MainActivity"
            android:screenOrientation="portrait"
            android:launchMode="singleTop">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="// MainActivity.java
package com.proscreen.recorder;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.PixelFormat;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ProScreenRecorder";
    private static final int REQUEST_CODE = 1000;
    private static final int REQUEST_PERMISSIONS = 1001;
    
    // UI Components
    private Button btnRecord, btnStop, btnSettings, btnGallery;
    private TextView tvTimer, tvStatus, tvCountdown;
    private Switch switchAudio, switchCamera, switchDarkMode;
    private SeekBar seekBarQuality;
    private ImageView imgLogo;
    private LinearLayout layoutMain, layoutControls;
    private RelativeLayout layoutFloating;
    
    // Recording Components
    private MediaProjectionManager mediaProjectionManager;
    private MediaProjection mediaProjection;
    private VirtualDisplay virtualDisplay;
    private MediaRecorder mediaRecorder;
    
    // Recording Properties
    private int screenWidth, screenHeight, screenDensity;
    private boolean isRecording = false;
    private boolean isAudioEnabled = true;
    private boolean isCameraEnabled = false;
    private boolean isDarkMode = false;
    private String outputPath;
    private long recordingStartTime;
    
    // Floating Window
    private WindowManager windowManager;
    private View floatingView;
    private boolean isFloatingVisible = false;
    
    // Timer
    private Handler timerHandler = new Handler();
    private Runnable timerRunnable;
    
    // Countdown
    private CountDownTimer countDownTimer;
    
    // Permissions
    private String[] permissions = {
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.RECORD_AUDIO,
        Manifest.permission.CAMERA,
        Manifest.permission.SYSTEM_ALERT_WINDOW
    }

// activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/layout_main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="@drawable/gradient_light"
    android:padding="24dp">

    <!-- الشعار والعنوان -->
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="40dp"
        android:layout_marginBottom="30dp">

        <ImageView
            android:id="@+id/img_logo"
            android:layout_width="80dp"
            android:layout_height="80dp"
            android:layout_centerHorizontal="true"
            android:src="@drawable/ic_logo"
            android:contentDescription="شعار التطبيق" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_below="@id/img_logo"
            android:layout_centerHorizontal="true"
            android:layout_marginTop="12dp"
            android:text="ProScreenRecorder"
            android:textSize="24sp"
            android:textStyle="bold"
            android:textColor="#2D3748"
            android:fontFamily="@font/roboto_bold" />

    </RelativeLayout>

    <!-- منطقة العداد والحالة -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:background="@drawable/card_background"
        android:padding="20dp"
        android:layout_marginBottom="30dp"
        android:elevation="8dp">

        <TextView
            android:id="@+id/tv_countdown"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:textSize="48sp"
            android:textStyle="bold"
            android:textColor="#E53E3E"
            android:visibility="gone"
            android:fontFamily="@font/roboto_bold" />

        <TextView
            android:id="@+id/tv_timer"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="00:00:00"
            android:textSize="32sp"
            android:textStyle="bold"
            android:textColor="#4A5568"
            android:fontFamily="@font/roboto_mono" />

        <TextView
            android:id="@+id/tv_status"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:layout_marginTop="8dp"
            android:text="جاهز للتسجيل"
            android:textSize="16sp"
            android:textColor="#68D391"
            android:fontFamily="@font/roboto_medium" />

    </LinearLayout>

    <!-- أزرار التحكم الرئيسية -->
    <LinearLayout
        android:id="@+id/layout_controls"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:gravity="center"
        android:layout_marginBottom="30dp">

        <Button
            android:id="@+id/btn_gallery"
            android:layout_width="70dp"
            android:layout_height="70dp"
            android:layout_margin="8dp"
            android:background="@drawable/circular_button_gallery"
            android:drawableTop="@drawable/ic_gallery"
            android:drawablePadding="4dp"
            android:text="معرض"
            android:textSize="10sp"
            android:textColor="#FFFFFF"
            android:elevation="6dp" />

        <Button
            android:id="@+id/btn_record"
            android:layout_width="90dp"
            android:layout_height="90dp"
            android:layout_margin="12dp"
            android:background="@drawable/circular_button_record"
            android:drawableTop="@drawable/ic_record"
            android:drawablePadding="6dp"
            android:text="تسجيل"
            android:textSize="12sp"
            android:textColor="#FFFFFF"
            android:textStyle="bold"
            android:elevation="8dp" />

        <Button
            android:id="@+id/btn_stop"
            android:layout_width="90dp"
            android:layout_height="90dp"
            android:layout_margin="12dp"
            android:background="@drawable/circular_button_stop"
            android:drawableTop="@drawable/ic_stop"
            android:drawablePadding="6dp"
            android:text="إيقاف"
            android:textSize="12sp"
            android:textColor="#FFFFFF"
            android:textStyle="bold"
            android:elevation="8dp"
            android:visibility="gone" />

        <Button
            android:id="@+id/btn_settings"
            android:layout_width="70dp"
            android:layout_height="70dp"
            android:layout_margin="8dp"
            android:background="@drawable/circular_button_settings"
            android:drawableTop="@drawable/ic_settings"
            android:drawablePadding="4dp"
            android:text="إعدادات"
            android:textSize="10sp"
            android:textColor="#FFFFFF"
            android:elevation="6dp" />

    </LinearLayout>

    <!-- إعدادات سريعة -->
    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <!-- بطاقة إعدادات الصوت والكاميرا -->
            <androidx.cardview.widget.CardView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginBottom="16dp"
                app:cardCornerRadius="16dp"
                app:cardElevation="6dp"
                app:cardBackgroundColor="#FFFFFF">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:padding="20dp">

                    <TextView
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:text="إعدادات التسجيل"
                        android:textSize="18sp"
                        android:textStyle="bold"
                        android:textColor="#2D3748"
                        android:layout_marginBottom="16dp"
                        android:fontFamily="@font/roboto_bold" />

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal"
                        android:gravity="center_vertical"
                        android:layout_marginBottom="12dp">

                        <ImageView
                            android:layout_width="24dp"
                            android:layout_height="24dp"
                            android:src="@drawable/ic_mic"
                            android:layout_marginEnd="12dp" />

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="تسجيل الصوت"
                            android:textSize="16sp"
                            android:textColor="#4A5568"
                            android:fontFamily="@font/roboto_medium" />

                        <Switch
                            android:id="@+id/switch_audio"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:checked="true"
                            android:theme="@style/SwitchTheme" />

                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal"
                        android:gravity="center_vertical"
                        android:layout_marginBottom="12dp">

                        <ImageView
                            android:layout_width="24dp"
                            android:layout_height="24dp"
                            android:src="@drawable/ic_camera"
                            android:layout_marginEnd="12dp" />

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="الكاميرا الأمامية"
                            android:textSize="16sp"
                            android:textColor="#4A5568"
                            android:fontFamily="@font/roboto_medium" />

                        <Switch
                            android:id="@+id/switch_camera"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:theme="@style/SwitchTheme" />

                    </LinearLayout>

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal"
                        android:gravity="center_vertical">

                        <ImageView
                            android:layout_width="24dp"
                            android:layout_height="24dp"
                            android:src="@drawable/ic_dark_mode"
                            android:layout_marginEnd="12dp" />

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="الوضع الداكن"
                            android:textSize="16sp"
                            android:textColor="#4A5568"
                            android:fontFamily="@font/roboto_medium" />

                        <Switch
                            android:id="@+id/switch_dark_mode"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:theme="@style/SwitchTheme" />

                    </LinearLayout>

                </LinearLayout>

            </androidx.cardview.widget.CardView>

            <!-- بطاقة جودة الفيديو -->
            <androidx.cardview.widget.CardView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginBottom="16dp"
                app:cardCornerRadius="16dp"
                app:cardElevation="6dp"
                app:cardBackgroundColor="#FFFFFF">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical"
                    android:padding="20dp">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal"
                        android:gravity="center_vertical"
                        android:layout_marginBottom="12dp">

                        <ImageView
                            android:layout_width="24dp"
                            android:layout_height="24dp"
                            android:src="@drawable/ic_quality"
                            android:layout_marginEnd="12dp" />

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="جودة الفيديو"
                            android:textSize="16sp"
                            android:textColor="#4A5568"
                            android:fontFamily="@font/roboto_medium" />

                        <TextView
                            android:id="@+id/tv_quality"
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:text="1080p"
                            android:textSize="14sp"
                            android:textStyle="bold"
                            android:textColor="#805AD5"
                            android:fontFamily="@font/roboto_bold" />

                    </LinearLayout>

                    <SeekBar
                        android:id="@+id/seekbar_quality"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:max="2"
                        android:progress="1"
                        android:progressTint="#805AD5"
                        android:thumbTint="#805AD5" />

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="horizontal"
                        android:layout_marginTop="8dp">

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="720p"
                            android:textSize="12sp"
                            android:textColor="#A0AEC0"
                            android:gravity="start" />

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="1080p"
                            android:textSize="12sp"
                            android:textColor="#A0AEC0"
                            android:gravity="center" />

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="4K"
                            android:textSize="12sp"
                            android:textColor="#A0AEC0"
                            android:gravity="end" />

                    </LinearLayout>

                </LinearLayout>

            </androidx.cardview.widget.CardView>

        </LinearLayout>

    </ScrollView>

</LinearLayout>

// floating_controls.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:orientation="horizontal"
    android:background="@drawable/floating_background"
    android:padding="8dp"
    android:elevation="12dp">

    <Button
        android:id="@+id/btn_floating_stop"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:layout_margin="4dp"
        android:background="@drawable/floating_button_stop"
        android:drawableTop="@drawable/ic_stop_white"
        android:padding="8dp" />

    <Button
        android:id="@+id/btn_floating_hide"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:layout_margin="4dp"
        android:background="@drawable/floating_button_hide"
        android:drawableTop="@drawable/ic_visibility_off"
        android:padding="8dp" />

</LinearLayout>

// dialog_preview.xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:orientation="vertical"
    android:padding="24dp"
    android:background="@drawable/dialog_background">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="تم الانتهاء من التسجيل!"
        android:textSize="20sp"
        android:textStyle="bold"
        android:textColor="#2D3748"
        android:layout_gravity="center"
        android:layout_marginBottom="20dp"
        android:fontFamily="@font/roboto_bold" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:gravity="center">

        <Button
            android:id="@+id/btn_play"
            android:layout_width="0dp"
            android:layout_height="48dp"
            android:layout_weight="1"
            android:layout_margin="4dp"
            android:background="@drawable/button_primary"
            android:drawableStart="@drawable/ic_play"
            android:text="تشغيل"
            android:textColor="#FFFFFF"
            android:drawablePadding="8dp"
            android:fontFamily="@font/roboto_medium" />

        <Button
            android:id="@+id/btn_edit"
            android:layout_width="0dp"
            android:layout_height="48dp"
            android:layout_weight="1"
            android:layout_margin="4dp"
            android:background="@drawable/button_secondary"
            android:drawableStart="@drawable/ic_edit"
            android:text="تحرير"
            android:textColor="#FFFFFF"
            android:drawablePadding="8dp"
            android:fontFamily="@font/roboto_medium" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:gravity="center"
        android:layout_marginTop="8dp">

        <Button
            android:id="@+id/btn_share"
            android:layout_width="0dp"
            android:layout_height="48dp"
            android:layout_weight="1"
            android:layout_margin="4dp"
            android:background="@drawable/button_success"
            android:drawableStart="@drawable/ic_share"
            android:text="مشاركة"
            android:textColor="#FFFFFF"
            android:drawablePadding="8dp"
            android:fontFamily="@font/roboto_medium" />

        <Button
            android:id="@+id/btn_delete"
            android:layout_width="0dp"
            android:layout_height="48dp"
            android:layout_weight="1"
            android:layout_margin="4dp"
            android:background="@drawable/button_danger"
            android:drawableStart="@drawable/ic_delete"
            android:text="حذف"
            android:textColor="#FFFFFF"
            android:drawablePadding="8dp"
            android:fontFamily="@font/roboto_medium" />

    </LinearLayout>

</LinearLayout>

// GalleryActivity.java
package com.proscreen.recorder;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GalleryActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private VideoAdapter adapter;
    private List<File> videoFiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        
        initializeViews();
        loadVideos();
        setupRecyclerView();
    }

    private void initializeViews() {
        recyclerView = findViewById(R.id.recycler_videos);
    }

    private void loadVideos() {
        videoFiles = new ArrayList<>();
        File appDir = new File(Environment.getExternalStorageDirectory(), "ProScreenRecorder");
        
        if (appDir.exists() && appDir.isDirectory()) {
            File[] files = appDir.listFiles((dir, name) -> 
                name.toLowerCase().endsWith(".mp4"));
            
            if (files != null) {
                videoFiles.addAll(Arrays.asList(files));
            }
        }
    }

    private void setupRecyclerView() {
        adapter = new VideoAdapter(this, videoFiles);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(adapter);
    }
}

// VideoEditorActivity.java
package com.proscreen.recorder;

import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class VideoEditorActivity extends AppCompatActivity {
    private VideoView videoView;
    private SeekBar seekBarTrim;
    private Button btnCut, btnFilter, btnSave;
    private String videoPath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_editor);
        
        videoPath = getIntent().getStringExtra("video_path");
        
        initializeViews();
        setupVideoPlayer();
        setupControls();
    }

    private void initializeViews() {
        videoView = findViewById(R.id.video_view);
        seekBarTrim = findViewById(R.id.seekbar_trim);
        btnCut = findViewById(R.id.btn_cut);
        btnFilter = findViewById(R.id.btn_filter);
        btnSave = findViewById(R.id.btn_save);
    }

    private void setupVideoPlayer() {
        Uri videoUri = Uri.parse(videoPath);
        videoView.setVideoURI(videoUri);
        videoView.start();
    }

    private void setupControls() {
        btnCut.setOnClickListener(v -> trimVideo());
        btnFilter.setOnClickListener(v -> applyFilter());
        btnSave.setOnClickListener(v -> saveEditedVideo());
    }

    private void trimVideo() {
        // تنفيذ قص الفيديو
    }

    private void applyFilter() {
        // تطبيق الفلاتر
    }

    private void saveEditedVideo() {
        // حفظ الفيديو المحرر
    }
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initializeViews();
        setupUI();
        initializeRecording();
        loadSettings();
        checkPermissions();
    }

    private void initializeViews() {
        btnRecord = findViewById(R.id.btn_record);
        btnStop = findViewById(R.id.btn_stop);
        btnSettings = findViewById(R.id.btn_settings);
        btnGallery = findViewById(R.id.btn_gallery);
        tvTimer = findViewById(R.id.tv_timer);
        tvStatus = findViewById(R.id.tv_status);
        tvCountdown = findViewById(R.id.tv_countdown);
        switchAudio = findViewById(R.id.switch_audio);
        switchCamera = findViewById(R.id.switch_camera);
        switchDarkMode = findViewById(R.id.switch_dark_mode);
        seekBarQuality = findViewById(R.id.seekbar_quality);
        imgLogo = findViewById(R.id.img_logo);
        layoutMain = findViewById(R.id.layout_main);
        layoutControls = findViewById(R.id.layout_controls);
    }

    private void setupUI() {
        // إعداد الألوان والتدرجات
        applyGradientBackground();
        
        // إعداد الأزرار الدائرية
        setupCircularButtons();
        
        // إعداد المؤثرات البصرية
        setupAnimations();
        
        // إعداد الأحداث
        setupClickListeners();
        
        // إعداد الحالة الأولية
        updateUI();
    }

    private void applyGradientBackground() {
        if (isDarkMode) {
            layoutMain.setBackgroundResource(R.drawable.gradient_dark);
        } else {
            layoutMain.setBackgroundResource(R.drawable.gradient_light);
        }
    }

    private void setupCircularButtons() {
        // تطبيق الشكل الدائري والخلفية الشفافة
        btnRecord.setBackgroundResource(R.drawable.circular_button_record);
        btnStop.setBackgroundResource(R.drawable.circular_button_stop);
        btnSettings.setBackgroundResource(R.drawable.circular_button_settings);
        btnGallery.setBackgroundResource(R.drawable.circular_button_gallery);
    }

    private void setupAnimations() {
        // تطبيق الرسوم المتحركة البسيطة
        imgLogo.setAlpha(0f);
        imgLogo.animate().alpha(1f).setDuration(1000).start();
        
        layoutControls.setTranslationY(300f);
        layoutControls.animate().translationY(0f).setDuration(800).start();
    }

    private void setupClickListeners() {
        btnRecord.setOnClickListener(v -> startRecordingWithCountdown());
        btnStop.setOnClickListener(v -> stopRecording());
        btnSettings.setOnClickListener(v -> showSettingsDialog());
        btnGallery.setOnClickListener(v -> openGallery());
        
        switchAudio.setOnCheckedChangeListener((buttonView, isChecked) -> {
            isAudioEnabled = isChecked;
            saveSettings();
        });
        
        switchCamera.setOnCheckedChangeListener((buttonView, isChecked) -> {
            isCameraEnabled = isChecked;
            if (isChecked) {
                checkCameraPermission();
            }
            saveSettings();
        });
        
        switchDarkMode.setOnCheckedChangeListener((buttonView, isChecked) -> {
            isDarkMode = isChecked;
            applyGradientBackground();
            saveSettings();
        });
        
        seekBarQuality.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                updateQualityText(progress);
            }
            
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                saveSettings();
            }
        });
    }

    private void initializeRecording() {
        mediaProjectionManager = (MediaProjectionManager) getSystemService(Context.MEDIA_PROJECTION_SERVICE);
        
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        screenHeight = displayMetrics.heightPixels;
        screenDensity = displayMetrics.densityDpi;
        
        // إنشاء مجلد التطبيق
        File appDir = new File(Environment.getExternalStorageDirectory(), "ProScreenRecorder");
        if (!appDir.exists()) {
            appDir.mkdirs();
        }
    }

    private void checkPermissions() {
        List<String> permissionsNeeded = new ArrayList<>();
        
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                permissionsNeeded.add(permission);
            }
        }
        
        if (!permissionsNeeded.isEmpty()) {
            ActivityCompat.requestPermissions(this, 
                permissionsNeeded.toArray(new String[0]), REQUEST_PERMISSIONS);
        }
    }

    private void startRecordingWithCountdown() {
        if (!hasAllPermissions()) {
            checkPermissions();
            return;
        }
        
        // إظهار العد التنازلي
        tvCountdown.setVisibility(View.VISIBLE);
        tvCountdown.setTextSize(48);
        
        countDownTimer = new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long seconds = millisUntilFinished / 1000;
                if (seconds > 0) {
                    tvCountdown.setText(String.valueOf(seconds));
                    // تأثير صوتي
                    playSound(R.raw.countdown_tick);
                    // تأثير بصري
                    animateCountdown();
                }
            }
            
            @Override
            public void onFinish() {
                tvCountdown.setText("تسجيل!");
                tvCountdown.setTextSize(24);
                playSound(R.raw.recording_start);
                
                new Handler().postDelayed(() -> {
                    tvCountdown.setVisibility(View.GONE);
                    startRecording();
                }, 500);
            }
        }.start();
    }

    private void animateCountdown() {
        tvCountdown.setScaleX(1.5f);
        tvCountdown.setScaleY(1.5f);
        tvCountdown.animate().scaleX(1f).scaleY(1f).setDuration(300).start();
    }

    private void startRecording() {
        Intent intent = mediaProjectionManager.createScreenCaptureIntent();
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK) {
            mediaProjection = mediaProjectionManager.getMediaProjection(resultCode, data);
            initRecorder();
            recordScreen();
        }
    }

    private void initRecorder() {
        try {
            mediaRecorder = new MediaRecorder();
            
            // إعداد مصدر الصوت
            if (isAudioEnabled) {
                mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            }
            
            mediaRecorder.setVideoSource(MediaRecorder.VideoSource.SURFACE);
            mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
            
            // إعداد جودة الفيديو
            int quality = seekBarQuality.getProgress();
            setVideoQuality(quality);
            
            if (isAudioEnabled) {
                mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
            }
            
            mediaRecorder.setVideoEncoder(MediaRecorder.VideoEncoder.H264);
            
            // إعداد مسار الحفظ
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
            outputPath = Environment.getExternalStorageDirectory() + "/ProScreenRecorder/recording_" + timestamp + ".mp4";
            mediaRecorder.setOutputFile(outputPath);
            
            mediaRecorder.setVideoSize(screenWidth, screenHeight);
            mediaRecorder.setVideoFrameRate(60);
            mediaRecorder.setVideoBitRate(5000000);
            mediaRecorder.setVideoEncodingBitRate(5000000);
            
            mediaRecorder.prepare();
            
        } catch (IOException e) {
            Log.e(TAG, "Error initializing MediaRecorder: " + e.getMessage());
            Toast.makeText(this, "خطأ في تهيئة المسجل", Toast.LENGTH_SHORT).show();
        }
    }

    private void setVideoQuality(int quality) {
        switch (quality) {
            case 0: // 720p
                screenWidth = 1280;
                screenHeight = 720;
                break;
            case 1: // 1080p
                screenWidth = 1920;
                screenHeight = 1080;
                break;
            case 2: // 4K
                screenWidth = 3840;
                screenHeight = 2160;
                break;
        }
    }

    private void recordScreen() {
        virtualDisplay = createVirtualDisplay();
        mediaRecorder.start();
        isRecording = true;
        recordingStartTime = System.currentTimeMillis();
        
        updateUI();
        startTimer();
        createFloatingButton();
        
        // إظهار الكاميرا الأمامية إذا كانت مفعلة
        if (isCameraEnabled) {
            showCameraOverlay();
        }
    }

    private VirtualDisplay createVirtualDisplay() {
        return mediaProjection.createVirtualDisplay("MainActivity",
                screenWidth, screenHeight, screenDensity,
                DisplayManager.VIRTUAL_DISPLAY_FLAG_AUTO_MIRROR,
                mediaRecorder.getSurface(), null, null);
    }

    private void stopRecording() {
        if (!isRecording) return;
        
        try {
            mediaRecorder.stop();
            mediaRecorder.reset();
            virtualDisplay.release();
            mediaProjection.stop();
            
            isRecording = false;
            stopTimer();
            removeFloatingButton();
            hideCameraOverlay();
            
            playSound(R.raw.recording_stop);
            updateUI();
            
            // إظهار حوار المعاينة
            showPreviewDialog();
            
        } catch (Exception e) {
            Log.e(TAG, "Error stopping recording: " + e.getMessage());
            Toast.makeText(this, "خطأ في إيقاف التسجيل", Toast.LENGTH_SHORT).show();
        }
    }

    private void startTimer() {
        timerRunnable = new Runnable() {
            @Override
            public void run() {
                if (isRecording) {
                    long elapsed = System.currentTimeMillis() - recordingStartTime;
                    String time = formatTime(elapsed);
                    tvTimer.setText(time);
                    timerHandler.postDelayed(this, 1000);
                }
            }
        };
        timerHandler.post(timerRunnable);
    }

    private void stopTimer() {
        if (timerRunnable != null) {
            timerHandler.removeCallbacks(timerRunnable);
        }
        tvTimer.setText("00:00:00");
    }

    private String formatTime(long milliseconds) {
        long seconds = milliseconds / 1000;
        long hours = seconds / 3600;
        long minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;
        
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds);
    }

    private void createFloatingButton() {
        if (isFloatingVisible) return;
        
        windowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        floatingView = inflater.inflate(R.layout.floating_controls, null);
        
        WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.O ? 
                    WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY : 
                    WindowManager.LayoutParams.TYPE_PHONE,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);
        
        params.gravity = Gravity.TOP | Gravity.LEFT;
        params.x = 0;
        params.y = 100;
        
        windowManager.addView(floatingView, params);
        isFloatingVisible = true;
        
        // إعداد أحداث الزر الطافي
        setupFloatingButtonEvents(params);
    }

    private void setupFloatingButtonEvents(WindowManager.LayoutParams params) {
        Button btnFloatingStop = floatingView.findViewById(R.id.btn_floating_stop);
        Button btnFloatingHide = floatingView.findViewById(R.id.btn_floating_hide);
        
        btnFloatingStop.setOnClickListener(v -> stopRecording());
        btnFloatingHide.setOnClickListener(v -> {
            floatingView.setVisibility(View.GONE);
            new Handler().postDelayed(() -> floatingView.setVisibility(View.VISIBLE), 3000);
        });
        
        // إمكانية سحب الزر الطافي
        floatingView.setOnTouchListener(new View.OnTouchListener() {
            private int initialX, initialY;
            private float initialTouchX, initialTouchY;
            
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        initialX = params.x;
                        initialY = params.y;
                        initialTouchX = event.getRawX();
                        initialTouchY = event.getRawY();
                        return true;
                        
                    case MotionEvent.ACTION_MOVE:
                        params.x = initialX + (int) (event.getRawX() - initialTouchX);
                        params.y = initialY + (int) (event.getRawY() - initialTouchY);
                        windowManager.updateViewLayout(floatingView, params);
                        return true;
                }
                return false;
            }
        });
    }

    private void removeFloatingButton() {
        if (floatingView != null && isFloatingVisible) {
            windowManager.removeView(floatingView);
            isFloatingVisible = false;
        }
    }

    private void showCameraOverlay() {
        // إنشاء نافذة الكاميرا الأمامية
        // هذا يتطلب تنفيذ إضافي لإنشاء CameraPreview
    }

    private void hideCameraOverlay() {
        // إخفاء نافذة الكاميرا الأمامية
    }

    private void showPreviewDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_preview, null);
        builder.setView(dialogView);
        
        Button btnPlay = dialogView.findViewById(R.id.btn_play);
        Button btnEdit = dialogView.findViewById(R.id.btn_edit);
        Button btnShare = dialogView.findViewById(R.id.btn_share);
        Button btnDelete = dialogView.findViewById(R.id.btn_delete);
        
        AlertDialog dialog = builder.create();
        
        btnPlay.setOnClickListener(v -> {
            openVideoPlayer(outputPath);
            dialog.dismiss();
        });
        
        btnEdit.setOnClickListener(v -> {
            openVideoEditor(outputPath);
            dialog.dismiss();
        });
        
        btnShare.setOnClickListener(v -> {
            shareVideo(outputPath);
            dialog.dismiss();
        });
        
        btnDelete.setOnClickListener(v -> {
            deleteVideo(outputPath);
            dialog.dismiss();
        });
        
        dialog.show();
    }

    private void showSettingsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_settings, null);
        builder.setView(dialogView);
        
        // إعداد عناصر حوار الإعدادات
        Switch switchWatermark = dialogView.findViewById(R.id.switch_watermark);
        Switch switchAutoRecord = dialogView.findViewById(R.id.switch_auto_record);
        SeekBar seekBarVolume = dialogView.findViewById(R.id.seekbar_volume);
        
        // تحميل الإعدادات الحالية
        SharedPreferences prefs = getSharedPreferences("AppSettings", MODE_PRIVATE);
        switchWatermark.setChecked(prefs.getBoolean("watermark", false));
        switchAutoRecord.setChecked(prefs.getBoolean("auto_record", false));
        seekBarVolume.setProgress(prefs.getInt("volume", 50));
        
        AlertDialog dialog = builder.create();
        
        Button btnSave = dialogView.findViewById(R.id.btn_save_settings);
        btnSave.setOnClickListener(v -> {
            // حفظ الإعدادات
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("watermark", switchWatermark.isChecked());
            editor.putBoolean("auto_record", switchAutoRecord.isChecked());
            editor.putInt("volume", seekBarVolume.getProgress());
            editor.apply();
            
            Toast.makeText(this, "تم حفظ الإعدادات", Toast.LENGTH_SHORT).show();
            dialog.dismiss();
        });
        
        dialog.show();
    }

    private void openGallery() {
        Intent intent = new Intent(this, GalleryActivity.class);
        startActivity(intent);
    }

    private void openVideoPlayer(String videoPath) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(android.net.Uri.parse(videoPath), "video/*");
        startActivity(intent);
    }

    private void openVideoEditor(String videoPath) {
        Intent intent = new Intent(this, VideoEditorActivity.class);
        intent.putExtra("video_path", videoPath);
        startActivity(intent);
    }

    private void shareVideo(String videoPath) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("video/*");
        shareIntent.putExtra(Intent.EXTRA_STREAM, android.net.Uri.parse(videoPath));
        shareIntent.putExtra(Intent.EXTRA_TEXT, "تم تسجيله باستخدام ProScreenRecorder");
        startActivity(Intent.createChooser(shareIntent, "مشاركة الفيديو"));
    }

    private void deleteVideo(String videoPath) {
        File file = new File(videoPath);
        if (file.exists()) {
            file.delete();
            Toast.makeText(this, "تم حذف الفيديو", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateUI() {
        if (isRecording) {
            btnRecord.setVisibility(View.GONE);
            btnStop.setVisibility(View.VISIBLE);
            tvStatus.setText("جاري التسجيل...");
            tvStatus.setTextColor(getResources().getColor(R.color.recording_red));
        } else {
            btnRecord.setVisibility(View.VISIBLE);
            btnStop.setVisibility(View.GONE);
            tvStatus.setText("جاهز للتسجيل");
            tvStatus.setTextColor(getResources().getColor(R.color.ready_green));
        }
    }

    private void updateQualityText(int progress) {
        String[] qualities = {"720p", "1080p", "4K"};
        TextView tvQuality = findViewById(R.id.tv_quality);
        tvQuality.setText(qualities[progress]);
    }

    private boolean hasAllPermissions() {
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED) {
                return false;
            }
        }
        return true;
    }

    private void checkCameraPermission() {
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, 100);
        }
    }

    private void playSound(int soundResource) {
        // تشغيل الصوت باستخدام MediaPlayer
        android.media.MediaPlayer mediaPlayer = android.media.MediaPlayer.create(this, soundResource);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(android.media.MediaPlayer::release);
    }

    private void saveSettings() {
        SharedPreferences prefs = getSharedPreferences("AppSettings", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("audio_enabled", isAudioEnabled);
        editor.putBoolean("camera_enabled", isCameraEnabled);
        editor.putBoolean("dark_mode", isDarkMode);
        editor.putInt("quality", seekBarQuality.getProgress());
        editor.apply();
    }

    private void loadSettings() {
        SharedPreferences prefs = getSharedPreferences("AppSettings", MODE_PRIVATE);
        isAudioEnabled = prefs.getBoolean("audio_enabled", true);
        isCameraEnabled = prefs.getBoolean("camera_enabled", false);
        isDarkMode = prefs.getBoolean("dark_mode", false);
        int quality = prefs.getInt("quality", 1);
        
        switchAudio.setChecked(isAudioEnabled);
        switchCamera.setChecked(isCameraEnabled);
        switchDarkMode.setChecked(isDarkMode);
        seekBarQuality.setProgress(quality);
        
        updateQualityText(quality);
        applyGradientBackground();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        
        if (requestCode == REQUEST_PERMISSIONS) {
            boolean allGranted = true;
            for (int result : grantResults) {
                if (result != PackageManager.PERMISSION_GRANTED) {
                    allGranted = false;
                    break;
                }
            }
            
            if (!allGranted) {
                Toast.makeText(this, "يتطلب التطبيق جميع الصلاحيات للعمل بشكل صحيح", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        
        if (isRecording) {
            stopRecording();
        }
        
        removeFloatingButton();
        
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        
        if (timerRunnable != null) {
            timerHandler.removeCallbacks(timerRunnable);
        }
    }
}