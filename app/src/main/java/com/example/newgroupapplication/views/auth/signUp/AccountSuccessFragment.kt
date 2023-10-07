package com.example.newgroupapplication.views.auth.signUp

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.newgroupapplication.databinding.FragmentAccountSuccessBinding

class AccountSuccessFragment : Fragment() {

    private lateinit var binding: FragmentAccountSuccessBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountSuccessBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        handleAccountSuccess()
    }

    private fun handleAccountSuccess() {
        val text = "You have created an account successfully. Your account number is 0654321891"

        // Split the text into words
        val words = text.split(" ")
        val lastWord = words.last() // Get the last word

        // Create a SpannableString
        val spannableString = SpannableString(text)

        // Create a StyleSpan to make the last word bold
        val boldSpan = StyleSpan(Typeface.BOLD)

        // Find the start and end positions of the last word
        val startIndex = text.lastIndexOf(lastWord)
        val endIndex = startIndex + lastWord.length

        // Apply the StyleSpan to make the last word bold
        spannableString.setSpan(boldSpan, startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)

        // Set the SpannableString as the text of the TextView
        binding.textView19.text = spannableString
    }

}