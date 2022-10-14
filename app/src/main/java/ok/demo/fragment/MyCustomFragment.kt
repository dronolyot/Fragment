package ok.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MyCustomFragment: Fragment() {
    private lateinit var myTextView: TextView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val view: View = inflater.inflate(R.layout.my_custom_fragment, container, false)

        myTextView = view.findViewById<View>(R.id.fragmentTextView) as TextView

        val bundle = arguments
        val message = bundle!!.getString("mText")

        myTextView.text = message

        return view

    }

}