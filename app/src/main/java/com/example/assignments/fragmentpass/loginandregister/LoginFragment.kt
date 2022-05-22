package com.example.assignments.fragmentpass.loginandregister

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignments.R
import com.example.assignments.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    lateinit var loginBinding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loginBinding = FragmentLoginBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return loginBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        loginBinding.loginBtn.setOnClickListener {
            val user = loginBinding.loginUser.text.toString()
            val pass = loginBinding.loginPass.text.toString()

            if (user != "" && pass != ""){
                loginBinding.loginText.text = "UserName is $user\nPassword is $pass"
            }else{
                loginBinding.loginText.text = "Please enter values"
            }
        }

        loginBinding.registerBtn.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.myLoginFrag, RegisterFragment()).addToBackStack("One").commit()
        }
    }

}