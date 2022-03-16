package io.lb.cleanarchiteturemvvmroomsolidcourse.feature_note.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import io.lb.cleanarchiteturemvvmroomsolidcourse.R
import io.lb.cleanarchiteturemvvmroomsolidcourse.databinding.FragmentNoteDetailsBinding

class NoteDetailsFragment : Fragment() {
    private var _binding: FragmentNoteDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNoteDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupOnClickAdd()
    }

    private fun setupOnClickAdd() {
        binding.fabSaveNote.setOnClickListener {
            findNavController().navigate(R.id.action_Return_to_Notes_Fragment)
        }
    }
}