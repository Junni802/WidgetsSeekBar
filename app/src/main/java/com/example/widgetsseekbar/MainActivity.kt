package com.example.widgetsseekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.widgetsseekbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
	val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)
		binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
			override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
			// SeekBar : 리스너가 장착된 시크바 객체, progress : 시크바의 현재 progress값, fromUser
				binding.textVol.text = "${progress}"
				// binding.textVol.text에는 문자열만 들어가므로 progress값을 문자열로 변환
			}

			override fun onStartTrackingTouch(p0: SeekBar?) {

			}

			override fun onStopTrackingTouch(p0: SeekBar?) {

			}

		})
		/*
		max : 시브바의 최대값(기본값 : 100)
		progress : 시크바의 시작위치(값)-기본값 : 0
		 */
	}

}