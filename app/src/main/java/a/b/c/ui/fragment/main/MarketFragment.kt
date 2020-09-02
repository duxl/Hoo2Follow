package a.b.c.ui.fragment.main

import a.b.c.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * MarketFragment
 * create by duxl 2020/9/2
 */
class MarketFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_market, container, false)
    }
}