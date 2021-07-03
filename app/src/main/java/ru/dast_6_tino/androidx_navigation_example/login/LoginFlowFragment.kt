package ru.dast_6_tino.androidx_navigation_example.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login_flow.*
import ru.dast_6_tino.androidx_navigation_example.R
import android.util.Log

class LoginFlowFragment : Fragment(R.layout.fragment_login_flow) {

    private val navController by lazy { findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        signInButton.setOnClickListener {
            Log.d("DAST", "LoginFlowFragment - signInButton")
            navController.navigate(R.id.action_loginFlowFragment_to_signInFragment)
        }
        signUpButton.setOnClickListener {
            Log.d("DAST", "LoginFlowFragment - signUpButton")
            navController.navigate(R.id.action_loginFlowFragment_to_signUpFragment)
        }
    }

}
