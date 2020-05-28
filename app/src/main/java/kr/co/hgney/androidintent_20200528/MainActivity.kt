package kr.co.hgney.androidintent_20200528

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dialBtn.setOnClickListener {

            val phoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${phoneNum.replace("-","")}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)

        }
        callBtn.setOnClickListener {

            val phoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel:${phoneNum.replace("-","")}")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)

        }

        smsBtn.setOnClickListener {

            val phoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("smsto:${phoneNum.replace("-","")}")
            val myIntent = Intent(Intent.ACTION_SENDTO, myUri)
            myIntent.putExtra("sms_body","미리적어둘 내용")
            startActivity(myIntent)

        }


         intBtn.setOnClickListener {

            val myUri = Uri.parse("https://naver.com") // 인터넷 주소 직접 입력
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)

        }


        playBtn.setOnClickListener {

            val myUri = Uri.parse("market://details?id=플레이스토어ID") // 인터넷 주소 직접 입력
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)

        }

    }
}
