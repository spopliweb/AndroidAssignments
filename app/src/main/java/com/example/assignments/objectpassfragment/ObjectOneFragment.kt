package com.example.assignments.objectpassfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignments.R
import com.example.assignments.databinding.FragmentObjectOneBinding

class ObjectOneFragment : Fragment() {
    lateinit var empBinding : FragmentObjectOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        empBinding = FragmentObjectOneBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        return empBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        empBinding.objFBtn.setOnClickListener {
            val name = empBinding.objFName.text.toString()
            val address = empBinding.objFAddress.text.toString()
            val phone = empBinding.objFPhone.text.toString()

            val emp = Employee(name, address, phone.toLong())
            val bundle = Bundle()
            bundle.putSerializable("object", emp)
            parentFragmentManager.beginTransaction().add(R.id.fgvObject, ObjectTwoFragment::class.java, bundle)
                .addToBackStack("Two").commit()
        }
    }

}