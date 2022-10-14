package ok.demo.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mEditText = findViewById<EditText>(R.id.editText)
        val mButton = findViewById<Button>(R.id.button)
        val mFragmentManager = supportFragmentManager
        val fragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = MyCustomFragment()

        mButton.setOnClickListener {
            val mBundle = Bundle()
            mBundle.putString("mText", mEditText.text.toString())
            mFragment.arguments = mBundle
            fragmentTransaction.add(R.id.frameLayout, mFragment).commit()

        }

    }
}