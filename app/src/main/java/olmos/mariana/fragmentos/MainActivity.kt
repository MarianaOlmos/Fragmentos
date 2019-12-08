package olmos.mariana.fragmentos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        var f:Fragment? = null

            when(p0!!.id){
                R.id.btn1-> {
                f = Primero.newInstance("","")
                }
                R.id.btn2-> {
                f = segundo.newInstance("","")
                }
                R.id.btn3-> {
                f = tercero.newInstance("","")
                }

        }
        supportFragmentManager.beginTransaction()
            .replace(R.id.container,f!!)
            .commitNow()

    }

}
