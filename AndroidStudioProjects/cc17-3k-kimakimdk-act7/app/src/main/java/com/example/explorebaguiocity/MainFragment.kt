package com.example.explorebaguiocity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.explorebaguiocity.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.clubAndBarButton.setOnClickListener {
            navigateToCategory("Outdoor Activities and Adventure")
        }
        binding.restaurantsButton.setOnClickListener {
            navigateToCategory("Historical and Cultural Sites")
        }
        binding.kidFriendlyButton.setOnClickListener {
            navigateToCategory("Popular Destinations")
        }
        binding.parksButton.setOnClickListener {
            navigateToCategory("Parks")
        }
        binding.shoppingCentersButton.setOnClickListener {
            navigateToCategory("Market Places")
        }
    }

    private fun navigateToCategory(category: String) {
        val action = MainFragmentDirections.actionMainFragmentToCategoryFragment(category)
        findNavController().navigate(action)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
