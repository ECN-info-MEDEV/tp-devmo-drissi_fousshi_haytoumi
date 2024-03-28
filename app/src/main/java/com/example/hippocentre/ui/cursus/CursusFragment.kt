package com.example.hippocentre.ui.cursus

import SimpleExpandableListAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hippocentre.R
import com.example.hippocentre.databinding.FragmentCursusBinding

// CursusFragment.kt
class CursusFragment : Fragment() {

    private lateinit var adapter: SimpleExpandableListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_cursus, container, false)

        // Dummy data
        val cursusList = listOf(
            CursusItem("Options des cours", listOf(
                "Options disciplinaires",
                "Options professionnelles")),
            CursusItem("Stages", listOf(
                "CME à l'international",
                "CME En France",
                "Sting à l'international",
                "Sting En France",
                "PFE à l'international",
                "PFE En France")),
            CursusItem("Doubles diplômes"),
            CursusItem("FAQ")
        )


        // Set up the adapter
        adapter = SimpleExpandableListAdapter(requireContext(), cursusList)
        val expandableListView = view.findViewById<ExpandableListView>(R.id.cursusExpandableListView)
        expandableListView.setAdapter(adapter)

        return view
    }


override fun onDestroyView() {
        super.onDestroyView()
    var _binding = null
}
}