package a.b.c.ui.fragment.login

import a.b.c.R
import a.b.c.databinding.FragmentLoginBinding
import a.b.c.ui.activity.MainActivity
import a.b.c.ui.viewmodel.LoginModel
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * LoginFragment
 * create by duxl 2020/9/2
 */
class LoginFragment : Fragment() {

    lateinit var loginBinding: FragmentLoginBinding
    lateinit var loginModel: LoginModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        loginBinding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater, R.layout.fragment_login, container, false)

        loginModel = LoginModel("Test", "", context!!)

        loginBinding.activity = activity as AppCompatActivity?
        loginBinding.loginModel = loginModel

        return loginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        tv_cancel.setOnClickListener {
//            findNavController().popBackStack()
//        }
//
//        btnLogin.setOnClickListener {
//            val intent = Intent(context, MainActivity::class.java)
//            context?.startActivity(intent)
//        }

        val name = arguments?.getString("name")
        etAccount.setText(name)
    }
}