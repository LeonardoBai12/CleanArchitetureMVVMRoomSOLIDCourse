package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.lb.cleanarchiteturemvvmroomsolidcourse.R
import io.lb.cleanarchiteturemvvmroomsolidcourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_CleanArchitetureMVVMRoomSOLIDCourse)

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}