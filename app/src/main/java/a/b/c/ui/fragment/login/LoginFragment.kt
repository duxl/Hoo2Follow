package a.b.c.ui.fragment.login

import a.b.c.R
import a.b.c.ui.activity.MainActivity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * LoginFragment
 * create by duxl 2020/9/2
 */
class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        tv_cancel.setOnClickListener {
            findNavController().popBackStack()
        }

        btnLogin.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            context?.startActivity(intent)
        }

        val name = arguments?.getString("name")
        etAccount.setText(name)
    }
}