package a.b.c.ui.fragment.login

import a.b.c.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import kotlinx.android.synthetic.main.fragment_welcome.*

/**
 * WelcomeFragment
 * create by duxl 2020/9/2
 */
class WelcomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener {
            val nav = navOptions {
                anim {
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            }
            val args = Bundle()
            args.putString("name", "TeaOf")
            findNavController().navigate(R.id.action_welecomFragment_to_loginFragment, args, nav)
        }

        btn_register.setOnClickListener {
            val direction = WelcomeFragmentDirections.actionWelecomFragmentToRegiestFragment()
                .setEmail("2020@qq.com")
            findNavController().navigate(direction)
        }
    }
}