package a.b.c.ui.viewmodel

import a.b.c.ui.activity.MainActivity
import a.b.c.ui.common.BaseConstant
import a.b.c.ui.common.listener.SimpleWatcher
import android.content.Context
import android.content.Intent
import android.text.Editable
import android.text.TextUtils
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableField
import java.util.*

/**
 * LoginModel
 * create by duxl 2020/9/2
 */
class LoginModel(name: String?, pwd: String, context: Context) {

    val n = ObservableField<String>(name)
    val p = ObservableField<String>(pwd)
        get() {
            println("duxl.debug:: p.get")
            return field
        }
    val context = context

    /**
     * 用户名改变回调的函数
     */
    fun onNameChanged(name: CharSequence) {
        n.set(name.toString())
    }

    fun onPwdChanged(pwd: CharSequence, start: Int, before: Int, count: Int) {
        p.set(pwd.toString())
    }

    fun login() {
        if (TextUtils.equals(BaseConstant.USER_NAME, n.get())
            && TextUtils.equals(BaseConstant.USER_PWD, p.get())
        ) {
            context.startActivity(Intent(context, MainActivity::class.java))
        } else {
            Toast.makeText(context, "请用admin/123456登录", Toast.LENGTH_SHORT).show()
        }
    }

    val nameWatcher = object : SimpleWatcher() {
        override fun afterTextChanged(s: Editable?) {
            super.afterTextChanged(s)
            println("duxl.debug:: nameWatcher----> ${s.toString()}")
        }
    }

    companion object {
        @JvmStatic
        @BindingAdapter("addTextChangedWatcher")
        fun addTextChangedWatcher(editText: EditText, simpleWatcher: SimpleWatcher) {
            editText.addTextChangedListener(simpleWatcher)
        }
    }
}