package a.b.c.ui.viewmodel

import a.b.c.ui.activity.MainActivity
import a.b.c.ui.common.BaseConstant
import android.content.Context
import android.content.Intent
import android.text.TextUtils
import android.widget.Toast
import androidx.databinding.ObservableField

/**
 * LoginModel
 * create by duxl 2020/9/2
 */
class LoginModel(name: String, pwd: String, context: Context) {

    val n = ObservableField<String>(name)
    val p = ObservableField<String>(pwd)
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
}