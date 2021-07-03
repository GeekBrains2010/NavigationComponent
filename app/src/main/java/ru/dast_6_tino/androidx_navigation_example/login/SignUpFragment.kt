package ru.dast_6_tino.androidx_navigation_example.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_sign_up.*
import ru.dast_6_tino.androidx_navigation_example.R
import android.util.Log

class SignUpFragment : Fragment(R.layout.fragment_sign_up) {

    private val navController by lazy { findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toolbar.setNavigationOnClickListener {
            Log.d("DAST", "SignInFragment - backstack")
            navController.popBackStack()
        }
        signUpButton.setOnClickListener {
            Log.d("DAST", "SignInFragment - signUpButton")
            navController.navigate(R.id.action_signUpFragment_to_signInFragment)
        }
    }

}
