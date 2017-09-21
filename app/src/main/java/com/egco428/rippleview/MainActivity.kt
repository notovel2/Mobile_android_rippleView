package com.egco428.rippleview

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        glView.run {
            addBackgroundImages(
                    listOf(
                            BitmapFactory.decodeResource(resources,R.drawable.pic1),
                            BitmapFactory.decodeResource(resources,R.drawable.pic2)
                    )
            )
            setRippleOffset(0.01f)
            setFadeInterval(200)
            startCrossFadeAnimation()
        }
    }
}
