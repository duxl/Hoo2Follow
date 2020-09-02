package a.b.c.ui.fragment.login

import a.b.c.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_regiest.*

/**
 * RegiestFragment
 * create by duxl 2020/9/2
 */
class RegiestFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_regiest, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tvBack.setOnClickListener {
            activity?.onBackPressed()
        }

        btnSignUp.setOnClickListener {
            Toast.makeText(context, "注册", Toast.LENGTH_SHORT).show()
        }

        val safeArgs by navArgs<RegiestFragmentArgs>()
        emailAddress.setText(safeArgs.email)
    }
}