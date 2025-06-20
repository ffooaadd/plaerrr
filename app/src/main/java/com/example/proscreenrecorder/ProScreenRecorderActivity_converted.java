}










    
    





    package="com.proscreen.recorder">



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
    
    private Button btnRecord, btnStop, btnSettings, btnGallery;
    private TextView tvTimer, tvStatus, tvCountdown;
    private Switch switchAudio, switchCamera, switchDarkMode;
    private SeekBar seekBarQuality;
    private ImageView imgLogo;
    private LinearLayout layoutMain, layoutControls;
    private RelativeLayout layoutFloating;
    
    private MediaProjectionManager mediaProjectionManager;
    private MediaProjection mediaProjection;
    private VirtualDisplay virtualDisplay;
    private MediaRecorder mediaRecorder;
    
    private int screenWidth, screenHeight, screenDensity;
    private boolean isRecording = false;
    private boolean isAudioEnabled = true;
    private boolean isCameraEnabled = false;
    private boolean isDarkMode = false;
    private String outputPath;
    private long recordingStartTime;
    
    private WindowManager windowManager;
    private View floatingView;
    private boolean isFloatingVisible = false;
    
    private Handler timerHandler = new Handler();
    private Runnable timerRunnable;
    
    private CountDownTimer countDownTimer;
    
    private String[] permissions = {
        Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.RECORD_AUDIO,
        Manifest.permission.CAMERA,
        Manifest.permission.SYSTEM_ALERT_WINDOW
    }

    xmlns:app="http://schemas.android.com/apk/res-auto"


















                app:cardCornerRadius="16dp"
                app:cardElevation="6dp"
                app:cardBackgroundColor="#FFFFFF">




















                app:cardCornerRadius="16dp"
                app:cardElevation="6dp"
                app:cardBackgroundColor="#FFFFFF">

































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
    }

    private void applyFilter() {
    }

    private void saveEditedVideo() {
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
        applyGradientBackground();
        
        setupCircularButtons();
        
        setupAnimations();
        
        setupClickListeners();
        
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
        btnRecord.setBackgroundResource(R.drawable.circular_button_record);
        btnStop.setBackgroundResource(R.drawable.circular_button_stop);
        btnSettings.setBackgroundResource(R.drawable.circular_button_settings);
        btnGallery.setBackgroundResource(R.drawable.circular_button_gallery);
    }

    private void setupAnimations() {
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
        
        tvCountdown.setVisibility(View.VISIBLE);
        tvCountdown.setTextSize(48);
        
        countDownTimer = new CountDownTimer(4000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long seconds = millisUntilFinished / 1000;
                if (seconds > 0) {
                    tvCountdown.setText(String.valueOf(seconds));
                    playSound(R.raw.countdown_tick);
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
            
            if (isAudioEnabled) {
                mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
            }
            
            mediaRecorder.setVideoSource(MediaRecorder.VideoSource.SURFACE);
            mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
            
            int quality = seekBarQuality.getProgress();
            setVideoQuality(quality);
            
            if (isAudioEnabled) {
                mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AAC);
            }
            
            mediaRecorder.setVideoEncoder(MediaRecorder.VideoEncoder.H264);
            
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
    }

    private void hideCameraOverlay() {
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
        
        Switch switchWatermark = dialogView.findViewById(R.id.switch_watermark);
        Switch switchAutoRecord = dialogView.findViewById(R.id.switch_auto_record);
        SeekBar seekBarVolume = dialogView.findViewById(R.id.seekbar_volume);
        
        SharedPreferences prefs = getSharedPreferences("AppSettings", MODE_PRIVATE);
        switchWatermark.setChecked(prefs.getBoolean("watermark", false));
        switchAutoRecord.setChecked(prefs.getBoolean("auto_record", false));
        seekBarVolume.setProgress(prefs.getInt("volume", 50));
        
        AlertDialog dialog = builder.create();
        
        Button btnSave = dialogView.findViewById(R.id.btn_save_settings);
        btnSave.setOnClickListener(v -> {
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