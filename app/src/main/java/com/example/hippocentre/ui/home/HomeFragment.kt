package com.example.hippocentre.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hippocentre.databinding.FragmentHomeBinding
import androidx.lifecycle.Observer


class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Observing the LiveData for greeting text
        homeViewModel.greeting.observe(viewLifecycleOwner, Observer {
            binding.textViewGreeting.text = it
        })

        // Observing the LiveData for menu items
        homeViewModel.menuItems.observe(viewLifecycleOwner, Observer { items ->
            items.forEach { item ->
                val textView = TextView(context).apply {
                    text = "- $item"
                    layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                    textSize = 16f
                }
                binding.linearLayoutMenuItems.addView(textView)
            }
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
