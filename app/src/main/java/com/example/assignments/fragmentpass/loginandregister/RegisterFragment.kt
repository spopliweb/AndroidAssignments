package com.example.assignments.fragmentpass.loginandregister

import android.content.DialogInterface
import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.example.assignments.R
import com.example.assignments.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {
    lateinit var regBinding : FragmentRegisterBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        regBinding = FragmentRegisterBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return regBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        //Email Pattern check
        regBinding.regEmail.setOnFocusChangeListener { view, b ->
            if (!b){
                regBinding.regEmailMain.helperText = validEmail()
            }
        }
        
        //Phone Number check
        regBinding.regPhone.setOnFocusChangeListener { view, b ->
            if (!b){
                regBinding.regPhoneMail.helperText = validPhone()
            }

        }

        //Password Check
        regBinding.regPass.setOnFocusChangeListener { view, b -> 
            if (!b){
                regBinding.regPassMain.helperText = validPass()
            }
        }

        //Username Check
        regBinding.regNmae.setOnFocusChangeListener { view, b ->
            if (!b){
                regBinding.regNameMain.helperText = validUser()
            }
        }

        //Button Click
        regBinding.regBtn.setOnClickListener {
            validForm()
        }
    }


    //User Validation
    private fun validUser(): String? {

        val userText = regBinding.regNmae.text.toString()
        if (!userText.matches(".*[A-Z].*".toRegex())){
            return "Minimum One Capital Letter Required"
        }
        if (!userText.matches(".*[a-z].*".toRegex())){
            return "Minimum One Small Letter Required"
        }
        return null
    }

    //Password Validation
    private fun validPass(): String? {
        val passText = regBinding.regPass.text.toString()

        if(passText.length != 8){
            return "Password must be 8 character"
        }
        if (!passText.matches(".*[A-Z].*".toRegex())){
            return "Minimum on capital letter required"
        }
        if (!passText.matches(".*[a-z].*".toRegex())){
            return "Minimum on small letter required"
        }
        if (!passText.matches(".*[0-9].*".toRegex())){
            return "Minimum one number required"
        }
        if (!passText.matches(".*[@#$%&*/+=].*".toRegex())){
            return "Minimum one special character required"
        }
        return null
    }

    //Phone Validation
    private fun validPhone(): String? {
        val phoneText = regBinding.regPhone.text.toString()
        if (!phoneText.matches(".*[0-9].*".toRegex())){
            return "Must be all digit"
        }
        if (phoneText.length != 10){
            return "Phone Length Must be 10"
        }
        return null
    }

    //Email Validation
    private fun validEmail(): String? {
        val emailText = regBinding.regEmail.text.toString()
        if (!Patterns.EMAIL_ADDRESS.matcher(emailText).matches()){
            return "Invalid Email address"
        }
        return null
    }

    //Valid Form Check
    private fun validForm() {
        val validuUser = regBinding.regNameMain.helperText == null
        val validPhone = regBinding.regPassMain.helperText == null
        val validEmail = regBinding.regEmailMain.helperText == null
        val validPass = regBinding.regPassMain.helperText == null

        if (validuUser && validPass && validEmail && validPhone)
        {
                regBinding.regNmae.setText("")
                regBinding.regEmail.setText("")
                regBinding.regPass.setText("")
                regBinding.regPhone.setText("")

            val message = "Thank You for Registration"
            AlertDialog.Builder(requireActivity()).setTitle("Form Validation")
                .setMessage(message)
                .setPositiveButton("Okay", DialogInterface.OnClickListener { dialogInterface, i ->
                    dialogInterface.dismiss()
                }).create().show()
        }else{
              var message = ""
            if (regBinding.regNameMain.helperText != null){
                message += "\n\nUsername is not Valid"
            }
            if (regBinding.regPassMain.helperText != null){
                message += "\n\nPassword is not Valid"
            }
            if (regBinding.regEmailMain.helperText != null){
                message += "\n\nEmail is not Valid"
            }
            if (regBinding.regPhoneMail.helperText != null){
                message += "\n\nPhone is not Valid"
            }
            AlertDialog.Builder(requireActivity()).setTitle("Form Validation")
                .setMessage(message)
                .setPositiveButton("Okay", DialogInterface.OnClickListener { dialogInterface, i ->
                    dialogInterface.dismiss()
                }).create().show()
        }
    }

}