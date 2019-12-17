package com.example.rappdicionario.fragmentos.fragmentoHost


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController

import com.example.rappdicionario.R
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeHostFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home_host, container, false)

        val navHostFragment = childFragmentManager.findFragmentById(R.id.fragmentConteinerSessao_) as NavHostFragment

        view.findViewById<BottomNavigationView>(R.id.bottom_navigation_)
            .setupWithNavController(navController = navHostFragment.navController)

        return view
    }


}
