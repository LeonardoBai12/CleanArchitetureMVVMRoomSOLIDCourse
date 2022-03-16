package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import io.lb.cleanarchiteturemvvmroomsolidcourse.R
import io.lb.cleanarchiteturemvvmroomsolidcourse.databinding.FragmentNotesBinding

class NotesFragment : Fragment() {
    private var _binding: FragmentNotesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNotesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupOnClickAdd()
    }

    private fun setupOnClickAdd() {
        binding.fabAddNote.setOnClickListener {
            findNavController().navigate(R.id.action_Go_to_Detals_Fragment)
        }
    }
}